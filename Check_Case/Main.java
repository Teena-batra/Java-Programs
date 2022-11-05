package Check_Case;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char a;
        Scanner obj = new Scanner(System.in);
        a = obj.next().charAt(0);
        if(a>='a' && a<='z')
        System.out.println("lower case");
        else if(a>='A' && a<='Z')
        System.out.println("upper case");
        else 
        System.out.println("not a character");
                
    }
}
