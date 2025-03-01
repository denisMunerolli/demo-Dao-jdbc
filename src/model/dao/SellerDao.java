package model.dao;

import java.util.List;

import model_entities.Department;
import model_entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller>findAl();
	List<Seller>findByDepartment(Department department);
	List<Seller> findAll();
}
