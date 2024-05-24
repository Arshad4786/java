public class test extends Thread{

    public void run() {
        try {

    for (int i =0;i<5;i++)
            System.out.println("Child class :" + i );
        Thread.sleep(500);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        test t = new test();
        t.start();
        t.join();


        try {
            for (int i =0;i<5;i++)
                System.out.println("main class :"+ i);
            Thread.sleep(500);
        } catch (Exception e){
            System.out.println(e);
        }
    }


}

