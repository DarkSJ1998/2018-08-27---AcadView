class Base
{
	public void displayBase()
	{
		System.out.println("// displayBase() invoked.");
	}
}
class Derived extends Base
{
	public void displayDerived()
	{
		System.out.println("// displayDerived() invoked.");
		super.displayBase();				// invokes the method of super class.
	}
}
class q1
{
	public static void main(String[] x)
	{
		Derived obj = new Derived();
		
		obj.displayDerived();
	}
}