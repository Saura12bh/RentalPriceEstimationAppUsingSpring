//package org.springMvc.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springMvc.model.User;
//import org.springMvc.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
//	@Autowired
//	UserService userService;
//	
//	@RequestMapping("/")
//	public String home()
//	{
//		return "login";
//	}
//	 @RequestMapping("/reg")
//    public String reg()
//    {
//    	return "register";
//    }
//    @RequestMapping("/backLg")
//    public String  backLg()
//    {
//    	return "login";
//    }
//    @RequestMapping("adminlog")
//    public String adminlog()
//    {
//    	return "adminLogin";
//    }
//    
//    @ResponseBody
//    @PostMapping("/register")
//    public String register(@RequestBody User user)
//    {
//     return userService.register(user);
//     
//    }
//    
//    @ResponseBody
//    @PostMapping("/login")
//    public String login(@RequestBody User user,HttpSession session)
//    {
//    	return userService.login(user,session);
//    }
//    
//    @RequestMapping("/dashboard")
//    public String dashboard(HttpSession session,Model model)
//    {
//    	String userName=(String) session.getAttribute("userName");
//    	if(userName==null)
//    	{
//    		return "redirect:/user/";
//    	}
//    	model.addAttribute(userName, userName);
//        return "dashboard";
//    }
// 
//}
