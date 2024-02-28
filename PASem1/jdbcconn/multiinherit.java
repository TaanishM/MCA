package jdbcconn;

class A{
	public void Afun() {
		System.out.println("in A");
	}
}

interface B{
	void Bfun();
}
interface C{
	void Cfun();
}

class Primary extends A implements B,C{
	@Override
	public void Bfun() {
		System.out.println("Implement B");
	}
	@Override
	public void Cfun() {
		System.out.println("Implement C");
	}
}


public class multiinherit {
	public static void main(String [] args) {
		Primary P = new Primary();
		P.Afun();
		P.Bfun();
		P.Cfun();
	}
}
