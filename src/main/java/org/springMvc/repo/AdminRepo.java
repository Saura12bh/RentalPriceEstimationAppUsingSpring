package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Location;
import org.springMvc.model.State;

public interface AdminRepo {
	public int saveState(State state);
	public boolean existsByStatename(String statename);
	List<State> getStates();
	public List<City> getCities(int statecode);
	public void addCity(City c);
	public void addLocation(Location l);
	public void addLocation(String locationname,int cid);
}
