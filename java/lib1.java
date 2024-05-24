import bookmanager.library;
import java.util.*;

public class lib1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
library man = new library();
System.out.println("Enter the book issue" );
System.out.println("Enter day" );
int a,b,c;
a=sc.nextInt();
System.out.println("Enter month" );
b=sc.nextInt();
System.out.println("Enter year" );
c=sc.nextInt();

man.bookissue(a,b,c);
}
}