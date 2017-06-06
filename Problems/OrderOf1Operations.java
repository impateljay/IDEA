package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 28/4/17.
 */
public class OrderOf1Operations {
    private static List<String> arr1,arr2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();
        while (true){
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Retreive");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    String value = scanner.next();
                    int position = scanner.nextInt();
                    insert(value,position);
                    break;
                case 2:
                    String key1 = scanner.next();
                    delete(key1);
                    break;
                case 3:
                    String key2 = scanner.next();
                    System.out.println(retreive(key2));
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("enter valod ch");
                    break;
            }
        }
    }

    private static String retreive(String key2) {
        return null;
    }

    private static void display() {
    }

    private static void delete(String key1) {
    }

    private static void insert(String value, int position) {
        if(arr1==null && arr2==null){
            arr1.add(position,value);
        } else if(arr1 == null && arr2!=null){

        }
    }
}
