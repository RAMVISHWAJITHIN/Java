import java.util.*;

//using while loop
public class NaturalNumbers{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter number");
        int a=sc.nextInt();
        int i=a;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }

}