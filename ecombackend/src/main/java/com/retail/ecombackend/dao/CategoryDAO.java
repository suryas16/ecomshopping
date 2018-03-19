package com.retail.ecombackend.dao;


import java.util.List;

import com.retail.ecombackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
