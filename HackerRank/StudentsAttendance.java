package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class StudentsAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String attendance = scanner.next();
        StudentsAttendance studentsAttendance = new StudentsAttendance();
        System.out.print(studentsAttendance.qualificationCheck(attendance));
    }

    private boolean qualificationCheck(String attendance){
        int count=0;
        for (int i=0;i<attendance.length();i++){
            if(attendance.charAt(i)=='L' || attendance.charAt(i)=='A'){
                count++;
                if(count>=3){
                    return false;
                }
            } else {
                count=0;
            }
        }
        return true;
    }
}
