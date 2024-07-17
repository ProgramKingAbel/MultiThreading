package main.java.sequential;

public class SequentialExecution {
    public static void main(String[] args) {
        demo1();
        demo2();
    }
    private static void demo1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From demo 1 " + i);
        }
    }

    private static void demo2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is from demo 2 " + i);
        }
    }

}

// All programs run sequentially by default unless instructed otherwise
