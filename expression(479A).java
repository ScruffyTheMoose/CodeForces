// Easiest one on the entire website. Let's have a look.

import java.util.Scanner;
// 479A
public class expression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initializing our 3 integer values and taking input
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        // There are only 4 possible combinations so we will try them all
        int tot1 = first + second + third;
        int tot2 = (first + second) * third;
        int tot3 = first * (second + third);
        int tot4 = first * second * third;

        // Finding max of 4 results
        System.out.println(Math.max(Math.max(tot1, tot2), Math.max(tot3, tot4)));
        scan.close();
    }
}
