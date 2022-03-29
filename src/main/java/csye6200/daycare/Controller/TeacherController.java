package csye6200.daycare.Controller;

import csye6200.daycare.Factory.StudentFactory;
import csye6200.daycare.Model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TeacherController {

    @RequestMapping(value="/teacher")
    private String showStudent(Model model){
        List<Student> students=new ArrayList<>();
        students.addAll(StudentFactory.getStudents());
        model.addAttribute("student_list", students);
        return "StudentList";
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Upload fail, please choose your file";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "C:\\Users\\renqi\\Desktop\\Java Orientation\\DayCare\\DayCare\\src\\main\\resources\\static\\";
        File dest = new File(filePath + fileName);
        try {
            if (!dest.exists()){
                dest.createNewFile();
            }
            file.transferTo(dest);
            LOGGER.info("Upload success");
            return "Upload success";
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return "Upload fail!";
    }
}
