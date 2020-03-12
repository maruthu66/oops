package abstraction;

public class Logic extends Partial {

	@Override
	public void bike() {
		System.out.println("honda");
	}
	public static void main(String[] args) {
		Logic v=new Logic();
		v.bike();
	}

}
