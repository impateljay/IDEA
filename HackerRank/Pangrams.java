package HackerRank;

import org.omg.CORBA.ObjectHelper;

import java.util.ArrayList;
import java.util.Scanner;

/**     DONE
 * Created by Jay Patel on 4/5/17.
 */
public class Pangrams {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=97;i<123;i++){
            arrayList.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i=0;i<s.length();i++){
            if(arrayList.contains((int)s.charAt(i))){
                arrayList.remove(Integer.valueOf((int)s.charAt(i)));
            } else if(arrayList.contains((int)s.charAt(i)+32)){
                arrayList.remove(Integer.valueOf((int)s.charAt(i)+32));
            }
            if(arrayList.size()<=0){
                break;
            }
        }
        if(arrayList.size()>0){
            System.out.println("not pangram");
        } else {
            System.out.println("pangram");
        }
    }
}
