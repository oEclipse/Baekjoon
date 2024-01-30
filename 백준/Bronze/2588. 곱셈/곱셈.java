import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bf.readLine());
        String[] num2 = bf.readLine().split("");

        int result1 = num1*Integer.parseInt(num2[2]);
        int result2 = num1*Integer.parseInt(num2[1]);
        int result3 = num1*Integer.parseInt(num2[0]);
        int result4 = result1+result2*10+result3*100;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.print(result4);
    }
}
