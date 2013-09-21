package br.com.onequest.model.service;

import java.io.Serializable;
import java.util.List;

public interface ServiceBase<T extends Serializable> {

	public List<T> list(int offset, int max);
	
	public void save(T entity);
	
	public void delete(T entity);
	
	public T get(Long id);
	
	

}
