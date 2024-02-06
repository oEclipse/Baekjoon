import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int sum = 0;

        for(int i=1; i<=num; i++) {
            sum+=i;
        }

        System.out.print(sum);
    }
}