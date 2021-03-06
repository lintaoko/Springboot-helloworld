package App.Controller;

import App.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/insertUser")
    public Integer insertUser(String name,Integer age){
         return userService.insertUser(name,age);
    }
}
