import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int repeat = Integer.parseInt(br.readLine());

        for(int i=0; i<repeat; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.append(Integer.toString((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}