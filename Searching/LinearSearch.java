package Searching;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" integers");
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter value to find");
        int search = scanner.nextInt();
        LinearSearch linearSearch = new LinearSearch();
        int location = linearSearch.linearSearch(array,search);
        if(location==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element "+search+" found at location "+location);
        }
    }

    private int linearSearch(int[] elements,int find){
        for (int i=0;i<elements.length;i++){
            if(find==elements[i]){
                return i;
            }
        }
        return -1;
    }
}
