package com.escass.login.mapper;

import com.escass.login.Entities.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(UserEntity user);

    UserEntity selectUser(String id, String password);
}
