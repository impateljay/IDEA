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
        new Pattern3().draw1(7);
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

    private void draw1(int max){
        String s = new String(new char[max*2+1]).replace('\0', ' ');
        int start = max;
        int end = max-1;
        s = s.substring(0,start-1)+'*'+s.substring(start+1);
        System.out.println(s);
        for (int i=0;i<max-1;i++){
            start--;
            end++;
            if(start>=0 && end<=s.length()-1) {
                s = s.substring(0, start - 1) + '*' + s.substring(start, end) + '*' + s.substring(end + 1);
                System.out.println(s);
            }
        }
    }
}
