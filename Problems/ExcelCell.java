package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class ExcelCell {
    private String cellName="";
    private List<Integer> sum= new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExcelCell excelCell = new ExcelCell();
        String cell = scanner.next();
        if(excelCell.tryParseInt(cell)){
            int n = Integer.parseInt(cell);
            String cell1 = excelCell.printCell(n-1);
            for (int i=cell1.length()-1;i>=0;i--){
                System.out.print(cell1.charAt(i));
            }
        } else {
            excelCell.printInt(cell);
        }
    }

    private String printCell(int num){
        if(num>=0) {
            int quotient = num / 26;
            int remainder = num % 26;
            cellName = cellName + (char) (remainder + 65);
            if(quotient>0)
                printCell(quotient-1);
        }
        return cellName;
    }

    private int printInt(String cellName){
        int total=0;
        if(cellName.length()>0) {
            int currentSum = 1;
            for (int i = 0; i < cellName.length() - 1; i++) {
                currentSum = currentSum * 26;
            }
            sum.add(currentSum + (((int) cellName.charAt(0)) - 65));
            printInt(cellName.substring(1, cellName.length()));
        } else {
            for (int a:sum) {
                total += a;
            }
            System.out.println(total);
        }
        return total;
    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}