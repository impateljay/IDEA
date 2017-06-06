package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class DrawingBook {
    static int solve(int n, int p){
        int middle = n%2==0 ? (n+1)/2 : n/2;
        int a = n-p>middle ? p/2 : (n-p)/2;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
