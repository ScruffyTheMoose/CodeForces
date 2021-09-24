import java.util.Scanner;
// 1342A
public class roadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        long x;
        long y;
        long a;
        long b;
        long c;

        for ( int i = 0; i < t; i++ ) {

            x = sc.nextInt();
            y = sc.nextInt();
            sc.nextLine();
            a = sc.nextInt();
            b = sc.nextInt();
            c = 0;

            if ( x < y ) {
                c += x * b + (y - x) * a;
            } else if ( y < x ) {
                c += y * b + (x - y) * a;
            } else {
                c += x * b;
            }

            if ( (x + y) * a < c ) {
                c = (x + y) * a;
            }

            System.out.println(c);

        }
        sc.close();
    }
}
