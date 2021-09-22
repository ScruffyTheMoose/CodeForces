/*
This is the solution to the CodeForces 61A challenge. This challenge gives the user two lines of '1' and '0' characters of length 1 <= n <= 100.
The user needs to sort them where any two similar characters that fall into the same index become '0', and any index where characters differ between
the two strings will become '1'.
It is a very easy problem and can be solved with two check statements.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 61A
public class fastBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineOne = br.readLine();
        String lineTwo = br.readLine();
        String result = "";

        for ( int i = 0; i < lineOne.length(); i++ ) {
            if ( lineOne.charAt(i) == lineTwo.charAt(i) ) {
                result += '0';
            } else {
                result += '1';
            }
        }
        System.out.println(result);
    }
}