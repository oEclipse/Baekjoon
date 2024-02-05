import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(bf.readLine());

        if(min + time >= 60) {
            hour += (min + time)/60;
            min = (min + time)%60;
            if(hour>23) {
                hour -= 24;
            }
        } else {
            min += time;
        }

        System.out.print(hour + " " + min);
    }
}