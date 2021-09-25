// I looked for more efficient solutions after solving this and all the explanations were lacking so I'll leave some notes here for anyone who comes along.

import java.io.*;
// 1353C
public class boardMoves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Make sure the variables you use will be Longs as the numbers grow to around 5 x 10^15
        int t = Integer.parseInt(br.readLine());
        long n;
        long sum;

        // Iterating through the inputs one at a time and printing results
        for ( int i = 0; i < t; i++ ) {

            // Taking input value
            n = Long.parseLong(br.readLine());

            // This part requires that you write out the first few layers of the board.
            // You will find that the side length of each layer corresponds to the number of items in that layer by [ 8 * (n-1) / 2 ]
            // You will also find that the number of moves per-individual item in a given layer will take [ (n-1) / 2 ] moves to get to the center

            // First step, let's simplify n to the value that we used regularly in the above equations
            n = (n - 1)/2;

            // Resetting the value of sum to zero for each iteration
            sum = 0;

            // By combining the 'moves per item' and 'items per layer' equations, we get a very simple equation that we can quickly iterate through.
            // Using our simplified value of n, we iterate through the loop n times, and end with a sum of the total required moves.
            for ( Long j = n; j > 0; j-- ) {
                sum += (j * 8) * j;
            }

            System.out.println(sum);

        }
    }
}
