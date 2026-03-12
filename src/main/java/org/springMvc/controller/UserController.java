package org.springMvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springMvc.model.User;
import org.springMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
    @RequestMapping("/userDashboard")
    public String dashboard(HttpSession session,Model model)
    {
    	String userName=(String) session.getAttribute("userName");
    	if(userName==null)
    	{
    		return "redirect:/user/";
    	}
    	model.addAttribute(userName, userName);
        return "userDashboard";
    }
 
}
