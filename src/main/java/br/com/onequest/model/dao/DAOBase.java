package br.com.onequest.model.dao;

import java.util.List;

public interface DAOBase<T> {
	
	public List<T> list(int offset, int max);
	
	public void save(T objeto);
	
	public void delete(T objeto);
	
	public T get(Long id);
	
}
