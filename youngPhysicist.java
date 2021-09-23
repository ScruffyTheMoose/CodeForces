import java.util.Scanner;
// 69A
public class youngPhysicist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for ( int i = 0; i < n; i++ ) {
            sum1 += scan.nextInt();
            sum2 += scan.nextInt();
            sum3 += scan.nextInt();
        }

        if ( sum1 != 0 || sum2 != 0 || sum3 != 0 ) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        scan.close();
    }
}
