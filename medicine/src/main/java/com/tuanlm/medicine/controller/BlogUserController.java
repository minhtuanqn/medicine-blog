package com.tuanlm.medicine.controller;

import com.tuanlm.medicine.entity.BlogUserEntity;
import com.tuanlm.medicine.service.BlogUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class BlogUserController {
    private BlogUserService userService;

    public BlogUserController(BlogUserService userService) {
        this.userService = userService;
    }

}
