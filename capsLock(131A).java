// The instructions for this challenge hint to the fact that the solution to each input will be based on the capitalization of the characters in the body of the string, excluding the first character.


import java.io.*;
// 131A
public class capsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading input and setting boolean
        String input = br.readLine();
        boolean stat = true;

        // If any character in the body isn't capitalized, by default we can just ignore the word entirely so we set out status to false.
        for ( int i = 1; i < input.length(); i++ ) {
            if ( Character.isLowerCase(input.charAt(i)) ) {
                stat = false;
            }
        }

        // If all of the letters from (1, n) were capitalized, we just need to invert all of the characters' capitalization. Otherwise we print the original string.
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
