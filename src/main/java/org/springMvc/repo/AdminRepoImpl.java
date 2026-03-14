package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepoImpl implements AdminRepo {

	
	@Autowired
	JdbcTemplate jdbc;
	
	public boolean existsByStatename(String statename) {
		String sql = "SELECT COUNT(*) FROM state WHERE statename = ?";
        Integer count = jdbc.queryForObject(sql, Integer.class, statename);
        return count != null && count > 0;
	}

	@Override
	public int saveState(State state) {
		 return jdbc.update(
			        "insert into state(statecode,statename) values(?,?)",
			        state.getStatecode(),
			        state.getStatename()
			    );
	}
	
	public List<State> getStates()
	{
	return jdbc.query("select * from state",(rs,i)->{

	State s=new State();

	s.setStatecode(rs.getInt("statecode"));
	s.setStatename(rs.getString("statename"));

	return s;

	});
	}
}
