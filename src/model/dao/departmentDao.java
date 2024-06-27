package model.dao;

import java.util.List;

import model_entities.Department;

public interface departmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department>findAl();
	
}
