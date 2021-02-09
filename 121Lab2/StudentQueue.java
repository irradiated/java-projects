//package Lab2;

import java.util.*;

public class StudentQueue {

    private ArrayList<Student> studentList;

    public StudentQueue() {
        studentList = new ArrayList<>();
    }

    public void addNewStudent(Student student) {
        if(studentList.isEmpty()) {
            studentList.add(student);
        }else if (student.getAge() < studentList.get(studentList.size()-1).getAge() ||
            student.getGrade() < studentList.get(studentList.size()-1).getGrade()) {
            studentList.add(studentList.size()-1,student);
        }
    }

    public void callNext() {
        if(!studentList.isEmpty()) {
            studentList.remove(0);
        }else{
        System.out.println("empty");
        }
    }  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Student i : studentList) {
            sb.append(i.getName() + " ").append(i.getAge() + " ").append(i.getGrade() + "\n");
        }
    
        return sb.toString();
    }
}