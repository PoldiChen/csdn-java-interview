package question075;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test();
	}
	
	public static void test() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("mysql.jdbc.driver.MySQLDriver");
			connection = DriverManager.getConnection("jdbc:mysql:thin@localhost:3306", "root", "123456");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from association");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			if (resultSet != null) { // 关闭的顺序和打开的顺序相反
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		
	}

}
