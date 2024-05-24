import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffereader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("ENter age");
        String age = br.readLine();
        int age1 = Integer.parseInt(age);
        System.out.println(age);

    }
}
