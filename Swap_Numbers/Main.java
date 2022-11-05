package Swap_Numbers;

public class Main {
    public static void main(String[] args) {
        swap(5,6);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);
    }

       
}
