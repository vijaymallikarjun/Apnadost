package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.bdcell;
import DTO.enclass;

@WebServlet("/Apnalogin")

public class logincell  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String email=req.getParameter("email");
		bdcell db=new bdcell();
		enclass en=db.find(id);
		if(en==null)
		{
			resp.getWriter().print("<h1>invalid id</h1>");
		}
		else
		{
			if(en.getEmail().equals(email))
			{
				resp.getWriter().print("<h1>login sucess</h1>");
			}
			else
			{
				resp.getWriter().print("<h1>invalid email</h1>");
			}
		}
		
	}

}
