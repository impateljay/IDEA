package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class QueensAttackII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        ArrayList<String> rcObstacle = new ArrayList<>();
        for(int a0 = 0; a0 < k; a0++) {
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            rcObstacle.add(rObstacle+""+cObstacle);
        }
        QueensAttackII queensAttackII = new QueensAttackII();
        queensAttackII.solution(rQueen,cQueen,rcObstacle,n);
    }

    private void solution(int r,int c,ArrayList<String> rcObstacle,int n){

        String topLeft="",topRight="",top="",left="",
                right="",bottom="",bottomLeft="",bottomRight="";
        for (int i=0;i<rcObstacle.size();i++){
            String obs=rcObstacle.get(i);
            int obsR = Integer.parseInt(obs.charAt(0)+"");
            int obsC = Integer.parseInt(obs.charAt(1)+"");
            if(obsR<r && obsC==c){
                if(bottom.equals("") || (bottom.length()>0&&bottom.charAt(0)<obs.charAt(0))){
                    bottom = obs;
                }
            } else if(obsR>r && obsC==c) {
                if(top.equals("") || (top.length()>0&&top.charAt(0)>obs.charAt(0))){
                    top = obs;
                }
            } else if(obsR==r && obsC<c){
                if(left.equals("") || (left.length()>0&&left.charAt(1)<obs.charAt(1))){
                    left = obs;
                }
            } else if(obsR==r && obsC>c) {
                if(right.equals("") || (right.length()>0&&right.charAt(1)>obs.charAt(1))){
                    right = obs;
                }
            }

            else if(obsR<r && obsC>c){
                if(bottomRight.equals("") || (bottomRight.length()>0&&bottomRight.charAt(0)<obs.charAt(0)&&bottomRight.charAt(1)>obs.charAt(1))){
                    bottomRight = obs;
                }
            } else if(obsR>r && obsC>c) {
                if(topRight.equals("") || (topRight.length()>0&&topRight.charAt(0)>obs.charAt(0)&&topRight.charAt(1)>obs.charAt(1))){
                    topRight = obs;
                }
            } else if(obsR>r && obsC<c){
                if(topLeft.equals("") || (topLeft.length()>0&&topLeft.charAt(0)>obs.charAt(0)&&topLeft.charAt(1)<obs.charAt(1))){
                    topLeft = obs;
                }
            } else if(obsR<r && obsC<c) {
                if(bottomLeft.equals("") || (bottomLeft.length()>0&&bottomLeft.charAt(0)<obs.charAt(0)&&bottomLeft.charAt(1)<obs.charAt(1))){
                    bottomLeft = obs;
                }
            }
        }



        System.out.println(top);
        System.out.println(bottom);
        System.out.println(left);
        System.out.println(right);
        System.out.println(topLeft);
        System.out.println(topRight);
        System.out.println(bottomLeft);
        System.out.println(bottomRight);

        int possibleMoves = 0;
        possibleMoves += top.equals("") ? n-r : Integer.parseInt(top.charAt(0)+"")-r;
        possibleMoves += bottom.equals("") ? r-n-1 : r-1-Integer.parseInt(bottom.charAt(0)+"");
        possibleMoves += right.equals("") ? n-c : Integer.parseInt(right.charAt(1)+"")-c;
        possibleMoves += left.equals("") ? c-n-1 : c-1-Integer.parseInt(left.charAt(1)+"");

        possibleMoves += topRight.equals("") ? n-c : Integer.parseInt(topRight.charAt(1)+"")-c;
        possibleMoves += bottomRight.equals("") ? n-c : c-1-Integer.parseInt(bottomRight.charAt(1)+"");
        possibleMoves += topLeft.equals("") ? c-n-1 : Integer.parseInt(topLeft.charAt(1)+"")-c;
        possibleMoves += bottomLeft.equals("") ? c-n-1 : c-1-Integer.parseInt(bottomLeft.charAt(1)+"");

        System.out.println(possibleMoves);
    }
}
