package Count_Digits;
import java.util.Scanner;
public class Main {

    public static void countDigits1(int n) {
    int   count=0;
    while (n>0) {
        n /= 10;
        count++;
    }
    System.out.println(count);
    }
    public static void countDigits2(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
            
        } while (n>0);
        System.out.println(count);
    }
    public static void countDigits3(int n) {
        int count = 0;
        for (int index = n; index>0; index/=10) {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        countDigits3(n);
    }
}
