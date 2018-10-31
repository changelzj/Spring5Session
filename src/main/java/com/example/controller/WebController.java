package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class WebController {

    @GetMapping("session")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return session.getId() + "  -- server 3 --  " + request.getServletContext().getRealPath("/");
    }

    @GetMapping("invalidate")
    public String invalidate(HttpSession session) {
        session.invalidate();
        return "invalidate";
    }

}



