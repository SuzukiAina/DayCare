package csye6200.daycare.Factory;

import csye6200.daycare.Model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupFactory {
    private static List<Student> students;
    {
        List<Student> students=new ArrayList<Student>();
        students.add(new Student(id,"Tony",3,3,new Date(121,9,1),1,2,3,4,true,false));
        students.add(new Student(id+1,"Amy",4,5,new Date(121,9,1),1,2,3,4,true,false));
    }
    public static int id=1;
    public static List<Student> getStudents(){return students;}
}
