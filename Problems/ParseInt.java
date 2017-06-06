package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class ParseInt {
    private int value;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParseInt parseInt = new ParseInt();
        System.out.print(parseInt.convertToInt(scanner.next()));
    }

    private int convertToInt(String s){
        int mul=1;
        if(s.length()>0) {
            for (int i = 1; i < s.length() ; i++) {
                mul = mul * 10;
            }
            mul = mul * ((int)s.charAt(0)-48);
            value = value+mul;
            convertToInt(s.substring(1,s.length()));
        }
        return value;
    }
}
