import java.util.*;

public class Test {
    public static void main(String[] args) {

        Student student;
        StudentQueue stuQueue = new StudentQueue();
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        int grade;
        String input;

        while (true) {
            
            input = scan.nextLine();

            if (input.equalsIgnoreCase("next")) {
                stuQueue.callNext();
            }

            else if (input.equalsIgnoreCase("end")) {
                break;
            }

            else {
                String[] split = input.split(" ");
                name = split[0];
                age = Integer.parseInt(split[1]);
                grade = Integer.parseInt(split[2]);
                student = new Student(name, age, grade);
                stuQueue.addNewStudent(student);
            }
        } 

        System.out.print(stuQueue.toString());
        
    }
}