//package org.springMvc.controller;
//
//import org.springMvc.model.Admin;
//import org.springMvc.service.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/admin")
//public class AdminController {
//	
//	@Autowired
//	AdminService adminService;
//	
//	@ResponseBody
//    @PostMapping("/adminlogin")
//    public String login(@RequestBody Admin admin,HttpSession session)
//    {
//    	return adminService.login(admin,session);
//    }
//	
//	@GetMapping("/adminDashboard")
//	public String openDashboard(HttpSession session,Model model) {
//		
//		String adminName=(String)session.getAttribute("name");
//		if(adminName==null)
//		{
//			return "redirect:/admin/";
//		}
//		model.addAttribute("adminName", adminName);
//	    return "adminDashborad";
//	}
//}
