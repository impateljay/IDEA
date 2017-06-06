package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 24/4/17.
 */
public class JumpingontheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int count=0,pos=0;
        while (pos<c.length){
            try {
                if(pos+2<c.length) {
                    if (c[pos + 2] == 0) {
                        count++;
                        pos = pos + 2;
                    } else if(c[pos+1] == 0){
                        count++;
                        pos++;
                    }
                } else if(pos+1<c.length) {
                    if(c[pos+1]==0){
                        count++;
                        pos++;
                    }
                } else {
                    break;
                }
            } catch (Exception e){
                break;
            }
        }


        System.out.println(count);

//        for(int c_i=0; c_i < n; c_i++){
//            System.out.print(c[c_i]+"\t");
//        }
    }
}
