package com.example.Pro01.Controller;

import com.example.Pro01.DTO.UserLoginDTO;
import com.example.Pro01.Repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserLoginController {
    @Autowired
    UserLoginRepo userLoginRepo;

    @PostMapping(value = "/saveServiceType",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.ALL_VALUE)
    public String saveServiceType(HttpServletRequest request, HttpSession seession, @ModelAttribute UserLoginDTO dto) {
        return "redirect:/SuccessPage";
    }
}
