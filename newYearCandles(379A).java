import java.util.Scanner;
// 379A
public class newYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = 0;
        int d = 0;
        int hrs = a;

        while ( a >= b ) {

            d = a / b;
            l = a % b;
            hrs += d;
            a = d + l;

        }

        System.out.println(hrs);

        sc.close();
    }
}
