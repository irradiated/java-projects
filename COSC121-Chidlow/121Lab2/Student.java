//package Lab2;

public class Student {

   public String name;
   public int age; 
   public int grade;
    

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
@Override
    public String toString() {
    	return name + "" + age + "" + grade;
    }

}