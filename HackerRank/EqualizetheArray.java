package HackerRank;

import Sorting.InsertionSort;

import java.util.*;

/**
 * Created by Jay Patel on 24/4/17.
 */
public class EqualizetheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i=0;i<n;i++){
            nums.add(scanner.nextInt());
        }
        maxRepeating(nums);
    }

    private static void maxRepeating(List<Integer> list)
    {
        int max = 0;
        int curr = 0;
        Integer currKey =  null;
        Set<Integer> unique = new HashSet<Integer>(list);
        for (Integer key : unique) {
            curr = Collections.frequency(list, key);
            if(max < curr){
                max = curr;
                currKey = key;
            }
        }
        long delete = list.size()-max;
        System.out.println(delete);
    }
}
