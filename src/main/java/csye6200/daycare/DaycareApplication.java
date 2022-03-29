package csye6200.daycare;

import csye6200.daycare.Model.School;
import csye6200.daycare.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaycareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaycareApplication.class, args);
		Student students=new Student();
	}

}
