package Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Jay Patel on 28/4/17.
 */
public class ExpiryHashMap {
    private static HashMap<String,String> hashMap;
    private static int expiryTime;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        expiryTime = 10000;
        hashMap = new HashMap<>();
        while (true){
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Retreive");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    String key = scanner.next();
                    String value = scanner.next();
                    insert(key,value);
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

    private static void insert(String key,String value){
        String v = value+":::"+System.currentTimeMillis();
        hashMap.put(key,v);
    }

    private static void delete(String key){
        hashMap.remove(key);
    }

    private static String retreive(String key){
        String s = hashMap.get(key);
        String[] arr = s.split(":::");
        long diff = System.currentTimeMillis() - Long.parseLong(arr[1]);
        if(diff>=expiryTime){
            hashMap.remove(key);
            return null;
        } else {
            return arr[0];
        }
    }

    private static void display(){
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            String val = pair.getValue().toString().split(":::")[0];
            System.out.println(pair.getKey() + " = " + val);
            it.remove();
        }
    }
}
