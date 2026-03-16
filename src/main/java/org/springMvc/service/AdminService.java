package org.springMvc.service;

import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Location;
import org.springMvc.model.Property;
import org.springMvc.model.PropertyDisplay;
import org.springMvc.model.State;

public interface AdminService {
	public String saveState(State state);
	List<State> getStates();
	public List<City> getCities(int statecode);
	public List<Location> getLocations(int locationcode);
	public void addCity(City c);
	public void addLocation(String locationname,int cid);
	public void saveLocation(Location loc);

	public void saveProperty(Property p);

	public List<PropertyDisplay> getAllProperty();
}
