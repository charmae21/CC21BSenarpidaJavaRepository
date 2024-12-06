package com.mycompany.cc21bclassroomattendancesystem;

/* Senarpida, Charmae A.
   CC2-1B
   Laboratory Challenge No. 6: Classroom Attendance System
   Submitted on October 14, 2024
*/
import java.util.Scanner;

public class CC21BClassroomAttendanceSystem {

    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Declarations
        int totalStudents, presentCount, absentCount;
        char attendance;
            
        // Ask for the total number of students
        System.out.print("Enter the total number of students: ");
        totalStudents = sc.nextInt();
        
        // Variables to keep track of present and absent students
        presentCount = 0;
        absentCount = 0;
        
        // Loop through each student and ask for attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            attendance = sc.next().charAt(0);
            
            // Check the user's input and update the counters
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for present or 'N' for absent.");
                i--;  // Repeat the same student's attendance prompt in case of invalid input
            }
        }
        
        // Total number of present and absent students
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
        
        // Close the scanner
        sc.close();
    }
}
