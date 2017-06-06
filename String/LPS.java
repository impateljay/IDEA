package String;

import java.util.Scanner;

/**
 * Created by Jay Patel on 5/6/17.
 */
//Longest Proper Suffix
public class LPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pattern");
        String p = scanner.nextLine();
        LPS lps = new LPS();
        lps.calculateLPS(p);
    }

    public int[] calculateLPS(String pattern){
        int[] lps = new int[pattern.length()];
        int j=0,i=1;
        lps[0]=0;
        while (i<pattern.length()){
            if(pattern.charAt(j) == pattern.charAt(i)){
                lps[i] = lps[i-1] + 1;
                i++;
                j++;
            } else if(j > 0){
                while (true){
                    j = lps[j-1];
                    if(pattern.charAt(j) == pattern.charAt(i)){
                        lps[i] = lps[j] + 1;
                        i++;
                        j++;
                        break;
                    }
                    else if(j>0){
                        continue;
                    }
                    else{
                        lps[i] = 0;
                        i++;
                        break;
                    }
                }
            } else {
                lps[i] = 0;
                i++;
                break;
            }
        }
        return lps;
    }
}
