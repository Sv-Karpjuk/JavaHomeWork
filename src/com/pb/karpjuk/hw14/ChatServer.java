package com.pb.karpjuk.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    private static String NowDtTm() {
        return LocalDateTime.now().toString().substring(0,19).replace("T"," ") + " | ";
    }

    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try {
                System.out.println(NowDtTm() + "Подключен клиент: " + Thread.currentThread().getName());

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String clientMessage;

                while ((clientMessage = in.readLine()).length() != 0) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        System.out.println(NowDtTm() + "Отключен клиент: " + Thread.currentThread().getName());
                        break;
                    }
                    String nowDtTm = NowDtTm();
                    out.println(nowDtTm + clientMessage);
                    System.out.println(nowDtTm + Thread.currentThread().getName() + ": " + clientMessage);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int port = 1357;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println(NowDtTm() + "Сервер запущен на порту: " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // В цикле ждем запроса клиента
        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new Handler(clientSocket));
        }
    }
}


