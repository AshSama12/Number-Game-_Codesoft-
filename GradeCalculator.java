import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" _______****Grade Calculator***________");
        System.out.println("-------------------------------------------- ");
        System.out.println(" ");
        System.out.print("Enter the number of subjects: ");
        int totalSubjects = scanner.nextInt();
        int totalMarks = 0;


        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();


            while (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                System.out.print("Enter marks for subject " + i + ": ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }


        double averagePercentage = (double) totalMarks / totalSubjects;


        char grade;
        if (averagePercentage >= 75) {
            grade = 'A';
        } else if (averagePercentage >= 65) {
            grade = 'B';
        } else if (averagePercentage >= 50) {
            grade = 'C';
        } else if (averagePercentage >= 30) {
            grade = 'D';
        } else {
            grade = 'F';
        }

         
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
