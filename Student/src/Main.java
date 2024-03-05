import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of extra activities: ");
        int activitiesCount = Integer.parseInt(scanner.nextLine());

        Student student = new Student(studentID, studentName, activitiesCount);

        for (int i = 0; i < activitiesCount; i++) {
            System.out.print("Enter activity #" + (i + 1) + ": ");
            String activity = scanner.nextLine();
            student.addExtraActivity(i, activity);
        }

        System.out.println(student);
    }
}