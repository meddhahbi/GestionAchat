package com.exemple.GestionAchat.ServiceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

public interface BaseServiceInterface <T, id>{

	
	 public List<T> retrieveAll();
	    public T add (T e);
	    public T update (T e);
	    public T retrieve (id id);
	    public void remove(id id);
	
	
}
