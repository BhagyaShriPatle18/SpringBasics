package com.csi.core83;

class Employee
{
         	private int empId;// with in class
	
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	
}
public class PrivateModifierConcept {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setEmpId(1);
		employee.setEmpName("MAHESH");
		
		System.out.println(""+employee.getEmpId()+"\t"+employee.getEmpName());
		
		

	}
}

