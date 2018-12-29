package App.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/aaaa")
    public String aaa(){
        return "Suuu";
    }
    @RequestMapping("/bbbb")
    public String bbb(){
        int i;
        i=5/0;
        return "Suuu";
    }
}
