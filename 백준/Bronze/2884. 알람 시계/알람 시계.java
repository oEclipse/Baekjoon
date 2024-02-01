import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if(min>=45) {
            min -= 45;
        } else {
            if(hour==0) {
                hour = 24;
            }
            hour -= 1;
            min += 60;
            min -= 45;
        }

        System.out.print(hour+" "+min);
    }
}