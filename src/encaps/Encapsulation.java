package encaps;

public class Encapsulation {

	public static void main(String[] args) {
		Tester t=new Tester();
		t.disp();
		int new_deposit=t.getDeposit();
		System.out.println(new_deposit);
		new_deposit=50000;
		System.out.println(new_deposit);//here the value of  global variable doesnt change as its private
		t.disp();
		
		
	}

}

