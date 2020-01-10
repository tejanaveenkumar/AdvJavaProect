package com.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.bean.Student;
import com.app.dao.StudentDao;

@WebServlet("/studentinsert")
public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{
	
		//1. read data from HTML Reg Form
		String stdName=request.getParameter("stdName");
		String stdGen=request.getParameter("stdGen");
		String stdEmail=request.getParameter("stdEmail");
		String stdContact=request.getParameter("stdContact");
		String stdQual=request.getParameter("stdQual");
		String stdAddr=request.getParameter("stdAddr");
		//2. convert data into bean
		
		Student s=new Student(stdName, stdGen, stdEmail, stdContact, stdQual, stdAddr);
		
		//3. call dao save operation
		int count=StudentDao.saveStudent(s);
		
		//4. getResult and construct msg
		String message=null;
		if(count>0) {
			message="Student inserted successfully!!";
		}else {
			message="Student Register failed!!";
			
		}
		
		//5. send success message to UI
		request.setAttribute("message", message);
		
		//6. move to same register page
		request.getRequestDispatcher("StudentRegister.jsp")
		.forward(request, response);
	
	
	
	
	
	
	
	}

}
