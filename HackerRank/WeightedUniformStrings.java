package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 8/5/17.
 */
public class WeightedUniformStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0;
        while (i<s.length()){
            if(i-1>=0){
                if(s.charAt(i)==s.charAt(i-1)){
                    arrayList.add(arrayList.get(i-1)+((int)s.charAt(i)-96));
                } else {
                    arrayList.add(((int)s.charAt(i))-96);
                }
            } else {
                arrayList.add(((int)s.charAt(i))-96);
            }
            i++;
        }
        int n = scanner.nextInt();
        for (int j=0;j<n;j++){
            if(arrayList.contains(scanner.nextInt())){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
