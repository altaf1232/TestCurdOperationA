package com.curda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestControler")
public class TestControler extends HttpServlet 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException 
   {
	   System.out.println("this is print third time  TestControler extends HttpServlet 1 ");
	   //here is getParaMeter
	   String name = req.getParameter("Name");
	   String email=req.getParameter("Eamil");
	   
	   //here is setParameter
	   testPojoClass tpc=new testPojoClass();
	   tpc.setName(name);
	   tpc.setEmail(email);
	   
	   //here is dioImplements this dioImplements Connection in your data Base
	    DioImplements dioImplement=new DioImplements();
	    dioImplement.save(tpc);
	   
   }
}
