package com.kogent ;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PizzaInventoryConsumer extends PizzaInventorySuperclass 
{
  	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException 
	{
    		res.setContentType("text/html");
    		PrintWriter prnwriter = res.getWriter();

    		prnwriter.println("<HTML>");
    		prnwriter.println("<HEAD><TITLE>Pizza Inventory Consumer</TITLE></HEAD>");

    		prnwriter.println("<BODY><BIG>");

    		if (inventory.makePizza()) 
		{
      		prnwriter.println("Your pizza will be ready in a few minutes.");
		}
	    	else 
		{
     			prnwriter.println("We're low on ingredients.<BR>");
     			prnwriter.println("Looks like you're gonna starve.");
    		}

    		prnwriter.println("</BIG></BODY></HTML>");
  	}
}
