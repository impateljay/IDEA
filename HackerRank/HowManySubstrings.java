package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 12/4/17.
 */
public class HowManySubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListCount = new ArrayList<>();
        for(int a0 = 0; a0 < q; a0++) {
            int left = in.nextInt();
            int right = in.nextInt();
//        }
//            for (int i=left;i<=right;i++){
//                for (int j=i;j<=right;j++){
//                    if(s.length()>=right && !arrayList.contains(s.substring(i,j+1))){
//                        arrayList.add(s.substring(i,j+1));
//                    }
//                }
////                arrayListCount.add(arrayList.size());
////                arrayList.clear();
//            }
//            arrayListCount.add(arrayList.size());
//            arrayList.clear();
//        }
//
//        for (int i:arrayListCount) {
//            System.out.println(i);
        }
    }

    private void solution(String s,int left,int right){
    }
}
