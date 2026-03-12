package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements UserRepo{

	@Autowired
	JdbcTemplate jdbc;
	@Override
	public User findByUserName(String username) {
		List<User> list = jdbc.query("select * from user where username=?",//check krt username present ahe ka nahi
				new BeanPropertyRowMapper<>(User.class),
				username);
		if(list.isEmpty())
		{
			return null;
		}
		else {
			return list.get(0);   //0-user 1-password
		}
	}

	@Override
	public boolean existsByUsername(String username) {
		String sql = "SELECT COUNT(*) FROM user WHERE username = ?";
        Integer count = jdbc.queryForObject(sql, Integer.class, username);
        return count != null && count > 0;
	}

	@Override
	public int save(User user) {
		 return jdbc.update(
			        "insert into user(username,email,contact,password) values(?,?,?,?)",
			        user.getUsername(),
			        user.getEmail(),
			        user.getContact(),
			        user.getPassword()
			    );
	}

}
