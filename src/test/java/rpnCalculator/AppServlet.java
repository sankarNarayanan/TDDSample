package rpnCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class AppServlet extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    
	  request.getRequestDispatcher("/RpnPage.jsp").forward(request, response);
  }
  
  protected void doPost(HttpServletRequest request, 
	      HttpServletResponse response) throws ServletException, IOException 
	  {
	  	// reading the user input
	    String exp= request.getParameter("color"); 
	    RpnCalculator rpnCalc = new RpnCalculator();
	    Double result = rpnCalc.performOperationForExpression(exp); 
	    PrintWriter out = response.getWriter();
	    out.println ("Result = " + Double.toString(result));
	  }
  
}