import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int repeat = num/4;

        for(int i=0; i<repeat; i++) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}