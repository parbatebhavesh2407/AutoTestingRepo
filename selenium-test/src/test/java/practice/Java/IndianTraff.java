package practice.Java;

public class IndianTraff implements CentralTraff {

	public static void main(String[] args) {
		
		CentralTraff ct = new IndianTraff();
		ct.greenGo();
		ct.redStop();
		ct.flashYellow();
		System.out.println(a);
	}

	@Override
	public void greenGo() {
		System.out.println("Go - Implementation");

	}

	@Override
	public void redStop() {
		System.out.println("Stop Here - Implementation");

	}

	@Override
	public void flashYellow() {
		System.out.println("Look and Go - Implementation");

	}

}
