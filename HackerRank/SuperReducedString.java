package HackerRank;

import java.util.Scanner;

/**     DONE
 * Created by Jay Patel on 3/5/17.
 */
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = check(s);
        if(s.equals("")){
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }

    private static String check(String s){
        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    i=-1;
                }
            }
            return s;
        } catch (Exception e){
            return s;
        }
    }
}
