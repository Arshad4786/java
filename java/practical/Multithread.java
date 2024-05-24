class MultithreadingDemo extends Thread {
public void run()
 {
 for (int i=0;i<5;i++)
{
System.out.println("DJSCE IOT");
}
 }
}

// Main Class
public class Multithread {
 public static void main(String[] args)
 { for (int i=0;i<5;i++)
{
System.out.println("BEST STUDENTS");
 MultithreadingDemo object = new MultithreadingDemo();
 object.start();
}
 }
 }

