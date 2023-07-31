package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator ob = new MyCalculator();
		System.out.println("Addition is" + ob.sum(10, 20));
		System.out.println("Substraction is" + ob.sub(30, 20));

	}

}
