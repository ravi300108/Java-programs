package javaprograms;

public class Method {
	public void smtg() {
		System.out.println("This is from class smtg");
	}
	public static void main(String[] args) {
		System.out.println("This is from main class");
		Method m=new Method();
		m.smtg();
	}

}
