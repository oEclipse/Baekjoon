import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int howmany = Integer.parseInt(bf.readLine());
        int[] nums = new int[2];
        int[] sums = new int[howmany];

        for(int i=0; i<howmany; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            sums[i] = nums[0]+nums[1];
        }

        for(int sum:sums) {
            System.out.println(sum);
        }
    }
}