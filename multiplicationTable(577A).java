import java.io.*;
import java.util.StringTokenizer;
// 577A
public class multiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tk.nextToken());
        long x = Integer.parseInt(tk.nextToken());
        int ct;

        if ( n >= x ) {
            ct = 1;
        } else {
            ct = 0;
        }

        for ( int i = 2; i <= n; i++ ) {
            if ( x % i == 0 && x / i <= n ) {
                ct++;
            }
        }

        System.out.println(ct);

    }
}
