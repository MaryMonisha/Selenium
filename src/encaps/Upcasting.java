package encaps;
class Downcasting
{
	void TestA()
	{
		System.out.println("im A");
	}
	void TestB()
	{
		System.out.println("im B");
	}
}





public class Upcasting extends Downcasting  {
	
	void TestA()
	{
		System.out.println("im A but overidden");//overidden
	}
	void TestC()
	{
		System.out.println("im C");
	}
	public static void main(String[] args) {
		Downcasting dp=new Upcasting();
		dp.TestA();
		dp.TestB();
		//dp.TestC(); not possible
		

	}

}
