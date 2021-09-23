/*
This is the codeforces 486A challenge. It asks for the user to solve the series n(-1)^n.
Using the Limit Ratio Test and the Alternating Series Test you can quickly validate that this is a non convergent series as n grows large beyond bound.
I was able to find a pattern by writing out the first ~10 terms in the series and examining the values of the sums at each n value.
If the value of n is even -> n / 2
If the value of n is odd -> (-1)(n + 1 / 2)

It is required to identify this pattern in the sequence.
The time limit is 1000ms per test, so actually summing the values of each element in the series is impossible as 1 <= n <= 10^15.

Using BufferedReader increased the spead of the tests by ~20ms on average over Scanner.
*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 486A
public class calcSeries {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        if ( n % 2 == 0 ) {
            System.out.println(n/2);
        } else {
            System.out.println(-1 * (n + 1) / 2);
        }
    }
}
