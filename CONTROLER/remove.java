package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bdcell;
import DTO.enclass;

@WebServlet("/Apnaremove")

public class remove  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	
	enclass en=new enclass();
	en.setId(id);
	bdcell db=new bdcell();
	db.Delete(id);
	req.getRequestDispatcher("Apnasignin.html").include(req, resp);
	
}
}
