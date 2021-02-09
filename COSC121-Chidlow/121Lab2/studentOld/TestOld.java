import java.util.*;

public class TestOld {
    public static void main(String[] args) {

        Student student;
        StudentQueue stuQueue = new StudentQueue();
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        int grade;

        for (int i=0; i<5; i++) {

            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("Age: ");
            age = Integer.parseInt(scan.nextLine());
            System.out.print("Grade: ");
            grade = Integer.parseInt(scan.nextLine());

            student = new Student(name, age, grade);
            stuQueue.enqueue(student);
            
        }

        
    }
}
