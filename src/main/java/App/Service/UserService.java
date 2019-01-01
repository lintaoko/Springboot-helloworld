package App.Service;

import App.Mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserService {
    @Resource
    private UserMapper userMapper;

    public int insertUser(String name,Integer age){
        int insertUserResult =userMapper.insert(name,age);
        log .info("result:{}",insertUserResult);
        return insertUserResult;
    }

}