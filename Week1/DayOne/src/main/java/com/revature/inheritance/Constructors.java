package com.revature.inheritance;


class A{
	public A(){
		System.out.println("Constructor A");
	}
}

class B extends A{
	public B(){
		System.out.println("Constructor B");
	}
}
class C extends B{
	public C(){
		System.out.println("Constructor C");
	}
}

public class Constructors {

	public static void main(String[] args) {
		C c = new C();
		

	}

}

