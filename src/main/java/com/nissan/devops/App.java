package com.nissan.devops;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	public Boolean isNumber(String num)
	{
		Boolean result = true;
		
		try{
			Double.parseDouble(num);
		}
		catch(NumberFormatException e){
			result = false;
		}
		return result;
	}
	
	public String calculateSum(String a, String b) 
	{	
		{	
			if(a.length() == 0){
				return "Please enter number 1";
			}
			if(!isNumber(a)){
				return "Please enter integer or floating decimal values only";
			}
			if(b.length() == 0){
				return "Please enter number 2";			
			}
			if(!isNumber(b)){
				return "Please enter integer or floating decimal values only";
			}
			Double ans = Double.parseDouble(a) + Double.parseDouble(b);
			if(ans%1 == 0){
				return Integer.toString(ans.intValue());
			}
			return ans.toString();
		}
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
