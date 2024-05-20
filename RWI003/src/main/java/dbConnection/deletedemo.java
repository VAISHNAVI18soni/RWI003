package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deletedemo {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Vaishnavi18@soni");
            System.out.println("Connection successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void updateData(int id, String newName) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            if (connection != null) {
                String updateSQL = "UPDATE mishra SET EmpName = ? WHERE EmpID = ?";
                preparedStatement = connection.prepareStatement(updateSQL);
                preparedStatement.setString(1, newName);
                preparedStatement.setInt(2, id);
                
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertData(int empID, String empName, String designation, String department, java.sql.Timestamp joiningDate) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            if (connection != null) {
                String insertSQL = "INSERT INTO mishra (EmpID, EmpName, Designation, Department, JoiningDate) VALUES (?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(insertSQL);
                preparedStatement.setInt(1, empID);
                preparedStatement.setString(2, empName);
                preparedStatement.setString(3, designation);
                preparedStatement.setString(4, department);
                preparedStatement.setTimestamp(5, joiningDate);

                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Update EmpName for EmpID = 1
        updateData(1, "NewName");

        // Insert a new record into the mishra table
        java.sql.Timestamp now = new java.sql.Timestamp(System.currentTimeMillis());
        insertData(7, "John Doe", "Intern", "IT", now);
    }
}
