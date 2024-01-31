import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());
        int quadrant;

        if(num1>0) {
            if(num2>0) {
                quadrant = 1;
            } else {
                quadrant = 4;
            }
        } else {
            if(num2>0) {
                quadrant = 2;
            } else {
                quadrant = 3;
            }
        }

        System.out.print(quadrant);
    }
}