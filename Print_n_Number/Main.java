package Print_n_Number;

public class Main {

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1); // print(4)
    }
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
}
