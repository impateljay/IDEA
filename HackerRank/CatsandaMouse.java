package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class CatsandaMouse {
    private static ArrayList<String> results = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            solution(x,y,z);
        }
        for (String s:results){
            System.out.println(s);
        }
    }

    private static void solution(int x,int y,int z){
        if(Math.abs(x-z) > Math.abs(y-z)){
            System.out.println("Cat B");
        } else if(Math.abs(y-z) > Math.abs(x-z)){
            System.out.println("Cat A");
        } else {
            System.out.println("Mouse C");
        }
    }
}
