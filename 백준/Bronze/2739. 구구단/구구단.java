import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for(int i=1; i<10; i++) {
            System.out.printf(num+" * "+i+" = %d \n", num*i);
        }
    }
}