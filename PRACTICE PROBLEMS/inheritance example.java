package javaprograms;
class C1{
	 public void smtg() {
		 System.out.println("This is from super class.");
	 }}
class C2 extends C1{
	public void smtg2() {
		System.out.println("This is from sub class");
	}
}
public class Method2{
public static void main(String[] args) {
	C2 c=new C2();
	c.smtg();
	c.smtg2();
}
}


