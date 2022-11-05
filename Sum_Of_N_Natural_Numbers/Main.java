package Sum_Of_N_Natural_Numbers;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i += 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
