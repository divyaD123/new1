package org.flip;

import org.edu.Education;

public  final class Employee extends College {
	public Employee() {
		this(100);
		System.out.println("default constructor");
		}
	public Employee(int id) {
		this("amu");
		System.out.println("integer constructor");
		}
	public Employee(String name) {
		this(234.67f);
		System.out.println("string  constructor");
		}
	public Employee(float value) {
		this(true);
		System.out.println("float constructor");
		}
	public Employee(boolean cocept) {
		
		super(100);
		System.out.println("boolean  constructor");
		}
	
	


	
	public static void main(String[] args) {
		Employee c = new Employee();
		
	
		
	

		
		
	}

}
