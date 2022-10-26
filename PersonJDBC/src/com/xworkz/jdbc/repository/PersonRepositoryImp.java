package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.JDBCContainer.JDBCContainer;
import com.xworkz.jdbc.dto.PersonDTO;
import com.xworkz.jdbc.service.PersonService;

public class PersonRepositoryImp implements PersonRepository {

	@Override
	public boolean Save(PersonDTO dto) {
		System.out.println("Running Save Method");

		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysqlValues = "insert into xworkzbtm.person values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getEmail() + "'," + dto.getMobileNo() + "," + dto.getGender() + ",'" + dto.getQualification()
					+ "'," + dto.isMarried() + "," + dto.isWorking() + ",'" + dto.getCompanyName() + "',"
					+ dto.getSalary() + ",'" + dto.getLocation() + "','" + dto.getLocation() + "','" + dto.getState()
					+ "','" + dto.getCountry() + "'," + dto.getAdharNo() + "," + dto.getBankAcNO() + ")";
			System.out.println(mysqlValues);
			Statement statement = connection.createStatement();
			int execute = statement.executeUpdate(mysqlValues);
			System.out.println(execute);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void display() {
		System.out.println("Displaying All Properties");

		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			System.out.println("Data is Loaded and Registered");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person";
			System.out.println(mysql);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(mysql);
			while (result.next()) {
				int id = result.getInt("id");// id
				// int id = result.getInt("id");
				String name = result.getString("name");// name
				String email = result.getString("email");
				long mobileno = result.getLong("mobileno");//
				String gender = result.getString("gender");
				String qualification = result.getString("qualification");
				boolean married = result.getBoolean("married");
				boolean work = result.getBoolean("work");
				String company = result.getString("company");
				double salary = result.getDouble("salary");
				int age = result.getInt("age");
				int exp = result.getInt("exp");
				String location = result.getString("location");
				String city = result.getString("city");
				String state = result.getString("state");
				String country = result.getString("country");
				long adharNo = result.getLong("adharNo");
				long bankNo = result.getLong("BankNo");
				System.out.println(id + "" + name + "" + email + "" + mobileno + "" + gender + "" + qualification + ""
						+ married + "" + work + "" + company + "" + salary + "" + age + "" + exp + "" + location + ""
						+ city + "" + state + "" + country + "" + adharNo + "" + bankNo + "");

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age) {
		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person where age>=20 order by name";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				int age1 = resultSet.getInt("age");
				System.out.println(name + "" + age1);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {

		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person where gender='male' order by name desc";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String gender1 = resultSet.getString("gender");
				String name = resultSet.getString("name");

				System.out.println(name + "" + gender1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select * from xworkzbtm.person where salary>=25000 order by salary desc";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				double salary1 = resultSet.getDouble("salary");

				System.out.println(name + "" + salary1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayCount() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select count(*)as id from xworkzbtm.person";
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery(mysql);
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				System.out.println("total counts id" + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {

		try {
			Class.forName("com.mysql.jc.jdbc.Driver");
			Connection connection = DriverManager.getConnection(JDBCContainer.URL.getContainer(),
					JDBCContainer.USERNAME.getContainer(), JDBCContainer.DONTELL.getContainer());
			String mysql = "select sum(salary) as salary from xworkzbtm.person";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(mysql);
			while (resultSet.next()) {
				double salary = resultSet.getDouble("salary");
				System.out.println("Total salary is :" + salary);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
