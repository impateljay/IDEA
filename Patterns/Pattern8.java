package Patterns;

/**
 * Created by Jay on 10-06-2017.
 * http://www.topjavatutorial.com/java/java-programs/8-different-star-pattern-programs-java/
 * *      ****************       *
 * *      *******  *******      **
 * **     ******    ******     ***
 * ***    *****      *****    ****
 * ****   ****        ****   *****
 * *****  ***          ***  ******
 * ****** **            ** *******
 * ********              *********
 */
public class Pattern8 {
    public static void main(String[] args) {
        new Pattern8().draw(8);
    }

    private void draw(int max) {
        String first = new String(new char[max-1]).replace('\0', ' ');
        String second = new String(new char[max]).replace('\0', '*');
        String third = new String(new char[max]).replace('\0', '*');
        String fouth = new String(new char[max-1]).replace('\0', ' ');
        first = '*' + first;
        fouth = fouth + '*';
        System.out.println(first+second+third+fouth);
        for (int i=0;i<max-1;i++){
            first = first.substring(0,i+1)+'*'+first.substring(i+2);
            second = second.substring(0,max-i-1)+' '+second.substring(max-i);
            third = third.substring(0,i)+' '+third.substring(i+1);
            fouth = fouth.substring(0,max-i-2)+'*'+fouth.substring(max-i-1);
            System.out.println(first+second+third+fouth);
        }
    }
}
