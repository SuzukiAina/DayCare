package csye6200.daycare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping("/index")
    private String indexController(){
        return "index";
    }
}
