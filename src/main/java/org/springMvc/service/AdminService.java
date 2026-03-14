package org.springMvc.service;

import java.util.List;

import org.springMvc.model.State;

public interface AdminService {
	public String saveState(State state);
	List<State> getStates();
}
