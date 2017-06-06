package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 17/4/17.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i=0;i<n;i++){
            input[i] = scanner.nextInt();
        }
        FindDigits findDigits = new FindDigits();
        findDigits.solution(n,input);
    }

    private void solution(int n, int[] input){
        for (int i=0;i<input.length;i++){
            int count = 0;
            String in = String.valueOf(input[i]);
            for (int j=0;j<in.length();j++){
                try {
                    if(input[i]%Integer.parseInt(in.charAt(j)+"")==0){
                        count++;
                    }
                } catch (Exception e){
                    continue;
                }
            }
            System.out.println(count);
        }
    }
}
