package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/** DONE
 * Created by Jay Patel on 4/5/17.
 */
public class HackerRankinaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        ArrayList<String> res = new ArrayList<>();
        String hackerrank= "hackerrank";
        int pointer = 0;
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)==hackerrank.charAt(pointer)){
                    pointer++;
                    if(pointer==10){
                        break;
                    }
                }
            }
            if(pointer==10){
                res.add("YES");
            } else {
                res.add("NO");
            }
            pointer=0;
        }

        for (String a:res) {
            System.out.println(a);
        }
    }
}
