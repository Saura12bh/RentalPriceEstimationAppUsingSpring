package org.springMvc.repo;

import java.util.List;

import org.springMvc.model.State;

public interface AdminRepo {
	public int saveState(State state);
	public boolean existsByStatename(String statename);
	List<State> getStates();

}
