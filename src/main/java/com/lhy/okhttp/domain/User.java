package com.lhy.okhttp.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:42
 * @description:
 */
@Data
@Schema(description = "用户实体")
public class User extends Model<User> {

    @Schema(description = "用户ID")
    private Long id;

    @Schema(description = "真实姓名")
    private String name;

    @Schema(description = "邮件")
    private String email;

    @Schema(description = "创建时间")
    private Date createdAt;
}
