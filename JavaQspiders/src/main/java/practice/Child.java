package practice;

public class Child {
	public   void m1() {	
		System.out.println("Child implementation");
	} 
	public static void main(String[] args) {
		Child p= new Child();
		p.m1();
		System.out.println(new Child() instanceof Child);
	}
}
