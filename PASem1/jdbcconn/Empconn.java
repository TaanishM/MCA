package jdbcconn;

import java.sql.*;

public class Empconn {
    private Connection connection;
    
    public Empconn() {
        try {
            
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "my_username";
            String password = "my_password"; 

        connection = DriverManager.getConnection(url, username, password);
        	createTable();
            insertEmployee("a001", "Ram Kumar", "Noida", 10000);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Emp ("+"code VARCHAR2(10) PRIMARY KEY,"+"name VARCHAR2(40) NULL,"
                				+ "city VARCHAR2(20),"+"salary NUMBER)";

        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 public void insertEmployee(String code, String name, String city, int salary) {
        String sql = "INSERT INTO Emp VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, code);
            statement.setString(2, name);
            statement.setString(3, city);
            statement.setInt(4, salary);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteEmployee(String code) {
        String sql = "DELETE FROM Emp WHERE code=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, code);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updateEmployee(String code, String newName, String newCity, int newSalary) {
        String sql = "UPDATE Emp SET name=?, city=?, salary=? WHERE code=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newName);
            statement.setString(2, newCity);
            statement.setInt(3, newSalary);
            statement.setString(4, code);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void showAllRecords() {
        String sql = "SELECT * FROM Emp";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String empCode = resultSet.getString("code");
                String empName = resultSet.getString("name");
                String empCity = resultSet.getString("city");
                int empSalary = resultSet.getInt("salary");
                System.out.println("Code: " + empCode + ", Name: " + empName + ", City: " + empCity + ", Salary: " + empSalary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
     
        Empconn Empconn = new Empconn();
     
        Empconn.showAllRecords(); 

        Empconn.closeConnection();
    }
}
