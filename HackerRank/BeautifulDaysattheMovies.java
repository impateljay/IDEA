package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class BeautifulDaysattheMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int x=i;x<=j;x++){
            int revx = Integer.parseInt(new StringBuilder(x+"").reverse().toString());
            if(Math.abs(x-revx)%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
