package javaprograms;
class A{
	int x= 1; int y=2;
	void mul() {
		System.out.println("mul is: "+ x*y);
		
	}
	void smtg() {
		System.out.println("THis is supr class");
		
	}
	
	
}
class B extends A{
	int z=3;
	void mul() {
		System.out.println("mul is: "+(x*100));
	}
	void add() {
		System.out.println("add is: "+(x+y+z));
	}
	void smt() {
		System.out.println("THis is sub class");
	}
	void st() {
		super.mul();
		this.mul();
		this.add();
	}
}
class C extends B{
	void add(int g) {
		System.out.println("add is: "+x+y+g);
	}
}
public class Multi {
public static void main(String[] args) {
	C c=new C();
	c.st();
	c.add(6);

}
}
