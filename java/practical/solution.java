import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] a;
        a = A.toCharArray();
        int flag = 0;
        for(int i =0;i<a.length/2;i++){
            if(a[i]!=a[a.length-i-1]){
                System.out.println("No");
                break;
            }

            else{
                flag =1;
            }

        }
        if(flag==1){
            System.out.println("Yes");
        }
        
        /* Enter your code here. Print output to STDOUT. */

    }
}



