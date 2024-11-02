package com.escass.login.services;

import com.escass.login.Entities.UserEntity;
import com.escass.login.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserMapper userMapper;
    private UserEntity userEntity;

    public boolean userCheck() {
        UserEntity user = userMapper.selectUser(userEntity.getId(), userEntity.getPassword());

        return user != null;
    }
}
