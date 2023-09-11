package CRUDPerson;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;



public class PersonCRUD {
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		
		//REDING THE FILE OBJECT FROM dbcondig.properties
		FileInputStream fileInputStream=new FileInputStream("dbcondig.properties");
		//create a object for propeties
		Properties properties=new Properties();
		
		//Reads a property list (key and element pairs) from the inputbyte stream
		properties.load(fileInputStream);
		
		//getProperty() : Searches for the property with the specified key in this property list. 
	  Class.forName(properties.getProperty("className"));
	  
	  //it makes your credential secure and private like user name and password
	  Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),
			  properties.getProperty("password"));
	  
	  return connection;

		
	}
	
	public void savePerson(Person person) throws ClassNotFoundException, IOException, SQLException {
		Connection connection=getConnection();
		
	  String query="INSERT INTO PERSON VALUES(?,?,?,?)";
	  
	  PreparedStatement preparedStatement=connection.prepareStatement(query);
	  
	 preparedStatement.setInt(1, person.getId());
	 preparedStatement.setString(2, person.getName());
	 preparedStatement.setLong(3,person.getPhone());
	 preparedStatement.setString(4, person.getAddress());
	  
	 int res=preparedStatement.executeUpdate();
	 if (res==1) {
		System.out.println("inserted");
	} else {
		System.out.println("not inserted");

	}
	 connection.close();
	}
	
	public void updatePerson(Person person) throws ClassNotFoundException, IOException, SQLException {
		
		Connection connection=getConnection();
		
		String query="update person set name=?, phone=?,address=? where id=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, person.getName());
		preparedStatement.setLong(2, person.getPhone());
		preparedStatement.setString(3, person.getAddress());
		preparedStatement.setInt(4, person.getId());
		
		int count=preparedStatement.executeUpdate();
		if (count==1) {
			System.out.println("updated");
			
		} else {
			System.out.println("not updated");

		}
	  connection.close();
		
		
	}
	
	
public void deletePerson(int id) throws ClassNotFoundException, IOException, SQLException {
		
		Connection connection=getConnection();
		
		String query="delete from person where id=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setInt(1,id);
		
		int count=preparedStatement.executeUpdate();
		if (count==1) {
			System.out.println("deleted");
			
		} else {
			System.out.println("deleted");

		}
	  connection.close();
		
		
	}
public void showPerson(int id) throws ClassNotFoundException, IOException, SQLException {
	
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("select * from person where id=?");
	preparedStatement.setInt(1, id);;
	
	ResultSet resultset=preparedStatement.executeQuery();
	
	while (resultset.next()) {
		System.out.println(resultset.getInt(1));
		System.out.println(resultset.getString(2));
		System.out.println(resultset.getLong(3));

	}
	connection.close();
}
	

}
