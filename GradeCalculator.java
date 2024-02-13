import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int fullMark = numSubjects*100;

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate marks (maximum marks for a subject is 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

             totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = ((double) totalMarks / fullMark)*100;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Assign grade based on average percentage
        if (averagePercentage >= 90 && averagePercentage <=100) {
            System.out.println("Grade: - O" );
        } 
        else if (averagePercentage >= 80 && averagePercentage <=90) {
            System.out.println("Grade: - E");
        }
         else if (averagePercentage >= 70 && averagePercentage <=80) {
            System.out.println("Grade: - A");
        }
         else if (averagePercentage >= 60 && averagePercentage <=70) {
            System.out.println("Grade: - B");
        }
        else if (averagePercentage >= 50 && averagePercentage <=60) {
            System.out.println("Grade: - B");
        }
        else if (averagePercentage >= 40 && averagePercentage <=50) {
            System.out.println("Grade: - G");
        }
        else if (averagePercentage >= 33 && averagePercentage <=40) {
            System.out.println("Grade: Just pass");
        } else {
            System.out.println("Grade: - F");
        }

        scanner.close();
    }
}
