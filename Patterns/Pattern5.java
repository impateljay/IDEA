package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * <p>
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 */
public class Pattern5 {
    public static void main(String[] args) {
        new Pattern5().draw(8);
    }

    private void draw(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < max; j++) {
                if (j >= max - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
