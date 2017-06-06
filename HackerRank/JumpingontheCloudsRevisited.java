package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class JumpingontheCloudsRevisited {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=k;
        int e=100;
        while (i!=0){
            if(i>=n){
                i=i%n;
                if(i==0) {
                    if (c[i] == 1) {
                        e = e - 3;
                    } else {
                        e = e - 1;
                    }
                    break;
                }
            }
            if(c[i]==1){
                e=e-3;
            } else {
                e=e-1;
            }
            i=i+k;
            if(i>=n){
                i=i%n;
                if(i==0) {
                    if (c[i] == 1) {
                        e = e - 3;
                    } else {
                        e = e - 1;
                    }
                    break;
                }
            }
        }
        System.out.println(e);
    }
}
