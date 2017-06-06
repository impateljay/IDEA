package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class ViralAdvertising {
    int peopleLikeAd=0,result=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int adLikes = 5;
        ViralAdvertising viralAdvertising = new ViralAdvertising();
        viralAdvertising.solution(days,5);
    }

    private void solution(int days,int pla){
        if(days>0) {
            if(peopleLikeAd == 0){
                peopleLikeAd = pla / 2;
            }else {
                peopleLikeAd += peopleLikeAd / 2;
            }
            result = result + peopleLikeAd;
            solution(days-1,peopleLikeAd*3);
        }
        else {
            System.out.println(result);
        }
    }
}
