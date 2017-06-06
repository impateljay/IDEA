package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class StringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        StringContains stringContains = new StringContains();
        boolean b = stringContains.contains(s1,s2);
        System.out.print(b);
    }

    private boolean contains(String s1, String s2){
        for (int i=0;i<s1.length()-s2.length()+1;i++){
            int j=0;
            while (j<s2.length()){
                if(s1.charAt(i)!=s2.charAt(j)){
                    break;
                } else {
                    j++;i++;
                    if(j>=s2.length()-1) return true;
                }
            }
        }
        return false;
    }
}
