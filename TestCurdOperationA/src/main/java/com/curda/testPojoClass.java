package com.curda;

public class testPojoClass {
	private static  String name;
	private static  String email;

	public static String getName() {
		return name;
	}
     
	public void setName(String name) {
		this.name = name;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public testPojoClass(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public testPojoClass() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" it is print Fourt time testPojoClass 2 ");
	}

	@Override
	public String toString() {
		return "testPojoClass [name=" + name + ", email=" + email + "]";
		
	}

}
