package com.Utility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.pojo.Product;

public class AjaxUtility {

	public static HashMap<Integer,Product> getData(){
		HashMap<Integer, Product> productListMap=new HashMap<Integer, Product>();
		productListMap.put(305,new Product(305,"Sony     ","Vaio Laptop  "));
		productListMap.put(102,new Product(102,"Apple    ","Iphone 7     "));
		productListMap.put(205,new Product(205,"Micromax ","Funbook      "));
		productListMap.put(304,new Product(304,"Acer     ","Inspiron     "));
		productListMap.put(103,new Product(103,"Motorola ","Moto G       "));
		productListMap.put(204,new Product(204,"Google   ","Nexus7       "));
		productListMap.put(101,new Product(101,"Samsung  ","Galaxy Grand "));
		productListMap.put(206,new Product(206,"Sony     ","Bravia       "));
		productListMap.put(203,new Product(203,"Lenovo   ","Yoga         "));
		productListMap.put(202,new Product(202,"Amazon   ","Kindle       "));
		productListMap.put(402,new Product(402,"Samsung  ","Curved TV    "));
		productListMap.put(403,new Product(403,"LG       ","Golden Eye TV"));
		productListMap.put(401,new Product(401,"Sony     ","KLV 32       "));
		productListMap.put(406,new Product(406,"UHD TV   ","Micro Max    "));
		productListMap.put(106,new Product(106,"Canvas Plus","Micromax   "));
		productListMap.put(404,new Product(404,"Letv     ","Super snap TV"));
		productListMap.put(405,new Product(405,"Panasonic","pana view TV "));
		productListMap.put(105,new Product(105,"HTC      ","One          "));
		productListMap.put(301,new Product(301,"Acer     ","E210 laptop  "));
		productListMap.put(302,new Product(302,"Lenovo   ","P500 laptop  "));
		return productListMap;
	}

	public StringBuffer readData(String searchAreaText){
		StringBuffer sb=new StringBuffer();
		HashMap<Integer, Product> data=getData();
		Set<Map.Entry<Integer, Product>> entries=data.entrySet();
		for(Map.Entry<Integer, Product> prodMap:entries){
			Product product=prodMap.getValue();
			if(product.getProductName().toLowerCase().startsWith(searchAreaText.toLowerCase())||product.getBrand().toLowerCase().startsWith(searchAreaText.toLowerCase())){
				sb.append("<Product>");
				sb.append("<ProductId>"+product.getProductID()+"</ProductId>");
				sb.append("<ProductName>"+product.getBrand()+product.getProductName()+"</ProductName>");
				sb.append("</Product>");
			}
		}
		return sb;
	}
}
