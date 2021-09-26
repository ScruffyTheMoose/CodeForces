// Need to determine whether our character can successfully defeat all of the dragons. We achieved this by organizing the dragons in ascending order and working from there.


import java.util.Scanner;
// 230A
public class dragons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initializing player stats, num dragons, and array to store/sort dragon stats
        int str = scan.nextInt();
        int n = scan.nextInt();
        int[][] stats = new int[n][2];

        // Loop to place dragon stats in 2D array. First dragon strength lvl then bonus on kill
        for ( int i = 0; i < n; i++ ) {
            stats[i][0] = scan.nextInt();
            stats[i][1] = scan.nextInt();
        }

        // Used selection sort to put 2D array in order from lowest to highest, relatively slow =( but it works because n <= 1000
        // If n were to grow significantly higher we would need to move to merge sort or something more efficient but this works fine given our limits
        for ( int i = 0; i < n; i++ ) {
            int min = i;
            for ( int j = i + 1; j < n; j++ ) {
                if ( stats[min][0] > stats[j][0] ) {
                    min = j;
                }
            }
            // Using hold variables to switch both strenght lvl and bonus to the same index of the 2D array.
            int holdstr = stats[min][0];
            int holdbon = stats[min][1];
            stats[min][0] = stats[i][0];
            stats[min][1] = stats[i][1];
            stats[i][0] = holdstr;
            stats[i][1] = holdbon;
        }

        // Now that we are sorted, we can iterate through and determine whether our player can defeat all dragons.
        // If at any point we reach a dragon that we cannot beat, return result and close out so we don't waste any more time.
        for ( int i = 0; i < n; i++ ) {
            if ( str > stats[i][0] ) {
                str += stats[i][1];
            } else {
                scan.close();
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        scan.close();
    }
}
