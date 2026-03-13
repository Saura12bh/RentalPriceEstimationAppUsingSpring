package org.springMvc.service;

import org.springMvc.model.User;
import org.springMvc.repo.UserRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService{

	 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Autowired
	UserRepoImpl userRepo;
	 
	@Override
	public String regUser(User user) {
		
		boolean b=userRepo.existsByUsername(user.getUsername());
		if(b==true)
		{
			return "username already present please try another username";
		}
		//ram ->user ->replace ->encrpt ->user
		user.setPassword(encoder.encode(user.getPassword()));
		//user taklela password incript zala ani tu user password madhe convert
		int v=userRepo.save(user);  //101 ram encript from 
		if(v>0)
		{
			return "user regeration sucessfully";
		}
		else {
			return "some problem is here";
		}
	}

	public String loginUser(User user,HttpSession session)
	{
		User userDb=userRepo.findByUserName(user.getUsername());
		if(userDb==null)
		{
			return "username is incorrect please try correct";
		}
		
		if(encoder.matches(user.getPassword(), userDb.getPassword()))
		{
			session.setAttribute("un",userDb.getUsername());
			if ("ADMIN".equals(userDb.getRole())) {
                return "Admin Login Success";
            } else {
                return "User Login Success";
            }
		}
		else {
			return "password is incorrect";
		}
	}
}
