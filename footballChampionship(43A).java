import java.io.*;
// 43A
public class footballChampionship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int t1 = 1;
        int t2 = 0;

        String a = br.readLine();
        String c;
        String b = "";

        for ( int i = 1; i < n; i++ ) {
            c = br.readLine();
            if ( c.equals(a) ) {
                t1++;
            } else {
                b = c;
                t2++;
            }
        }

        if ( t1 > t2 ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
