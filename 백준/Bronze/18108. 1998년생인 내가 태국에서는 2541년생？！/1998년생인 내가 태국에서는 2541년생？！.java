import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int bulgi = Integer.parseInt(bf.readLine());
        System.out.print(bulgi-543);
    }
}