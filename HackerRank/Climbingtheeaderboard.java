package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 24/4/17.
 */
public class Climbingtheeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> scores = new ArrayList<>();
        for(int scores_i=0; scores_i < n; scores_i++){
            int score = in.nextInt();
            if(!scores.contains(score)){
                scores.add(score);
            }
        }
        List<Integer> results = new ArrayList<>();
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

        for (int i:alice) {
            int position = -1;
            for (int j=0;j<scores.size();j++){
                if(i>=scores.get(j)){
                    position = j+1;
                    results.add(position);
                    break;
                }
            }
            if(position==-1){
                position = scores.size()+1;
                results.add(position);
            }
        }

        for (int i:results) {
            System.out.println(i);
        }
    }
}
