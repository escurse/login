package com.escass.login.services;

import com.escass.login.Entities.UserEntity;
import com.escass.login.mapper.UserMapper;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserMapper userMapper;
    private UserEntity userEntity;

    public boolean loginCheck(HttpSession session) {
        Object loginData = session.getAttribute("login");
        return loginData != null;
    }

    public boolean userCheck(HttpSession session) {
        UserEntity user = userMapper.selectUser(userEntity.getId(), userEntity.getPassword());
        session.setAttribute("login", true);
        session.setAttribute("user", user);

        return user != null;
    }
}
