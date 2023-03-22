package org.edu;

import org.flip.College;
import org.flip.Employee;


public class Education {
	public  static int id = 25;
	public  void educationDetails() {
		id =100;
		System.out.println("educationalDetails"+id);
	}
	public  final void educationDetails1() {
		System.out.println("education"+id);
	}
	public  final  void educationDetails2() {
		System.out.println("education");
	}
	public static void main(String[] args) {
		
		Education e = new Education();
		e.educationDetails();
		System.out.println(Education.id);

	
		
	
		
		
		
		
	
		
		
	}

}
