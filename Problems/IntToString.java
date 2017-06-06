package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class IntToString {
    String s= "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntToString intToString = new IntToString();
        intToString.convertToString(scanner.nextInt());
    }

    private void convertToString(int number){
        if (number>0) {
            int mod = number%10;
            number = number/10;
            s+=mod;
            convertToString(number);
        } else {
            for (int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}
