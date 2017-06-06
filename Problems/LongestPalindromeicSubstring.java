package Problems;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 26/4/17.
 */
public class LongestPalindromeicSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result = "";
        boolean status=false;
        for (int i=0;i<string.length()-1;i++){
            int tempi = i,tempj=string.length()-1;
            for (int j=i+1;j<string.length();j++){
                String substring = string.substring(i,j+1);
                int length = substring.length()-1;
                for(int x=0;x<length/2;x++){
                    if(substring.charAt(x)==substring.charAt(length-x)){
                        status=true;
                    }
                    else{
                        status=false;
                        break;
                    }
                }
                if(status==true){
                    if(result.length()<substring.length()) {
                        result = substring;
                    }
                }
            }
        }
        if(result!=null) {
            System.out.println(result);
        } else {
            System.out.println("Not Found");
        }
    }
}
