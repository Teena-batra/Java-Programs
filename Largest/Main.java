package Largest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a>b && b>c)
           System.out.println("a is larger");
        else if(b>c)
            System.out.println("b is larger");
        else 
           System.out.println("c is larger");    





    
    }
    
}
