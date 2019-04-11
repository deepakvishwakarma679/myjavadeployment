package com.deepak;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regservlet")
public class Regservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String enroll=request.getParameter("enroll");
		String pass=request.getParameter("pass");
		String fname=request.getParameter("fname");
		String add=request.getParameter("add");
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myiistdb","user","password");
			Statement stmt=con.createStatement();
			
			String q="Insert into registration values('"+enroll+"','"+pass+"','"+fname+"','"+add+"')";
			
			stmt.executeUpdate(q);
			
		stmt.close();
		con.close();
		out.print("Record Inserted");
			
		}
		catch(Exception e)
		{
			
			System.out.print(e);
		}
		
	}

}
