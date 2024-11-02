package com.escass.login.services;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    public boolean boardCheck(HttpSession session) {
        Object loginData = session.getAttribute("login");
        return loginData == null;
    }
}
