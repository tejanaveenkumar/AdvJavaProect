package com.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Student;
import com.app.util.ConnectionUtil;

public class StudentDao {

	/**
	 * THIS METHOD is used to insert data into
	 * DB table and generates one Primary Key using AutoIncrement concept
	 *  
	 */
	public static int saveStudent(Student s) {
		int count=0;
		String sql="insert into student"
				+ " (sname,sgen,semail,scontact,sedu,addr) "
				+ " values(?,?,?,?,?,?)";
		PreparedStatement pstmt=null;
		try {
			pstmt=ConnectionUtil.getConn().prepareStatement(sql);

			//set data which has come from UI Form
			pstmt.setString(1, s.getStdName());
			pstmt.setString(2, s.getStdGen());
			pstmt.setString(3, s.getStdEmail());
			pstmt.setString(4, s.getStdContact());
			pstmt.setString(5, s.getStdQual());
			pstmt.setString(6, s.getStdAddr());

			count=pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	public static int deleteStudent(int stdId) {
		int count=0;
		String sql="delete from student where sid=?";
		PreparedStatement pstmt=null;
		try {
			pstmt=ConnectionUtil.getConn()
			.prepareStatement(sql);
			//set Dynamic ID to SQL
			pstmt.setInt(1, stdId);
			
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	/**
	 * This metod gets database table data 
	 * into ResultSet and then converts
	 * one row of result set into one Student object
	 * Finally all Students obejcts are added to List
	 * This List is converted to HTML Table using JSTL+EL 
	 * @return
	 */
	public static List<Student> displayAllStudents(){
		//this SQL gets all rows from DB table
		String sql="select * from student";
		ResultSet rs=null;
		List<Student> sList=null;
		try {
			//fetching data from DB into ResultSet
			rs=ConnectionUtil.getConn()
					.prepareStatement(sql)
					.executeQuery();
			 sList=new ArrayList<>();
			while(rs.next()) {
				//add to List which is sent to UI
				sList.add(
						//convert one row to one object
						new Student(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getString(6),
								rs.getString(7)
								)
						);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//all rows in List of Students
		//1-row => 1 Student object
		// * rows = * Students => List of Student
		return sList;
	}
}



