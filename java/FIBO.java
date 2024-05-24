import java.util.Scanner;

class FibonacciGenerator extends Thread {
    private int[] fibonacciSequence;
    private int count;

    public FibonacciGenerator(int count) {
        this.count = count;
        fibonacciSequence = new int[count];
    }

    @Override
    public void run() {
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        for (int i = 2; i < count; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
    }

    public int[] getFibonacciSequence() {
        return fibonacciSequence;
    }
}

public class FIBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();

        FibonacciGenerator fibonacciThread = new FibonacciGenerator(count);
        fibonacciThread.start();

        try {
            fibonacciThread.join(); // Wait for fibonacciThread to finish execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] fibonacciSequence = fibonacciThread.getFibonacciSequence();

        System.out.println("Generated Fibonacci sequence:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
