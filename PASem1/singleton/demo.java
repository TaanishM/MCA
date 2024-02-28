package singleton;

class Singleton
{
	private static Singleton obj=null;
	public int count;
	private Singleton() 
	{
		count=0;
		System.out.println(count);
		System.out.println("Priv constr");
	}
	public void inc()
	{
		count=count+1;
	}
	public static Singleton getinst()
	{
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
}


public class demo {
	public static void main(String []args)
	{
		Singleton obj = Singleton.getinst();
		System.out.print("obj1 init: "+obj.count);
		System.out.println();
		Singleton obj2 = Singleton.getinst();
		System.out.print("obj2 init: "+obj2.count);
		System.out.println();
		obj.inc();
		System.out.print("obj1 inc, obj2 call "+obj2.count);
		obj2.inc();
		System.out.println();
		System.out.print("obj2 inc, obj1 call "+obj.count);
		System.out.println();
	}
}
