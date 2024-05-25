import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects in the semester:");
        int numSub = scanner.nextInt();

        int totalobt = 0;
        double avgPer;

        System.out.println("Enter marks obtained (out of 100) for each subject in this semester:");
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalobt = totalobt + marks;
        }

        avgPer = (double) totalobt / numSub;

        int total = 0;
        total = total + (numSub * 100);
        System.out.println("Total marks:" + total);

        System.out.println("Total Marks obtained by student: " + totalobt);
        System.out.println("Average Percentage: " + avgPer + "%");

        char grade;
        if (avgPer >= 90) {
            grade = 'A';
        } else if (avgPer >= 70) {
            grade = 'B';
        } else if (avgPer >= 50) {
            grade = 'C';
        } else if (avgPer >= 30) {
            grade = 'D';
        } else if (avgPer >= 20) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
