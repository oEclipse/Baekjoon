import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int num[] = {num1, num2, num3};
        int price;
        int max = 0;

        if(num1==num2 && num2==num3) {
            price = 10000 + num1 * 1000;
        } else if(num1==num2|num2==num3|num1==num3) {
            if(num1==num2) {
                price = 1000 + num1 * 100;
            } else if(num2==num3) {
                price = 1000 + num2 * 100;
            } else {
                price = 1000 + num1 * 100;
            }
        } else {
            for(int i=0; i<3; i++) {
                if(num[i]>max) {
                    max = num[i];
                }
            }
            price = max*100;
        }

        System.out.print(price);
    }
}