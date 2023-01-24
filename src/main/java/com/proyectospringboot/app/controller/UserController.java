package com.proyectospringboot.app.controller;

import com.proyectospringboot.app.entity.User;
import com.proyectospringboot.app.repository.RoleRepository;
import com.proyectospringboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/userForm")
    public String userForm(Model model){
        model.addAttribute("userForm", new User());
        model.addAttribute("userList", userService.getAllUsers());
        model.addAttribute("roles",roleRepository.findAll());
        model.addAttribute("listTab", "active");
        return "user-form/user-view";
    }
}
