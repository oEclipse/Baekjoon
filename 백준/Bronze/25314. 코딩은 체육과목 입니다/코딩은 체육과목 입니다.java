import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(bf.readLine());

        for(int i=0; i < (num/4); i++) {
            sb.append("long ");
        }

        sb.append("int");
        System.out.print(sb);
    }
}