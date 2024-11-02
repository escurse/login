package com.escass.login.controllers;

import com.escass.login.services.BoardService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/article")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @RequestMapping(value="/board", method= RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getBoard(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("article/board");
        if (boardService.boardCheck(session)) {
            modelAndView.setViewName("redirect:/user/login");
            return modelAndView;
        }
        return modelAndView;
    }
}
