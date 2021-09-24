import java.io.*;
import java.util.StringTokenizer;
// 476A
public class dreamoonStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken()) + 1;
        int m = Integer.parseInt(tk.nextToken());
        
        int ct = n;
        int t = -1;

        while ( ct > n / 2 ) {

            ct--;
            if ( ct % m == 0 ) {
                t = ct;
            }

        }

        System.out.println(t);

    }
}
