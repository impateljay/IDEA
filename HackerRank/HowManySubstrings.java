package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 12/4/17.
 */
public class HowManySubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListCount = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++) {
            int left = in.nextInt();
            int right = in.nextInt();
            new HowManySubstrings().solution(s.substring(left,right+1));
        }
    }

    private void solution(String s){
        int res = calculateLPS(s);
        int total = (s.length() * (s.length() + 1)) / 2;
        System.out.println(total - res);
    }

    private int calculateLPS(String pattern){
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
            }
        }
        int result = 0;
        for (int a:lps) {
            result += a;
        }
        return result;
    }
}
