package abstraction;

public  class Parent  implements Child {

	@Override
	public void baby() {
		System.out.println("first logic");
	}

	@Override
	public void studet() {
		System.out.println("second logic");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.baby();
	}
	
}
