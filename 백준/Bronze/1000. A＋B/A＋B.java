import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum = 0;
        boolean input_true = false;

        while(!input_true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(0<a && a<10 && 0<b && b<10) {
                input_true = true;
            }
            sum = a+b;
        }
        
        System.out.print(sum);
    }
}