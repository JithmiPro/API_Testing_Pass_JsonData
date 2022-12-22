package com.example.Pro01.Controller;

import com.example.Pro01.DTO.DeviceFingerprintDTO;
import com.example.Pro01.DTO.Request.UserLoginRequest;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class GreetingController {
    String browserName;

    public void UAgentInfo(HttpServletRequest request) {

        browserName = request.getHeader("User-Agent");
    }

    InetAddress IP;

    {
        try {
            IP = InetAddress.getLocalHost();


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    @GetMapping("/indexx")
    public ModelAndView getPage1() {
        return new ModelAndView("pgOne.html");
    }


    // Title bar

    @RequestMapping("/TitleBar")
    public ModelAndView getTitleBar(Model model, Session session) {
        UserLoginRequest request = new UserLoginRequest();

        model.addAttribute("abc", "uuu");

        return new ModelAndView("menuBar.html");
    }

    @RequestMapping("/FrontPg")
    public ModelAndView getPage2() {
        return new ModelAndView("Pg-01.html");
    }

    @RequestMapping("/NextPg02")
    public ModelAndView getPage5(Model model) {
        model.addAttribute("actualIP", IP);
        model.addAttribute("browserName", browserName);
        return new ModelAndView("Pg-02.html");
    }

    @RequestMapping("/NextPg_03")
    public ModelAndView getPage6() {
        return new ModelAndView("Pg-03.html");
    }

    @RequestMapping("/NextPg_04")
    public ModelAndView getPage7() {
        return new ModelAndView("Pg-04.html");
    }

    @RequestMapping("/NextPg_05")
    public ModelAndView getPage8() {
        return new ModelAndView("Pg-05.html");
    }

    @RequestMapping("/NextPg_06")
    public ModelAndView getPage9() {
        return new ModelAndView("Pg-06.html");
    }

    @RequestMapping("/NextPg_07")
    public ModelAndView getPage10() {
        return new ModelAndView("Pg-07.html");
    }

    @RequestMapping("/SuccessPage")
    public ModelAndView getPage3() {
        return new ModelAndView("SuccessPage.html");
    }

    @RequestMapping("/ErrorPage")
    public ModelAndView getPage4() {
        return new ModelAndView("ErrorPage.html");
    }

}
