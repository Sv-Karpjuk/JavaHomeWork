package com.pb.karpjuk.hw13_test.s06waitnotify.example1;

public class Notifier implements Runnable {

    private final Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                //msg.setMsg(name + " поток Notifier отработал");
                msg.notify();
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
