package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * *******
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        new Pattern1().draw1(8);
    }

    private void draw(int max) {
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void draw1(int max){
        String print = "*******";
        for (int i=0;i<max;i++){
            System.out.println(print.substring(0,max-i-1));
        }
    }
}
