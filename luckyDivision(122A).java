// I don't honestly believe that this is the most elegant way of solving this problem but it certainly works and I think it's easy to follow.


import java.io.*;
// 122A
public class luckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean luck = true;

        // Checking all possible lucky multiples under 1000 as 1<n<1000
        if ( Integer.parseInt(input) % 4 == 0 || Integer.parseInt(input) % 7 == 0 || Integer.parseInt(input) % 47 == 0 || Integer.parseInt(input) % 74 == 0 ) {
            //continues
        } else {
            // checking for a purely lucky number series of digits. If false, end loop and save some time.
            for ( int i = 0; i < input.length(); i++ ) {
                if ( input.charAt(i) != '4' && input.charAt(i) != '7' ) {
                    luck = false;
                    break;
                }
            }
        }

        if ( luck ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
