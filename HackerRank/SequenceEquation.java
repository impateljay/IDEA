package HackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class SequenceEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> p = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            p.put(i, scanner.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            Iterator it = p.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if ((int) pair.getValue() == i) {
                    int key = (int) pair.getKey();
                    Iterator it1 = p.entrySet().iterator();
                    while (it1.hasNext()) {
                        Map.Entry pair1 = (Map.Entry) it1.next();
                        if ((int) pair1.getValue() == key) {
                            System.out.println(pair1.getKey());
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}