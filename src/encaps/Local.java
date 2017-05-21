package encaps;
//GLOBAL VARIABLES-CAN ACESS ANYWHERE OUTSIDE BUT ONCE THE VARIABLE IS REINITIALISED THE VALUE GETS CHANGED ACCORDINGLY TO NEW VALUE
//LOCAL VARIABLED CAN BE ACCESSED ONLY WITHIN CLASS AND CAN BE REINITIALISED ONLY WITHIN CLASS BUT THE VARIABLE VALUE DOESNT CHANGE remains the same in memory location
public class Local {
	int deposit =500;//global A value is 50000 now not 500
	int balance=1000;
	void disp()
	{
		int  a=5;//local
		int b=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(deposit);
		System.out.println(balance);
		a=50;
		b=100;
		System.out.println(a);
		System.out.println(b);
	}
	void global()
	{
		deposit=50000;
		balance=1000000;
		System.out.println(deposit);
		System.out.println(balance);
		
	}

	public static void main(String[] args) {
		Local l=new Local();
		
		l.global();
		l.disp();
		System.out.println("before reininitilising global data members");
		l.deposit=5000;
		l.balance=10000;
		l.disp();
		l.global();
		
		
	}

}
