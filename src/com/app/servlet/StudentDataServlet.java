package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.bean.Student;
import com.app.dao.StudentDao;

@WebServlet("/studentdata")
public class StudentDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException 
	{
		//1. Goto DB and get All rows as List
		List<Student> stds=StudentDao.displayAllStudents();
		
		//2. Sort data based on name
		
		stds.sort((o1,o2) -> o1.getStdName().compareTo(o2.getStdName()));
		
		
		
		//3. Add data to request
		request.setAttribute("stdList", stds);
		
		
		//4. Dispatch to UI
		request.getRequestDispatcher("StudentData.jsp")
		.forward(request, response);
		
		
	}

}
