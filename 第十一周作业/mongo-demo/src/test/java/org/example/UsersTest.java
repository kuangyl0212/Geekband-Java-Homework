package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author forest
 * @Date 2022/11/13 21:39
 * @Version 1.0
 */
@SpringBootTest(classes = {MongoDemoApplication.class})
class UsersTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveUser() {
        User user = User.builder().name("Robbin").build();
        userRepository.save(user);
    }

    @Test
    void testFindUsers() {
        List<User> users = userRepository.findAll();
        for (User user: users) {
            System.out.println(user.name);
        }
    }
}