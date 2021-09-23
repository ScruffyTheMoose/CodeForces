import java.util.Scanner;
// 479A
public class expression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        int tot1 = first + second + third;
        int tot2 = (first + second) * third;
        int tot3 = first * (second + third);
        int tot4 = first * second * third;

        System.out.println(Math.max(Math.max(tot1, tot2), Math.max(tot3, tot4)));
        scan.close();
    }
}
