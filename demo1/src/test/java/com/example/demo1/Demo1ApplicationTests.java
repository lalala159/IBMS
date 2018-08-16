package com.example.demo1;

import com.example.demo1.entity.Permission;
import com.example.demo1.entity.Role;
import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void findByUsername() {
        User u = userService.findByUsername("admin");
        Set<Role> roleSet = u.getRoles();
        for (Role role : roleSet){
            Set<Permission> permissionSet = role.getPermissions();
            for (Permission permission : permissionSet){
                System.out.println(permission.getName());
            }
            System.out.println(role.getName());
        }
    }

}
