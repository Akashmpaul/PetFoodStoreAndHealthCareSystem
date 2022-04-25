package com.spring.pet.global;

import java.util.ArrayList;
import java.util.List;

import com.spring.pet.entity.Product;

public class GlobalData {
	
	public static List<Product> cart;
	// import list
	static {
	        cart =  new ArrayList <Product>();
	        //save this
	    }
}
