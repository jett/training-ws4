package net.incuventure.template.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {

        Map loginForm = new HashMap();

        loginForm.put("userid","test");

        model.addAttribute("message", "show accounting stuff");
        model.addAttribute("loginForm", loginForm);

        return "login/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute(value="loginForm") ModelMap model) {

        System.out.println(model.toString());
        return "login/login";
    }

}
