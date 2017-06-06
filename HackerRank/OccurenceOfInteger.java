package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class OccurenceOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        OccurenceOfInteger occurenceOfInteger = new OccurenceOfInteger();
        List<Integer> integers = occurenceOfInteger.occurence(arr,n/4);
        for (int i:integers) {
            System.out.print(i+" ");
        }
    }

    private List<Integer> occurence(int[] arr, int nby4){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int a=0;
            if(hashMap.containsKey(arr[i])) {
                a = hashMap.get(arr[i]);
            }
            if(a>=nby4){
                if(!integerList.contains(arr[i]))
                    integerList.add(arr[i]);
            } else {
                hashMap.put(arr[i], a+1);
            }
        }
        return integerList;
    }
}
