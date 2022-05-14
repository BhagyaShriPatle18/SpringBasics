package com.csi.core83;

class Employee12
{
	private int empID;

	private String empName;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

public class GetSetMEthodClass {

	public static void main(String[] args) {
		
		Employee12 emp = new Employee12();
		
		emp.setEmpID(88);
		emp.setEmpName("Bhagya");
		
		System.out.println(" "+emp.getEmpID() + "\t" + emp.getEmpName());
	
	}

}
