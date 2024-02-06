import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(bf.readLine());
        int totalNumber = Integer.parseInt(bf.readLine());
        int comparePrice = 0;

        StringTokenizer st;

        for(int i=0; i<totalNumber; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            comparePrice += price*number;
        }

        if(totalPrice==comparePrice) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}