package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bdcell;
import DTO.enclass;

@WebServlet("/ApnaUpdate")

public class updatecell  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String f1=req.getParameter("id");
	String f2=req.getParameter("email");
	
	enclass en=new enclass();
	en.setId(f1);
	en.setEmail(f2);
	bdcell db=new bdcell();
	db.update(f1,f2);
	req.getRequestDispatcher("login.html").include(req, resp);
}
}
