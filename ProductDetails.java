package com.elc.exa;

public class ProductDetails {

	public static void main(String[] args) {
		Product pro = new Product();
		pro.setProductDetails("Laptop",501,75000.0);
		String res = pro.getProductDetails();
		System.out.println(res);

	}

}
