class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " started.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + getName() + " counting: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " interrupted.");
        }
        System.out.println("Thread " + getName() + " finished.");
    }
}

public class main2 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Demonstrate setName and getName methods
        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 name: " + thread2.getName());

        // Demonstrate setPriority and getPriority methods
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 1 priority: " + thread1.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());

        // Demonstrate join method
        try {
            thread1.start();
            thread1.join(); // Wait for thread1 to finish before proceeding
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrate suspend and resume methods
        thread2.suspend(); // Suspend thread2
        System.out.println("Thread 2 suspended.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.resume(); // Resume thread2
        System.out.println("Thread 2 resumed.");
    }
}
