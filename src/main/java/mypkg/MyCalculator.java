package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}

	public float div(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator ob = new MyCalculator();
		System.out.println("This is my First Maven with Jenkins Project");
		System.out.println("Addition is" + ob.sum(10, 20));
		System.out.println("Substraction is" + ob.sub(30, 20));
		System.out.println("Multiplition is" + ob.mul(30, 20));
		System.out.println("Division is" + ob.div(30, 2));
	}

}
