import java.util.Scanner;
// 230A
public class dragons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
        int n = scan.nextInt();
        int[][] stats = new int[n][2];

        for ( int i = 0; i < n; i++ ) {
            stats[i][0] = scan.nextInt();
            stats[i][1] = scan.nextInt();
        }

        // used selection sort here, very slow =( but it works because n <= 1000
        for ( int i = 0; i < n; i++ ) {
            int min = i;
            for ( int j = i + 1; j < n; j++ ) {
                if ( stats[min][0] > stats[j][0] ) {
                    min = j;
                }
            }
            int holdstr = stats[min][0];
            int holdbon = stats[min][1];
            stats[min][0] = stats[i][0];
            stats[min][1] = stats[i][1];
            stats[i][0] = holdstr;
            stats[i][1] = holdbon;
        }

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
