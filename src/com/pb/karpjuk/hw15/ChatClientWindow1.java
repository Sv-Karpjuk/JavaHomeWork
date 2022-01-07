package com.pb.karpjuk.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClientWindow1 extends JFrame implements ActionListener {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    String serverIp = "127.0.0.1";
    int serverPort = 1234;

    Socket server = new Socket(serverIp, serverPort);
    BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
    PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);
    BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ChatClientWindow1();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private final JPanel panel = new JPanel(null);
    private final JTextArea log = new JTextArea(15,20);
    private final JScrollPane scroll = new JScrollPane(log);
    private final JTextField fieldNickName = new JTextField("User1");
    private final JTextField fieldNInput = new JTextField();

    private ChatClientWindow1() throws IOException {

        this.setSize(400, 400);
        this.setLocation(0, 0);
        setResizable(false);
        setTitle("iЧат");
        JPanel painel = new JPanel(null);

        log.setBounds(5, 35, 350, 300);
        log.setLineWrap(true);
        log.setEditable(false);
        log.setWrapStyleWord(true);
        scroll.setBounds(5, 5, 350, 300);
        painel.add(scroll);

        fieldNInput.addActionListener(this);
        add(fieldNInput, BorderLayout.SOUTH);
        add(fieldNickName, BorderLayout.NORTH);

        this.add(painel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldNInput.getText();
        if (msg.equals("")) {
            return;
        }
        fieldNInput.setText(null);
        outServer.println(fieldNickName.getText() + ": " + msg);
        String dataFromServer = null;
        try {
            dataFromServer = inServer.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        log.append(dataFromServer + "\n");
    }
}
