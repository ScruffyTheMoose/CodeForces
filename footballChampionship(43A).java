import java.io.*;
// 43A
public class footballChampionship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // By default we give the first team a point since there is a guaranteed winner.
        int t1 = 1;
        int t2 = 0;

        // Taking first team name and declaring variables to store/compare subsequent names
        String a = br.readLine();
        String c;
        String b = "";

        // Iterating n-1 times, comparing new team name with known team.
        // We then keep track of team scores from here until loop is finished.
        for ( int i = 1; i < n; i++ ) {
            c = br.readLine();
            if ( c.equals(a) ) {
                t1++;
            } else {
                b = c;
                t2++;
            }
        }

        // Printing team with highest score. Ez pz.
        if ( t1 > t2 ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
