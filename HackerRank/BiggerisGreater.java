package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Jay Patel on 28/4/17.
 */
public class BiggerisGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] w = new String[n];
        for (int i=0;i<n;i++){
            w[i] = scanner.next();
        }

        for (String aW : w) {
//            calculateValue(aW);
            String res = null;
            int i = aW.length()-1;
            while (i>0){
                if((int)aW.charAt(i)> (int)aW.charAt(i-1)){
//                    aW = aW.substring(0,i-1)+ aW.charAt(i)+aW.charAt(i-1);

                    int charPos = i;
                    for (int j=charPos;j<aW.length();j++){
                        if((int)aW.charAt(j)>(int)aW.charAt(i-1)&&(int)aW.charAt(j)<(int)aW.charAt(charPos)){
                            charPos = j;
                        }
                    }
                    res = aW.substring(0,i-1)+ aW.charAt(charPos);
//                    aW = aW.substring(0,i-1);
//                    String s = aW.substring(0,charPos)+aW.substring(charPos+1);
                    String s=null;
                    if(charPos==i){
                        res = res + aW.charAt(i-1);
                    }else {
                        s = aW.substring(0,charPos)+aW.substring(charPos+1);
                        res = res + sortString(s);
                    }
//                    res = res + sortString(s);
//                    System.out.println(res);
                    break;
                }
                i--;
            }
            if(res==null||res==""){
                System.out.println("no answer");
            } else {
                System.out.println(res);
            }
        }
    }

    private static String sortString(String str){
        // put the characters into an array
        Character[] chars = new Character[str.length()];
        for (int i = 0; i < chars.length; i++)
            chars[i] = str.charAt(i);

        // sort the array
        Arrays.sort(chars, new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                int cmp = Character.compare(
                        Character.toLowerCase(c1.charValue()),
                        Character.toLowerCase(c2.charValue())
                );
                if (cmp != 0) return cmp;
                return Character.compare(c1.charValue(), c2.charValue());
            }
        });

        // rebuild the string
        StringBuilder sb = new StringBuilder(chars.length);
        for (char c : chars) sb.append(c);
        return sb.toString();
    }

    private static long calculateValue(String w){
        long res=0;
        int i=1;
        while (i<=w.length()){
            res = res + (w.charAt(i-1) * i);
            i++;
        }
        System.out.println(w+":"+res);
        return res;
    }
}
