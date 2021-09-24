import java.util.Scanner;
// 339B
public class xeniaRingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ct = 0; // needs to be type long as answers can exceed 4 * 10^9
        int[] g = new int[m];

        for ( int i = 0; i < m; i++ ) {
            g[i] = sc.nextInt();
        }

        // checking if start point is first stop, and if not, assigning value
        if ( g[0] != 1 ) {
            ct += Math.abs(1 - g[0]);
        }

        // iterating through values and determining steps per stop
        // if next stop > current stop -> n - diff
        // if next stop < current stop -> diff
        // if next stop is current -> 0
        for ( int i = 0; i < m-1; i++ ) {
            if ( g[i] < g[i+1] ) {
                ct += Math.abs(g[i] - g[i+1]);
            } else if ( g[i] > g[i+1] ) {
                ct += n - Math.abs(g[i] - g[i+1]);
            } else if ( g[i] == g[i+1] ) {
                ct += 0;
            }
        }

        System.out.println(ct);
        sc.close();
    }
}
