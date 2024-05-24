
public class sleep extends Thread {
    public  void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        sleep m1 = new sleep();
        sleep m2 =new sleep();
        m1.start();
        m2.start();
    }
}