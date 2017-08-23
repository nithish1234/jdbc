package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.application.controller.TestController;
import com.application.model.SampleModel;

public class DaoLayer {
	public void getBook(SampleModel model) {
TestController sample=new TestController();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");

			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO form_detials(firtname,lastname,mobile_number,email_id,password_name)VALUES(model.getFirstName(),model.getSecondName(),model.getMobilenumber(),model.getEmailId(),model.getPassword())");
			int rs = stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
