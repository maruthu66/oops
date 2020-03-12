package polymorphism;

public class CompileTime {
	public void manyForms(int id) {
		System.out.println(id);
	}
	public void manyForms(String name) {
		System.out.println(name);
	}
	public void manyForms(double value,char a) {
		System.out.println(value);
		System.out.println(a);
	}
	public void manyForms(String name,long phno) {
		System.out.println(name);
		System.out.println(phno);
	
	}
	public static void main(String[] args) {
		CompileTime c=new CompileTime();
		c.manyForms(10);
		c.manyForms("maruthu", 9952861703l);
	}
	

}
