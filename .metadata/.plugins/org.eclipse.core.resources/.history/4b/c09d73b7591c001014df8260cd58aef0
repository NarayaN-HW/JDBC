package dao;

import java.sql.SQLException;
import java.util.Collection;

public interface JdbcDao <T,K>{

	boolean save(T t) throws SQLException;
	Collection<T> getAll() throws SQLException;
	T getOnebyId(K k) throws SQLException;
	
}
