import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int howmany = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<howmany; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}