package HackerRank;

import java.util.Scanner;

/** DONE
 * Created by Jay Patel on 4/5/17.
 */
public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int misMatchChars=0;
        for (int i=0;i<S.length();i=i+3){
            if(S.charAt(i)!='S'){
                misMatchChars++;
            }
            if(S.charAt(i+1)!='O') {
                misMatchChars++;
            }
            if(S.charAt(i+2)!='S') {
                misMatchChars++;
            }
        }
        System.out.println(misMatchChars);
    }
}
