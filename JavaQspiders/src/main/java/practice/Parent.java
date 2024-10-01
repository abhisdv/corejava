package practice;

public class Parent {
	Parent(){
		new Parent();
	}

	public static void main(String[] args) {
		Parent p= new Parent();
	}
}
