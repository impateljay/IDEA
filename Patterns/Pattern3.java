package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * <p>
 * **
 * ****
 * ******
 * ********
 * **********
 * ************
 */
public class Pattern3 {
    public static void main(String[] args) {
        new Pattern3().draw(7);
    }

    private void draw(int max) {
        int start = max;
        int end = max;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max * 2 + 1; j++) {
                if (j >= start && j <= end) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start--;
            end++;
        }
    }
}
