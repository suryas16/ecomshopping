package com.retail.ecombackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.retail.ecombackend.dao.CategoryDAO;
import com.retail.ecombackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static  List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("TV description");
		category.setImageURL("cat1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Mobile description");
		category.setImageURL("cat2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop description");
		category.setImageURL("cat3.png");
		
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		return categories;
	}
	@Override
	public Category get(int id) {
		
		for(Category category:categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}
}
