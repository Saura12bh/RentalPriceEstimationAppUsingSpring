package org.springMvc.repo;

import org.springMvc.model.User;

public interface UserRepo {
	public User findByUserName(String username);
	public boolean existsByUsername(String username);
	public int save(User user);
}
