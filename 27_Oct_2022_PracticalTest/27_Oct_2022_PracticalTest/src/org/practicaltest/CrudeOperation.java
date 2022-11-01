package org.practicaltest;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class CrudeOperation {
		public static void main(String args[]) {
			String databaseURL = "\"jdbc:mysql://localhost:3306/\",\"root\",\"Password@123\"\r\n";
			String userName = "root";
			String password = "Password@123";
			Connection connection;
			int ch = 0;
			int operation = 0;
			 
			Scanner scanner = new Scanner(System.in);
			
			try {
				connection=DriverManager.getConnection(databaseURL,userName,password);
				if(connection!= null) {
					System.out.println("Connected");
				}
				do {
					switch(operation) {
					case 1:
						do {
							System.out.println("Enter Employee id");
							int employeeId = scanner.nextInt();
							System.out.println("Enter Employee name");
							String employeeName = scanner.nextLine();
							System.out.println("Enter Employee Phone");
							int employeePhone = scanner.nextInt();
							System.out.println("Enter Employee Address");
							String employeeAddress = scanner.nextLine();
							System.out.println("Enter Employee Email");
							String employeeEmail = scanner.nextLine();
							System.out.println("Enter Employee Department");
							String employeeDepartment = scanner.nextLine();
							
							String mysql = "INSERT INTO Employee(employeeId,employeeName,employeePhone,employeeAddress,empployeeEmail,employeeDepartment)VALUES(?,?,?,?,?,?)";
							
							PreparedStatement prepstatement = connection.prepareStatement(mysql);
							prepstatement.setInt(1, employeeId);
							prepstatement.setString(2, employeeName);
							prepstatement.setInt(3, employeePhone);
							prepstatement.setString(4, employeeAddress);
							prepstatement.setString(5, employeeEmail);
							prepstatement.setString(6, employeeDepartment);
							
							int rowInserted = prepstatement.executeUpdate();
							if (rowInserted > 0) {
								System.out.println("A new user record inserted successfully");
							}
							System.out.println("continue");
							ch=scanner.nextInt();
							}while(ch==1) ;
							break;
							
							case 2:
								System.out.println("Enter record for updation");
								System.out.println("Enter employee id whose record are to be updated");
								int updatedId = scanner.nextInt();
								System.out.println("Enter updated employee name");
								String updatedName = scanner.nextLine();
								System.out.println("Enter updated Employee Phone");
								int updatedPhone = scanner.nextInt();
								System.out.println("Enter updated Employee Address");
								String updatedAddress = scanner.nextLine();
								System.out.println("Enter updated Employee Email");
								String updatedEmail = scanner.nextLine();
								System.out.println("Enter updated Employee Department");
								String updatedDepartment = scanner.nextLine();
								
								String mysql2 = "UPDATE Employee SET employeeName=?,employeePhone=?,employeeAddress=?,empployeeEmail=?,employeeDepartment=? WHERE employeeId=?";
								
								PreparedStatement prepstatement1 = connection.prepareStatement(mysql2);
								prepstatement1.setInt(1, updatedId);
								prepstatement1.setString(2, updatedName);
								prepstatement1.setInt(3, updatedPhone);
								prepstatement1.setString(4, updatedAddress);
								prepstatement1.setString(5, updatedEmail);
								prepstatement1.setString(6, updatedDepartment);
								
								int rowInserted = prepstatement1.executeUpdate();
								if (rowInserted > 0) {
									System.out.println("A new user record updated successfully");
								}
								break;
							case 3:
								System.out.println("Enter records for deletion");
								System.out.println("Enter employee id whose records are to be deleted");
								int delete = scanner.nextInt();
								
								String mysql3= "DELETE FROM Employee WHERE employeeId=?";
								PreparedStatement prepstatement2 = connection.prepareStatement(mysql3);
								prepstatement2.setInt(1, delete);
								int rowDeleted = prepstatement2.executeUpdate();
								if (rowDeleted > 0) {
									System.out.println("A new user record deleted successfully");
								}
								break;
								
							case 4:
								String mysql1 = "SELECT * FROM Employee";
								
								Statement statement = connection.createStatement();
								ResultSet resultset = statement.executeQuery(mysql1);
								
								int count = 0;
								
								while(resultset.next()) {
									int employeeId = resultset.getInt(1);
									String employeeName = resultset.getString("Name");
									int employeePhone = resultset.getInt(3);
									String employeeAddress = resultset.getString("Adress");
									String employeeEmail = resultset.getString("Email");
									String employeeDepartment = resultset.getString("Department");
									
									String output = "EMPLOYEE #%d: -%d - %s - %d - %s - %s - %s";
									System.out.println(String.format(output, ++count,employeeId,employeeName,employeePhone,employeeAddress,employeeEmail,employeeDepartment));
								}
								break;					
				}
					System.out.println("Enter your choice: 1.Add Employee/n 2.Update/n 3.Delete/n 4.Display/n");
					operation=scanner.nextInt();
				}while(operation!=0);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}

	}



