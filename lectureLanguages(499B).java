// Probably not the most efficient solution but it works well and was easy to throw together. Description of process below.

import java.io.*;
import java.util.StringTokenizer;
// 499B
public class lectureLanguages {
    public static void main(String[] args) throws IOException {
        // I used BufferedReader and tokenizer since I figured a little bit of speed in the sysin would help out speed since linear search is slow.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        // Taking input of sentence length and number of word pairs
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        // Initializing 2D array for word pairs, array for sentence to translate, and translated sentence for storing output
        String[][] pairs = new String[m][2];
        String[] line = new String[n];
        String output = "";

        // Storing word pairs
        for ( int i = 0; i < m; i++ ) {

            pairs[i] = br.readLine().split(" ");

        }

        // Storing sentence
        line = br.readLine().split(" ");


        // Iterating through sentence word-by-word
        for ( int k = 0; k < n; k++ ) {

            String s = line[k];

            // Searching for word k, finding match, and choosing shortest match with a linear search.
            for ( int i = 0; i < m; i++ ) {

                if ( s.equals(pairs[i][0]) || s.equals(pairs[i][1]) ) {
                    if ( pairs[i][0].length() == pairs[i][1].length() ) {
                        output += pairs[i][0] + " ";
                    } else if ( pairs[i][0].length() < pairs[i][1].length() ) {
                        output += pairs[i][0] + " ";
                    } else {
                        output += pairs[i][1] + " ";
                    }
                }

            }
            
        }

        System.out.println(output);

    }
}
