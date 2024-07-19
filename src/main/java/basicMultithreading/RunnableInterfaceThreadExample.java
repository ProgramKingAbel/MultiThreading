package main.java.basicMultithreading;

public class RunnableInterfaceThreadExample {
    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());
        Thread three = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 18; i++) {
                    System.out.println("This is runnable three " + i);
                }
            }
        });

        one.start();
        two.start();
        three.start();

    }
}

class ThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("This is thread ONE " + i);
        }
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("This is thread TWO " + i);
        }
    }
}