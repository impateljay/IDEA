package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class FindFirstUnrepeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char array[] = new char[n];
        for (int i=0;i<n;i++){
            array[i] = scanner.next().charAt(0);
        }
        FindFirstUnrepeated findFirstUnrepeated = new FindFirstUnrepeated();
        findFirstUnrepeated.solution(array);
    }

    private void solution(char[] array){
        String s="";
        int index = 0;
        for (int i=0;i<array.length;i++){
            if(s.contains(String.valueOf(array[i]))){
                char[] charArray = s.toCharArray();
                charArray[s.indexOf(String.valueOf(array[i]))] = '\u0000';
                if(s.indexOf(String.valueOf(array[i]))==index){
                    index++;
                }
                s = String.valueOf(charArray);
            }else {
                s += array[i];
            }
        }
        System.out.println(s.charAt(index));
    }
}
