package com.codeacademy.diningreviewapi.controller;

import com.codeacademy.diningreviewapi.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/")
    public String home( HttpServletRequest request) {
        Locale locale = RequestContextUtils.getLocale(request);
        return "index";
    }
}