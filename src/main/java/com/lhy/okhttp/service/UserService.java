package com.lhy.okhttp.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhy.okhttp.dao.UserMapper;
import com.lhy.okhttp.domain.User;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:42
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
