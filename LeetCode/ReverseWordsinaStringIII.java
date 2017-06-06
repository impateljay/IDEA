package LeetCode;

import java.util.Scanner;

/**
 * Created by Jay Patel on 21/4/17.
 */
public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = reverseWords(s.substring(1,s.length()-1));
        System.out.println(s);
    }

    private static String reverseWords(String s){
        String[] words=s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        reversedString.append('"');
        for(String w:words){
            for (int i=w.length()-1;i>=0;i--){
                reversedString.append(w.charAt(i));
            }
            reversedString.append(" ");
        }
        String str = reversedString.toString().substring(0,reversedString.length()-1)+'"';
        return str;
    }
}




//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"