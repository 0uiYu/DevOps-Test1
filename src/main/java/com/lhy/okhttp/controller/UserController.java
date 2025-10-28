package com.lhy.okhttp.controller;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:41
 */

import com.lhy.okhttp.domain.User;
import com.lhy.okhttp.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/list")
    public List<User> userList(){
        List<User> list = userService.lambdaQuery().list();
        return list;
    }
}
