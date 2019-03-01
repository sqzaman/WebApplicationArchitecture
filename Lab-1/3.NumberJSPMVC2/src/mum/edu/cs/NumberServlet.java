package mum.edu.cs;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.util.Random;

public class NumberServlet extends HttpServlet {
	
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    Random randomGenerator = new Random();
    	int num = randomGenerator.nextInt(10);
    	int lessthanNum = randomGenerator.nextInt(10);
    	int greaterthanNum = randomGenerator.nextInt(10);
    	int equalNum = randomGenerator.nextInt(10);
     
    	request.setAttribute("num", num);
    	request.setAttribute("lessthanNum", lessthanNum);
    	request.setAttribute("greaterthanNum", greaterthanNum);
    	request.setAttribute("equalNum", equalNum);

     	
  	  RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Numbers.jsp");
  	  view.forward(request, response);
  		
    
  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
 
		
		
	}

}
