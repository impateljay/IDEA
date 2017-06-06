package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 3/5/17.
 */
public class TwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res="";
        boolean isEqual=false;
        int maxlength=0;
        for (int i=0;i<s.length();i++){
            res = s.replace(s.charAt(i)+"","");
            isEqual = false;
            for (int j=0;j<res.length()-1;j++){
                if(res.charAt(j)==res.charAt(j+1)){
                    isEqual = true;
                    break;
                }
            }
            if(!isEqual){
                if(maxlength<res.length()){
                    maxlength = res.length();
                    System.out.println(res);
                    System.out.println(maxlength);
                }
            } else {
                res = "";
                isEqual = false;
            }
        }
        System.out.println();
        System.out.println(maxlength);
    }
}
