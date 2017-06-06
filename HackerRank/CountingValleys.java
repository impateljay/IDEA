package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        String in = scanner.next();
        for (int i=0;i<in.length();i++){
            if(in.charAt(i) == 'U'){
                data[i] = 1;
            } else {
                data[i] = -1;
            }
        }
        System.out.print(soluttion(data));
    }

    private static int soluttion(int[] data){
        int position=0,valley=0;
        for (int i=0;i<data.length;i++){
            if(data[i]==1){
                position++;
                if(position==0){
                    valley++;
                }
            } else{
                position--;
//                if(position==0){
//                    valley++;
//                }
            }
        }
        return valley;
    }
}
