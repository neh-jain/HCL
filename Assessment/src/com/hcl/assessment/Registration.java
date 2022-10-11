package com.hcl.assessment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String phoneNumber = request.getParameter("phone");
		String email = request.getParameter("email");
		pw.println("<h3>Registration Successsful</h3>");
		pw.println(firstName);
		pw.println(lastName);
		pw.println(gender);
		pw.println(phoneNumber);
		pw.println(email);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","12345");
			PreparedStatement ps = con.prepareStatement("insert into information values(?,?,?,?,?)");
			ps.setString(1,firstName);
			ps.setString(2,lastName);
			ps.setString(3,gender);
			ps.setString(4,phoneNumber);
			ps.setString(5,email);
			int i = ps.executeUpdate();
			 String[] val=request.getParameterValues("lang");
			    PreparedStatement pt1=con.prepareStatement("insert into language values (?,?)");
			    for(int j=0;j<val.length;j++)
			    {
			    	pt1.setString(1,firstName);
			    	pt1.setString(2,val[j]);
			    	pt1.execute();
			    }
			if(i>0)
			pw.print("<h3>Login sucessfully!!!</h3>");
			pw.close();
		}	
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	} 	
}