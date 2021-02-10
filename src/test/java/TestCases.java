import com.example.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void test_toString() {
        Student student = new Student("Adithya", "4KV16CS001", 70, 80, 60, 80, 75, 86);
        String output = "Name : Adithya\nUSN : 4KV16CS001\nSUBJECT1 : 70\nSUBJECT2 : 80\nSUBJECT3 : 60\nSUBJECT4 : 80\nSUBJECT5 : 75\nSUBJECT6 : 86\n";

        assertEquals(output, student.toString());
    }

    @Test
    public void test_getTotal() {
        Student student = new Student("Adithya", "4KV16CS001", 70, 80, 60, 80, 75, 86);

        assertEquals(451, student.getTotal() );
    }

    @Test
    public void test_getAverageOfStudents() {

        List<Student> studentList = Arrays.asList(
                new Student("Adithya", "4KV16CS001", 70, 80, 60, 80, 75, 86),
                new Student("Poorna", "4KV16CS002", 74, 75, 60, 80, 75, 86),
                new Student("Ramana", "4KV16CS003", 78, 97, 60, 80, 75, 86),
                new Student("Ajith", "4KV16CS004", 82, 80, 60, 80, 75, 86)
        );

        assertEquals(76, Student.getAverageOfStudents(studentList, Student.SUBJECT.SUBJECT1), 0.05);
    }
}
