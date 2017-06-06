package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class StringInterpolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        StringInterpolation stringInterpolation = new StringInterpolation();
        boolean b = stringInterpolation.hasInterpolatedString(s1,s2,s3);
        System.out.print(b);
    }

    private boolean hasInterpolatedString(String s1,String s2,String s3){
        if(s3.length()==s1.length()+s2.length()) {
            int i = 0, j = 0;
            for (int k=0;k<s3.length();k++){
                if(i<s1.length() && s3.charAt(k)==s1.charAt(i)){
                    i++;
                } else if(j<s2.length() && s3.charAt(k)==s2.charAt(j)){
                    j++;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
