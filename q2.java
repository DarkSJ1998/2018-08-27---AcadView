/*
Q2. Call default constructor of the same class through parameterized one.
*/

class Demo
{
	Demo()
	{
		System.out.println("// Default Constructor called.");
	}
	
	Demo(int a)
	{
		this();							// invoking the default constructor.
		System.out.println("// Parameterized Constructor called.");
	}
}
class q2
{
	public static void main(String args[])
	{
		Demo obj = new Demo(10);		// invoking the parameterized constructor.
	}
}
