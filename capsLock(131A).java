import java.io.*;
// 131A
public class capsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean stat = true;

        for ( int i = 1; i < input.length(); i++ ) {
            if ( Character.isLowerCase(input.charAt(i)) ) {
                stat = false;
            }
        }

        if ( stat == true ) {
            for ( int i = 0; i < input.length(); i++ ) {
                if ( Character.isLowerCase(input.charAt(i)) ) {
                    System.out.print(Character.toUpperCase(input.charAt(i)));
                } else {
                    System.out.print(Character.toLowerCase(input.charAt(i)));
                }
            }
        } else {
            System.out.print(input);
        }
    }
}
