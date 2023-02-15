package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bdcell;
import DTO.enclass;

@WebServlet("/Apnasignin")

public class webcell  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		enclass en=new enclass();
		en.setId(req.getParameter("id"));
		en.setName(req.getParameter("name"));
		en.setEmail(req.getParameter("email"));
		en.setNumber(req.getParameter("number"));
		
		bdcell df=new bdcell();
		df.send(en);
		req.getRequestDispatcher("login.html").include(req, resp);
		
	}

}
