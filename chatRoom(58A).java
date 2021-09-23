import java.io.*;
// 58A
public class chatRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // count of each letter
        int h = 0;
        int e = 0;
        int l = 0;
        int o = 0;

        // Iterating through string once and counting occurrences in order of desired letters
        for ( int i = 0; i < input.length(); i++ ) {
            if ( h == 0 ) {
                if ( input.charAt(i) == 'h' ) {
                    h++;
                }
            } else if ( e == 0 & h == 1 ) {
                if ( input.charAt(i) == 'e' ) {
                    e++;
                }
            } else if ( l < 2 & e == 1 ) {
                if ( input.charAt(i) == 'l' ) {
                    l++;
                }
            } else if ( o == 0 & l == 2 ) {
                if ( input.charAt(i) == 'o' ) {
                    o++;
                }
            }
        }

        // Validating results of iteration and printing result
        if ( h == 1 && e == 1 && l == 2 && o == 1 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
