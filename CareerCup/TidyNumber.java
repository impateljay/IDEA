package CareerCup;

import java.util.Scanner;

/**
 * Created by Jay Patel on 26/4/17.
 */
public class TidyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=n;i>9;i--){
            boolean status = false;
            String str = i+"";
            for (int j=0;j<str.length()-1;j++){
                if((int)str.charAt(j)<=(int)str.charAt(j+1)){
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
            if(status){
                System.out.println(str);
                break;
            }
        }
    }
}
