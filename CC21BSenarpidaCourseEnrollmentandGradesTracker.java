
package com.mycompany.cc21bsenarpidacourseenrollmentandgradestracker;

/* Senarpida, Charmae A.
   CC2-1B
   11/25/2024
   Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
*/

public class CC21BSenarpidaCourseEnrollmentandGradesTracker {
    public static void main(String[] args) {
        // Step 1: Create a one-dimensional array to store student names
        String[] studentNames = {"Angel", "Brent", "Charmae", "Diana", "Eve"};

        // Step 2: Create a two-dimensional array to store grades for 3 subjects per student
        int[][] grades = {
            {85, 90, 78},  // Angel's grades
            {88, 76, 92},  // Brent's grades
            {90, 91, 89},  // Charmae's grades
            {72, 85, 80},  // Diana's grades
            {95, 98, 94}   // Eve's grades
        };

        // Step 3: Calculate and display the average grade for each student
        System.out.println("Student Name | Average Grade");
        System.out.println("----------------------------");

        for (int i = 0; i < studentNames.length; i++) {
            int total = 0;

            // Sum up grades for the current student
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }

            // Calculate the average
            double average = (double) total / grades[i].length;

            // Display the student's name and their average grade
            System.out.printf("%-12s | %.2f%n", studentNames[i], average);
        }
    }
}
