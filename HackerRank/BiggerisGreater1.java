package HackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Jay Patel on 4/5/17.
 */
public class BiggerisGreater1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        scanner.next();
        for (int i=0;i<n;i++){
            s[i] = scanner.nextLine();
        }

        for (int i=0;i<n;i++){
            int length = s[i].length()-1;
            char replaceWith = Character.MIN_VALUE;
            while (length>0){
                if(s[i].charAt(length)>s[i].charAt(length-1)){
                    for(int j=0;j<s[i].length();j++){
                        if(s[i].charAt(j)>s[i].charAt(length) && s[i].charAt(j)<replaceWith){
                            replaceWith = s[i].charAt(j);
                            break;
                        }
                    }
                    if(replaceWith!=Character.MIN_VALUE){
                        break;
                    } else {
                        break;
                    }
                } else {
                    length--;
                }

                String res = s[i].substring(0,length)+s[i].charAt(replaceWith);
                String s1 = sortString(s[i].substring(length+1,s[i].length()));
                res = res + s1.substring(0,s1.length()-res.length());
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
}
