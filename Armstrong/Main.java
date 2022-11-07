package Armstrong;

public class Main {
    public static void main(String[] args) {
        int num = 153; int t = num; int cube = 0; 
        while(t>0){
            int lastDigit = t % 10;
             cube += Math.pow(lastDigit,3);
             t /= 10;


        } 
        System.out.println(cube);
        

    }
}
