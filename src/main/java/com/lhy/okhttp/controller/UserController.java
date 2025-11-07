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
import com.lhy.okhttp.domain.request.user.UserManageAddReq;
import com.lhy.okhttp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
@Tag(name = "用户管理")
public class UserController {

    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "Hello, this is a test!";
    }

    @GetMapping("/list")
    @Operation(summary =  "用户列表")
    public List<User> userList() {
        List<User> list = userService.lambdaQuery().list();
        return list;
    }

    @PostMapping("/add")
    @Operation(summary = "添加用户")
    public String userAdd(@RequestBody UserManageAddReq req){
        User user = new User();
        user.setName(req.getPassword());
        user.setEmail(req.getUsername());
        userService.save(user);
        return "添加成功";
    }


}
