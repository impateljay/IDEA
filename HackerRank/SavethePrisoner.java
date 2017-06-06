package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 17/4/17.
 */
public class SavethePrisoner {
    private static ArrayList<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        SavethePrisoner savethePrisoner = new SavethePrisoner();
        for (int i=0;i<tc;i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            savethePrisoner.solution(n,m,s);
        }
        for (int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
    }

    private void solution(int n, int m, int s) {
        if (m == 1) {
            results.add(s);
        } else {
            int result = ((m % n) + s) - 1;
            while (result >= n) {
                result %= n;
            }
            if(result==0) {
                result = n;
            }
            results.add(result);
        }
    }
}
