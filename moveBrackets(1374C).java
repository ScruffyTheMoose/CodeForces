// reminder to use BufferedReader with java when able as it's significantly faster. Difference of ~80ms for completion between br and sc.

import java.io.*;

// 1374C
public class moveBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String p;
        int n;
        int c;
        int tc;
        
        for ( int i = 0; i < t; i++ ) {
            // catching inputs
            n = Integer.parseInt(br.readLine());
            p = br.readLine();
            tc = 0;
            c = 0;

            // iterating through string
            for ( int j = 0; j < n; j++ ) {

                // using companion variable to track balance of string
                if ( p.charAt(j) == '(' ) {
                    c++;
                } else if ( p.charAt(j) == ')' ) {
                    c--;
                }

                // moving closing bracket to end, adding to count, and holding current index
                if ( c < 0 ) {
                    p = p.substring(0, j) + p.substring(j+1) + ")";
                    c = 0;
                    j--;
                    tc++;
                }   
            }

            System.out.println(tc);

        }
    }
}
