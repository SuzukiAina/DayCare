package csye6200.daycare.Factory;

import csye6200.daycare.Model.Student;
import csye6200.daycare.Model.Teacher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherFactory {
    private static List<Teacher> teachers;
    {
        List<Teacher> teachers=new ArrayList<Teacher>();
        teachers.add(new Teacher(id,"John",32,5000));
        teachers.add(new Teacher(id,"Marry",34,6000));
    }
    public static int id=1;
    public static List<Teacher> getStudents(){return teachers;}
}
