import java.util.*;

public class StudentQueueOld {

    int rear;
    int front;
    int size;
    static final int BACK = 0;
    ArrayList<Student> queue;

    public StudentQueueOld() {
        queue = new ArrayList<Student>();
    }

    public void enqueue(Student student) {
        queue.add(0, student);
    }

    public void dequeue() {
        size = queue.size();
        queue.remove(size - 1);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int frontIndex() {
        return queue.size() - 1;
    }

    public int backIndex() {
        return BACK;
    }

    public Student front() {
        return queue.get(queue.size() - 1);
    }

    public Student back() {
        return queue.get(BACK);
    }

    public void print() {
        for (Student stu:queue) {
            System.out.print(stu.getName() + " ");
        }
    }

    public void print(int index) {
        Student aStudent = queue.get(index);
        System.out.println(aStudent.getName());
    }

    /*public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Student i : studentQueue) {
            sb.append(i.getName() + " ").append(i.getAge() + " ").append(i.getGrade() + "\n");
        }
        
        return sb.toString();
    } */

}