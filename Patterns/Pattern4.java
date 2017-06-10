package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * <p>
 * **
 * ****
 * ******
 * ********
 * ******
 * ****
 * **
 */
public class Pattern4 {
    public static void main(String[] args) {
        new Pattern4().draw(5);
    }

    private void draw(int max) {
        int start = max;
        int end = max;
        boolean decrease = false;
        for (int i = 0; i < max * 2; i++) {
            for (int j = 0; j < max * 2 + 1; j++) {
                if (j >= start && j <= end) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (start == 1 && end == max * 2 - 1) {
                decrease = true;
            }
            if (!decrease) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
        }
    }
}
