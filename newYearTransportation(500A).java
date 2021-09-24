import java.util.Scanner;
// 500A
public class newYearTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n-1];

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }

        int j = 0;
        while ( j < t - 1 ) {
            j = (j) + arr[j];
        }

        if ( j + 1 == t ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
