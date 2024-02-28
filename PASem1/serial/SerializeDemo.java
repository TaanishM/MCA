package serial;

import java.io.*;

class Employee implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public void mailCheck(){
		System.out.println("Mailing a check to"+name+""+address);
	}
}

public class SerializeDemo {
	public static void main(String []args) throws ClassNotFoundException{
		
		Employee e = new Employee();
		
		e.name = "ABC";
		e.address = "XYZ Ave";
		e.SSN = 112233;
		e.number = 101;
		
		try {
			File file1 = new File("MCAB.ser");
			FileOutputStream fout = new FileOutputStream(file1);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(e);
			System.out.println("serialize");
			oos.flush();
			oos.close();
			fout.close();
		}
		catch(FileNotFoundException err) {
			err.printStackTrace();
		}
		catch(IOException err) {
			err.printStackTrace();
		}
		
		Employee e1=null;
		try {
			File file = new File("MCAB.ser");
			FileInputStream fout = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fout);
			e1 = (Employee) ois.readObject();
			System.out.println("deserialize");
			
			System.out.println(e1.address);
			System.out.println(e1.name);
			System.out.println(e1.SSN);
			System.out.println(e1.number);
			ois.close();
			fout.close();
		}
		catch(FileNotFoundException err) {
			err.printStackTrace();
		}
		catch(IOException err) {
			err.printStackTrace();
		}
	}
}
