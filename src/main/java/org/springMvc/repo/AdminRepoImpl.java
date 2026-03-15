package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Location;
import org.springMvc.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	
	public List<City> getCities(int statecode){

		String sql="select * from city where statecode=?";

		return jdbc.query(sql,new BeanPropertyRowMapper<>(City.class),statecode);

		}

		public void addCity(City c){

		String sql="insert into city(name,statecode) values(?,?)";

		jdbc.update(sql,c.getName(),c.getStatecode());
		}

		public void addLocation(Location l){

			String sql="insert into location(locationname,cid) values(?,?)";

			jdbc.update(sql,l.getLocationname(),l.getCid());

			}

		@Override
		public void addLocation(String locationname,int cid){

			String sql="insert into location(locationname,cid) values(?,?)";

			jdbc.update(sql,locationname,cid);

			}

}
