import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 118A
public class stringTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = "";

        for ( int i = 0; i < input.length(); i++ ) {
            if ( "AEIOUYaeiouy".indexOf(input.charAt(i)) != -1 ) {
                continue;
            } else {
                output += "." + Character.toLowerCase(input.charAt(i));
            }
        }

        System.out.println(output);
    }
}