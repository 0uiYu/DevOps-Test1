package com.lhy.okhttp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhy.okhttp.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaoyu
 * @since 2025/10/28 15:41
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
