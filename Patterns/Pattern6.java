package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * *
 * * **
 * ** ***
 * *** ****
 * **** *****
 * ***** ******
 * ****** *******
 * ******* *********
 */
public class Pattern6 {
    public static void main(String[] args) {
        new Pattern6().draw1(8);
    }

    private void draw(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void draw1(int max){
        String s = " ";
        for (int i=0;i<max;i++){
            s = '*'+s+'*';
            System.out.println(s);
        }
    }
}
