class PrintPattern extends Thread {
    private String pattern;
    private int repetitions;

    public PrintPattern(String pattern, int repetitions) {
        this.pattern = pattern;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        for (int i = 0; i < repetitions; i++) {
            System.out.print(pattern);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to create a small delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        PrintPattern patternThread1 = new PrintPattern("/*", 10);
        PrintPattern patternThread2 = new PrintPattern("/*", 10);

        patternThread1.start();
        patternThread2.start();
    }
}
