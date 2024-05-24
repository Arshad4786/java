import java.util.Scanner;

class fiboseq extends Thread{

    public int[] series;
    public int count;
    public fiboseq(int count){
        this.count = count;
        series = new int[count];
    }

    public void run(){
        series[0]= 0;
        series[1]=1;
        for (int i =2;i<count;i++){
            series[i]= series[i-1] + series[i-2];
        }

    }
    public int[] getSeries(){
        return series;
    }

}


public class fibo {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int count = sc.nextInt();

        fiboseq seq = new fiboseq(count);
        seq.start();
        seq.join();
        int[] series = seq.getSeries();

        for (int j =0 ; j< count; j++){
            System.out.println(series[j] + " " );
        }

    }
}
