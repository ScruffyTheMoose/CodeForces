import java.io.*;
// 122A
public class luckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean luck = true;

        // All possible lucky combos under 1000 as 1<n<1000
        if ( Integer.parseInt(input) % 4 == 0 || Integer.parseInt(input) % 7 == 0 || Integer.parseInt(input) % 47 == 0 || Integer.parseInt(input) % 74 == 0 ) {
            //continues
        } else {
            // checking for a purely lucky number series of digits
            for ( int i = 0; i < input.length(); i++ ) {
                if ( input.charAt(i) != '4' && input.charAt(i) != '7' ) {
                    luck = false;
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
