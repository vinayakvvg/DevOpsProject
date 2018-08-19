package com.nissan.devops;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	
	public String calculateSum(String a, String b) 
	{	
		int x,y; 
		Integer sum;
		x=Integer.parseInt(a);
		y=Integer.parseInt(b);
		sum=x+y;
		return sum.toString();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a, b, result;
		
		a = request.getParameter("inp1");
		b = request.getParameter("inp2");
		result = calculateSum(a, b);	
		
		request.setAttribute("inp1", a);
		request.setAttribute("inp2", b);
        request.setAttribute("opt", result);
        
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
