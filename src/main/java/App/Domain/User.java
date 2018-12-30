package App.Domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class User {
    String name;
    int age;

    public static void main(String[] args) {
        User user=new User();
        user.setName("name");
        user.setAge(555);
        log.info(user.toString());
    }
}
