package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 17/4/17.
 */
public class CircularArrayRotation {
    private static ArrayList<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            circularArrayRotation.solution(a,k,m,n);
        }
        for(int a0 = 0; a0 < results.size(); a0++){
            System.out.println(results.get(a0));
        }
    }

    private void solution(int[] arr,int k,int m, int n){
        int posValue=0;
        if (m-k%n < 0) {
            posValue = m-k%n+n;
        }
        else {
            posValue = m-k%n;
        }
        results.add(arr[posValue]);
//        results.add(arr[(n+m-k)%n]);
    }
}
