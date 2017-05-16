package com.kwave.java.polymorphism;

public class Father {

	public String name = "아빠이름";
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "p"+name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public class FFF {
		
		String name;
		int age;
		
		public void setName(String name)
		{
			this.name = name;	// this.a에서 a는 첫번째 만나는 전역변수이다.
		}
	}
}
