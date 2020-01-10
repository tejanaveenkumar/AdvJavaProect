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

@WebServlet("/studentdelete")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. read student id to be deleted

		String stdId=request.getParameter("stdId");

		//2. Parse Student Id
		int sid=Integer.parseInt(stdId);

		//3. call dao delete operation
		int count=StudentDao.deleteStudent(sid);
		
		//4. add message to UI
		String message=null;
		if(count>0) {
			message="Student '"+sid+"' Deleted";
		}else {
			message="Student unable to delete!!";
			
		}
		//5. get all new data and Sort
		List<Student> stdList=StudentDao.displayAllStudents();
		stdList.sort((o1,o2) -> o1.getStdName().compareTo(o2.getStdName()));
		
		//6. goto UI with new Data and message
		request.setAttribute("message", message);
		request.setAttribute("stdList", stdList);
		
		//7. Dispatch to UI
		request.getRequestDispatcher("StudentData.jsp")
		.forward(request, response);
		

	}

}
