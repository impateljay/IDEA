package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class BirthdayChocolate {
    static int getWays(int[] squares, int d, int m){
        int count=0;
        for (int s=0;s<squares.length-(m-1);s++) {
            int sum = 0;
            for (int i=s;i<s+m;i++){
                sum += squares[i];
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
