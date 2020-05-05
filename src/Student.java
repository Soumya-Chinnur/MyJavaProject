
import java.io.IOException;

public class Student extends StudentDetails implements School
{
    int age;
    String performance;
    int students;
    public void numOfStudents(int a)
    {
        this.students = a;
        System.out.println("num of students:"+a);
    }
    public void personalDetails(String p, int s)
    {
        this.age = s;
        this.performance = p;
        System.out.println("Age:"+age);
        System.out.println("performance:"+performance);
    }
    public static void main(String args[]) throws IOException {
        Student s1 = new Student();
        s1.personalDetails("good", 18);
        s1.numOfStudents(200);

        FileReading reading = new FileReading();
        reading.getPropValues();
    }
}
