class Tester{
	int deposit=500;
	int disp()
	{
		System.out.println(deposit);
		return deposit;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		Tester t=new Tester();
		System.out.println(t.deposit);
		t.deposit=50000;
		System.out.println(t.deposit);
		t.disp();
		

	}

}
