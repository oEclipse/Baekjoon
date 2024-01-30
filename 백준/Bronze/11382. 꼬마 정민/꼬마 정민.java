import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bf.readLine().split(" ");
        long num1 = Long.parseLong(nums[0]);
        long num2 = Long.parseLong(nums[1]);
        long num3 = Long.parseLong(nums[2]);

        System.out.print(num1+num2+num3);
    }
}