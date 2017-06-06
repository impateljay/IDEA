package CodeChef;

import java.util.Scanner;

/**
 * Created by Jay Patel on 12/4/17.
 */
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdrawAmount = scanner.nextInt();
        float initialBalance = scanner.nextFloat();
        ATM atm = new ATM();
        double value = atm.solution(withdrawAmount, initialBalance);
        System.out.printf("%.2f", value);
    }

    private double solution(int withdrawAmount, float initialBalance){
        if(withdrawAmount % 5 == 0 && withdrawAmount < initialBalance){
            return initialBalance - withdrawAmount - 0.5;
        } else {
            return initialBalance;
        }
    }
}
