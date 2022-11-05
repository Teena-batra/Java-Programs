package Input;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a; float b; double c; short d; byte e; boolean f;  long h;
        String str;
        Scanner obj = new Scanner(System.in);
            a = obj.nextInt();
            b = obj.nextFloat();
            c = obj.nextDouble();
            d = obj.nextShort();
            e = obj.nextByte();
            f = obj.nextBoolean();
            h = obj.nextLong();
            str = obj.next();
        
        System.out.println("Integer = "+a);
        System.out.println("Float = "+b);
        System.out.println("Double = "+c);
        System.out.println("Short = "+d);
        System.out.println("Byte = "+e);
        System.out.println("boolean = "+f);
        System.out.println("Long = "+h);
        System.out.println("string = "+ str);
    }
}