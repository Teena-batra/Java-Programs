package Sum_Of_N_Natural_Numbers;

import java.util.Scanner;

public class Main {

    public static void sum(int n) {
        System.out.println(n * ((n + 1) / 2));
    }

    public static void main(String[] args) {
        sum(5);
    }
}
