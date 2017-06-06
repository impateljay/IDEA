package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Jay Patel on 26/4/17.
 */
public class PrintTillRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result="",res="";
        HashSet<Character> hashSet = new HashSet<>();
        for (int i=0;i<s.length();i++){
            if(!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                res = res + s.charAt(i);
                if(result.length()<res.length()){
                    result = res;
                }
            }
        }
        System.out.println(result);
    }
}
