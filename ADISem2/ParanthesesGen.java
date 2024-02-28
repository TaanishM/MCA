public class ParanthesesGen {
	public static void genpar(int a, int openp, int closep, String par)
	{
		if(openp>a)return;
		if(openp+closep==2*a) {
			System.out.println(par);
			return;
		}
		if(closep>openp)return;
		genpar(a,openp+1,closep,par+"(");
		genpar(a,openp,closep+1,par+")");
	}
	public static void main(String []args) {
		int n=3;
		genpar(n,0,0,"");
	}
}
