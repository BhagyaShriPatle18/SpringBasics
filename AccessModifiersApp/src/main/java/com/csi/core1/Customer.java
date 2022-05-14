package com.csi.core1;

public class Customer {
	
	
   
	
	protected int custId= 3456;
	protected String custName = "CSI";
	
	public int prodID = 8965;
	public String prodName = "ABC";
	
	public static void main(String[] args) {
		
		Customer customer =new Customer();
		System.out.println("\t"+ customer.custId + "\t" + customer.custName);
		System.out.println("\t" + customer.prodID + "\t" + customer.prodName);
		
		
	}
}
