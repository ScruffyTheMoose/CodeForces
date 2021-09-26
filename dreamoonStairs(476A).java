// Important to remember that we are starting with a maximum possiblity of n steps, with a minimum of n/2 steps. We need to find the lowest possible number in that range.
// Let's work down from the max.


import java.io.*;
import java.util.StringTokenizer;
// 476A
public class dreamoonStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        
        // Taking inputs. Adding +1 to stairs so that when we take n/2, it is an over estimate rather than under.
        int n = Integer.parseInt(tk.nextToken()) + 1;
        int m = Integer.parseInt(tk.nextToken());
        
        // Giving sentinel value to t so we can tell if no target number is actually achieved.
        int ct = n;
        int t = -1;

        // Iterating through possible step counts from (n, n/2).
        // We work our way down from the max, so we start with n single steps. We then remove 2 single steps and add 1 double step each iteration.
        // After reducing our count, we check if it's divisable by m.
        // We continue all the way until all possiblities are exhausted and print result of either -1 or a step count.
        while ( ct > n / 2 ) {

            ct--;
            if ( ct % m == 0 ) {
                t = ct;
            }

        }

        System.out.println(t);

    }
}
