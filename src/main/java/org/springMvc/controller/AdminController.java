package org.springMvc.controller;


import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Location;
import org.springMvc.model.State;
import org.springMvc.model.User;
import org.springMvc.service.AdminService;
import org.springMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/adminDashboard")
	public String openDashboard(HttpSession session,Model model) {
		
		String adminName=(String)session.getAttribute("un");
		if(adminName==null)
		{
			return "redirect:/";
		}
		model.addAttribute("adminName", adminName);
	    return "adminDashboard";
	}
	
	
	//logout 
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
	    session.invalidate(); // session destroy
	    return "redirect:/lg"; // login page
	}
	
	//display user
	@GetMapping("/display")
	@ResponseBody
	public List<User> display()   
	{
		List<User> list=userService.display();
		return list;
	}
	//delete user
	@GetMapping("/delete/{id}")
	@ResponseBody
	public String deleteUser(@PathVariable("id") int id)
	{
	userService.delete(id);
	return "User Deleted Successfully";
	}
		//save state
	@ResponseBody
	 @PostMapping("/savestate")
	 public String saveState(@RequestBody State state)
	  {
	     return adminService.saveState(state) ;
	   }
	
	@ResponseBody
	@GetMapping("/states")
	public List<State> getStates(){

	return adminService.getStates();
	}
	
	
	@PostMapping("/addCity")
	public String addCity(City c) {
	adminService.addCity(c);
	return "redirect:/admin/adminDashboard";
	}
	
	@ResponseBody
	@GetMapping("/cities/{statecode}")
	public List<City> getCities(@PathVariable int statecode){
	return adminService.getCities(statecode);
	}

//	@PostMapping("/addLocation")
//	public String addLocation(Location l){
//
//	adminService.addLocation(l);
//
//	return "redirect:/admin/adminDashboard";
//	}
	
	@PostMapping("/addLocation")
	@ResponseBody
	public String addLocation(@RequestParam String locationname,
	                          @RequestParam int cid){

	adminService.addLocation(locationname,cid);

	return "Location Added Successfully";

	}

}
