package com.deepanshu.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ProductMainOperation {

	public static void main(String[] args) {
		// make the list and ad the product in the list

		List<ProductDao> products = Arrays.asList(new ProductDao("Laptop", "Electronics", 1200.0, true),
				new ProductDao("Mobile Phone", "Electronics", 800.0, false),
				new ProductDao("TV", "Electronics", 1500.0, true), 
				new ProductDao("Shirt", "Clothing", 30.0, true),
				new ProductDao("Jeans", "Clothing", 50.0, true), 
				new ProductDao("Backpack", "Accessories", 50.0, true));

		/*
		 * operations
		 * 
		 * 1) Filter the list to find all products that are currently available
		 */
		products.stream().filter(productss -> productss.isAvailability()).forEach(list -> {
			System.out.println("the available products are: " + list.getProductName());
		});
		
		// 2) Calculate the total price of all available products in the "Electronics" category.
		double totalPrice = products.stream().filter(productss -> productss.isAvailability())
		.filter(categories -> categories.getProductCategory().equalsIgnoreCase("Electronics"))
		.mapToDouble(price -> price.getPrice()).sum();
		
		System.out.println("the total price is : "+ totalPrice);
		
//		3) Find the product with the highest price.
		  Optional<ProductDao> highestPrice = products.stream().max(Comparator.comparing(ProductDao::getPrice));
		  highestPrice.ifPresent(totalFinalPrice -> {
			  System.out.println("the product of highest price is: "+ totalFinalPrice.getProductName() + 
					  "and the price of that product is : "+ totalFinalPrice.getPrice());
		  });
		  
//	   4) Group the products by category.
		 Map<String ,List <ProductDao>> cate =  products.stream().collect(Collectors.groupingBy(ProductDao::getProductCategory));
		  cate.forEach((categories, productList) -> {
			  System.out.print("categories: " + categories);
			  productList.forEach(productss ->{
				  System.out.println(" Product Name: "+ productss.getProductName());
			  });
		  });
		  
//	5) Calculate the average price of products in each category.
		  
		OptionalDouble prices =  products.stream().mapToDouble(price -> price.getPrice()).average();
		prices.ifPresent(totalAverage -> {
			System.out.println(totalAverage); 
		}); 
		
//		6) Sort the products by price in descending order.
		
	 List<ProductDao> descOrder	=  products.stream().sorted(Comparator.comparing(ProductDao::getPrice).reversed()).toList();
	descOrder.forEach(listt -> {
		System.out.println("the product list is : " + listt.getProductName()+ "according to " + listt.getPrice() );
	});
		  
	}
}
