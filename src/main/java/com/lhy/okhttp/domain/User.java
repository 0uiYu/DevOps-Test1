package com.lhy.okhttp.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:42
 */
@Data
public class User extends Model<User> {
    private Integer id;
    private String username;
    private String password;
}
