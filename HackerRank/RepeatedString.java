package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        if(!s.contains("a")){
            System.out.println(0);
        } else {
            long div = n/s.length();
            long charCount = s.length() - s.replaceAll("a", "").length();
            long aCount = charCount * div;
            for (int i=0;i<n%s.length();i++){
                if(s.charAt(i)=='a'){
                    aCount++;
                }
            }
            System.out.println(aCount);
        }

//        long aCount=0;
//        for (int i=0;i<s.length();i++){
//            if(s.charAt(i)=='a'){
//                aCount++;
//            }
//        }
//        if(aCount == 0){
//            System.out.println(0);
//        } else {
//            long res = (n * aCount) / s.length();
//            long mul = res * s.length();
//            long mod = Math.abs((mul / aCount) - n);
//            if (mod != 0) {
//                for (int i = 0; i < mod; i++) {
//                    if (s.charAt(i) == 'a') {
//                        res++;
//                    }
//                }
//            }
//            System.out.println(res);
//        }
    }
}
