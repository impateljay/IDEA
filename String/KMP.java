package String;

import java.util.Scanner;

/**
 * Created by Jay Patel on 5/6/17.
 */
//KMP (Knuth Morris Pratt) Pattern Searching
public class KMP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scanner.nextLine();
        System.out.println("Enter pattern");
        String p = scanner.nextLine();
        LPS lps = new LPS();
        int[] lpsArray = lps.calculateLPS(p);
        new KMP().calculate(s,p,lpsArray);
    }

    private void calculate(String s, String p, int[] lps){
        int i=0,j=0;
        while (i<s.length()){
            if(s.charAt(i) == p.charAt(j)){
                i++; j++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                }
                i++;
            }
            if(p.length() == j){
                System.out.println("pattern found at "+ (i - p.length()));
                j = lps[j-1];
            }
        }
    }
}
