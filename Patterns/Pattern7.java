package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * ******
 * *    *
 * *    *
 * *    *
 * *    *
 * *    *
 * ******
 */
public class Pattern7 {
    public static void main(String[] args) {
        new Pattern7().draw1(7);
    }

    private void draw1(int max) {
        String s = new String(new char[max]).replace('\0', '*');
        System.out.println(s);
        for (int i=0;i<max-2;i++){
            s = '*'+s.substring(0,max-2).replace('*',' ')+'*';
            System.out.println(s);
        }
        s = s.replace(' ','*');
        System.out.println(s);
    }
}
