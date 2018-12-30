package App.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
//@restController 表示该类所有方法返回json 格式 =@App.App.Controller +@ResponseBody
public class MemberController {

    //test
    @RequestMapping("/abc")
    public String memberIndex(){
        return "abcdefg";
    }
}
