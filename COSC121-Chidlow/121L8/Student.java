import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    private double GPA;
    private String name;
    
    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Name: " + name + " GPA: " + GPA;
    }

    @Override
    public int compareTo(Student o) {
        if (GPA > o.GPA) {
            return 1;
        } else if (GPA < o.GPA) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Student[] kensMinions = {new Student("Levi", 3),
                                 new Student("Michael", 69.420),
                                 new Student("Eric", 3.14),
                                 new Student("Ashley", 199),
        };
        Arrays.sort(kensMinions);
        for (int i =0; i < kensMinions.length; i++) {
            System.out.println(kensMinions[i]);
        }
        ArrayList<Student>superNerds = new ArrayList<Student>();
        superNerds.add(new Student("Isaac", 0.5));
        superNerds.add(new Student("A-Jay", -1.5));
        superNerds.add(new Student("Adam", 95.5));
        superNerds.add(new Student("Parker", 88.5));
        superNerds.add(new Student("Wyatt", 97.5));
        superNerds.add(new Student("Vanessa", 100.5));

        System.out.println("\n\n");
        Collections.sort(superNerds);
        for(Student s: superNerds) {
            System.out.println(s);
        }

        System.out.println("\n\n");
        //Collections.swap(superNerds, 0, 5);
        Collections.shuffle(superNerds);
        for(Student s: superNerds) {
            System.out.println(s);
        }

    }

}
