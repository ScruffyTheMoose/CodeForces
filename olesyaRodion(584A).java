import java.io.*;
import java.util.StringTokenizer;
// 584A
public class olesyaRodion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        String t = tk.nextToken();
        

        if ( t.length() > n ) {
            System.out.println(-1);
        } else {

            while ( t.length() != n ) {
                t += "0";
            }

            System.out.println(t);

        }
    }
}
