package com.escass.login.services;

import com.escass.login.Entities.UserEntity;
import com.escass.login.mapper.UserMapper;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public boolean userCheck(UserEntity user, HttpSession session) {
        user = userMapper.selectUser(user.getId(), user.getPassword());
        session.setAttribute("login", true);
        session.setAttribute("user", user);

        return user != null;
    }
}
