package com.example.SpringBoot3Practice.controllers;

import ch.qos.logback.core.model.Model;
import com.example.SpringBoot3Practice.model.response;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

//    @RequestMapping("/{temp}")
//    public String index(@PathVariable String temp) {
//        return switch (temp) {
//            case "index" -> "index";
//            default -> "other";
//        };
//    }

    @RequestMapping("/abc")
    public Object index() {
        Map<String, Object> object = new HashMap<>();
        object.put("key1", "value1");
        return object;
    }
    @RequestMapping("/secret")
    public Object secret(HttpServletRequest request) {
        String user = request.getRemoteUser();
        Map<String, Object> object = new HashMap<>();
        object.put("key1", user);
        return object;
    }
}
