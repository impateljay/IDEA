package Problems;

import java.util.*;

/**
 * Created by Jay Patel on 18/4/17.
 */
//Better version of Pair.Java
public class BetterPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int[] elements = new int[n];
        int[] elements = new int[n];
        for(int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        BetterPair betterPair =new BetterPair();
        betterPair.pairs2(elements,sum);
    }

    //With 2 pointers
    private void pairs(int[] elements,int sum){
        int p1=0,p2=elements.length-1;
        while (p1<=p2){
            if(elements[p1]+elements[p2]==sum){
                System.out.println(elements[p1]+" "+elements[p2]);
                p1++;
            } else if(elements[p1]+elements[p2]<sum){
                p1++;
            } else if(elements[p1]+elements[p2]>sum){
                p2--;
            }
        }
    }

    private void pairs1(int[] elements,int sum){
        HashSet<Integer> comp = new HashSet<>();
        for(int i=0;i<elements.length;i++){
            if(comp.contains(elements[i])){
                System.out.println(elements[i]+" "+(sum-elements[i]));
            } else {
                comp.add(sum-elements[i]);
            }
        }
    }

    private void pairs2(int[] elements,int sum){
        ArrayList<Integer> comp = new ArrayList<>();
        for(int i=0;i<elements.length;i++){
            if(comp.contains(elements[i])){
                System.out.println(elements[i]+" "+(sum-elements[i]));
            }
//            else {
////                comp.add(sum-elements[i]);
//                int a = sum-elements[i];
//                Iterator<Integer> iterator = comp.iterator();
//                while (iterator.hasNext()){
//                    if(comp.contains(a - iterator.next())){
//                        System.out.println(elements[i]+" "+a+" "+(a-iterator.next()));
//                    }
//                }
//                comp.add(sum-elements[i]);
//            }
            else {
                if (comp.size() > 1) {
                    for (Set<Integer> z : solveChallenge(null)) {
                        //System.out.print(z);
                        Iterator<Integer> iterator1 = z.iterator();
                        int[] x = new int[z.size()];
                        int subListSum = 0;
                        int index = 0;
                        int co = sum - elements[i];
                        while (iterator1.hasNext()) {
                            x[index] = iterator1.next();
                            subListSum += x[index];
                            index++;
                            if (co == subListSum) {
                                System.out.println(elements[i] + " " + x[0] + " " + x[1]);
                            }
                        }
                    }
                    comp.add(sum - elements[i]);
                } else {
                    comp.add(sum-elements[i]);
                }
            }
        }
    }

    public List<Set<Integer>> solveChallenge(Set<Integer> myset) {

        int n = myset.size();
        Integer[] myInts = new Integer[n];
        Iterator<Integer> iterator = myset.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            myInts[index] = iterator.next();
            ++index;
        }

        List<Set<Integer>> myList = new ArrayList<Set<Integer>>();
        Set<Integer> subSet;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (j != i) {
                    subSet = new HashSet<Integer>();
                    subSet.add(myInts[i]);
                    subSet.add(myInts[j]);
                    myList.add(subSet);
                }

            }
        }
        return myList;
//        for (Set<Integer> i:myList) {
//            System.out.print(i);
//            Iterator<Integer> iterator1 = i.iterator();
//            while (iterator1.hasNext()) {
//                System.out.println(iterator1.next());
//            }
//        }
    }
}
