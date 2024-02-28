package jdbcconn;

interface JDBC
{
	void connect();
	void disconnect();
}

class Oracleimpl implements JDBC
{
	@Override
	public void connect() 
	{
		System.out.println("Oracle Connecting");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("Oracle Disconnecting");
	}
}

class Mysqlimpl implements JDBC
{
	@Override
	public void connect() 
	{
		System.out.println("MySQL Connecting");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("MySQL Disconnecting");
	}
}

public class DBImpl {
	public static void main(String []args) 
	{
		JDBC j = new Oracleimpl();
		j.connect(); j.disconnect();
		
		j = new Mysqlimpl();
		j.connect(); j.disconnect();
	}
}
