package HackerRank;

import java.util.Scanner;

/** DONE
 * Created by Jay Patel on 3/5/17.
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int k = scanner.nextInt();
        if(k>26)
            k=k%26;
        for (int i=0;i<s.length();i++){
            if(((int)s.charAt(i)>96 && (int)s.charAt(i)<123) || ((int)s.charAt(i)>64 && (int)s.charAt(i)<91)){
                int a = ((int)s.charAt(i))+k;
                if(((int)s.charAt(i)>64 && (int)s.charAt(i)<91) && a>90){
                    a=(a%90)+64;
                } else if(a>122){
                    a=(a%122)+96;
                }
                s=s.substring(0,i)+(char)(a)+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
