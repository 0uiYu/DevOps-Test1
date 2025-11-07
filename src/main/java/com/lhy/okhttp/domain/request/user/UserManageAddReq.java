package com.lhy.okhttp.domain.request.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @description:
 * @since 2025/11/7 13:42
 */

@Data
@Schema(description = "添加用户请求参数")
public class UserManageAddReq implements Serializable {

    private static final long serialVersionUID = -3231435334802265332L;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "性别")
    private Integer gender;

    @Schema(description = "电话号码")
    private String phoneNumber;

    @Schema(description = "密码")
    private String password;


}
