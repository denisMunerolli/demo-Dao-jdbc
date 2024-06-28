package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model_entities.Seller; 

public class Progran {

	public static void main(String[] args) {
		
	
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
