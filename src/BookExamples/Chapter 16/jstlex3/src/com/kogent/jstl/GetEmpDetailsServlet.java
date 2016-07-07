package com.kogent.jstl;

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.util.*;

import java.sql.*;

public class GetEmpDetailsServlet extends HttpServlet {

	public void service(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {

		Connection con=null;
		try {
			con=DriverConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ArrayList al=new ArrayList();

			while (rs.next()){
al.add(new EmpDetails(rs.getInt(1),rs.getString("ename"),rs.getInt("deptno"),rs.getInt("sal")));
			}//while

			HttpSession session=request.getSession();
			session.setAttribute("emps",al);
			RequestDispatcher rd=request.getRequestDispatcher("EmpDetailsView.jsp");
			rd.forward(request, response);
			return;
		}//try
		catch(Exception e){e.printStackTrace();}
		finally{try{con.close();}
		catch(Exception e){e.printStackTrace();}}
	}
}
