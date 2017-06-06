package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll(" ","");
        double sqrtl = Math.sqrt(input.length());
//        int rows = (int) Math.floor(sqrtl);
        int rows = (int) Math.round(sqrtl);
        int colums = (int) Math.ceil(sqrtl);
        Encryption encryption = new Encryption();
        encryption.solution(input,rows,colums);
    }

    private void solution(String input,int rows, int columns){
        int length = input.length()%(rows) == 0 ? input.length()/(rows) : (input.length()/(rows)) + 1 ;
        for (int i=0;i<length;i++){
            int j=i;
            while (j<input.length()){
                System.out.print(input.charAt(j));
                j=j+length;
            }
            System.out.print(" ");
        }
    }
}
