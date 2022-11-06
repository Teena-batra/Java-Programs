package Temperature_Convert;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int F,C;
        Scanner obj1 = new Scanner(System.in);
        C = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        F = obj2.nextInt();
        FarToCel(F);
        CelToFar(C);
    }
      static  void FarToCel( int F){
            int C1 = 5*(F-32)/9;
            System.out.println(+C1);

        }
        static void CelToFar(int C){
         int F1 = C*9/5+32;
         System.out.println(F1);
        }


        
        
    
}
