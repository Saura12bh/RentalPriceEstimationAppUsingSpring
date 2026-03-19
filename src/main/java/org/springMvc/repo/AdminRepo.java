package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.City;
import org.springMvc.model.Inquiry;
import org.springMvc.model.Location;
import org.springMvc.model.Property;
import org.springMvc.model.PropertyDisplay;
import org.springMvc.model.State;

public interface AdminRepo {
	public int saveState(State state);
	public boolean existsByStatename(String statename);
	List<State> getStates();
	public List<City> getCities(int statecode);
	public void addCity(City c);
	public void saveLocation(Location loc);
	public void addLocation(String locationname,int cid);
	
	public List<Location> getLocations(int cid);
	public void saveProperty(Property p);
	
	public List<PropertyDisplay> getAllProperty();
	public List<Property> searchProperty(String city);
	public void deleteProperty(int id);

	 public int updateProperty(Property p);
	 public Property getPropertyById(int id);
	 
	 public int saveInquiry(Inquiry inquiry);
	 public List<Inquiry> getAllInquiries();
}
