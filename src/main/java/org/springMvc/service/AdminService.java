package org.springMvc.service;

import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Location;
import org.springMvc.model.State;

public interface AdminService {
	public String saveState(State state);
	List<State> getStates();
	public List<City> getCities(int statecode);
	public void addCity(City c);
	public void addLocation(Location l);
	public void addLocation(String locationname,int cid);
}
