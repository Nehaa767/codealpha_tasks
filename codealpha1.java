import java.util.ArrayList;
import java.util.Scanner;

public class codealpha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the grades of students (enter -1 to stop):");

        
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) { 
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered!");
            return;
        }

        
        int totalSum = 0;
        int highestGrade = grades.get(0);
        int lowestGrade = grades.get(0);

        for (int grade : grades) {
            totalSum += grade;
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        double averageGrade = (double) totalSum / grades.size();

     
        System.out.println("Number of students: " + grades.size());
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
}
}

