package com.sapient.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControlServlet
 */
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 /* String username = request.getParameter("username");
	        String password = request.getParameter("password");
	         
	        System.out.println("username: " + username);
	        System.out.println("password: " + password);
	        
	     // do some processing here...
	         
	        // get response writer
	        PrintWriter writer = response.getWriter();
	         
	        // build HTML code
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
	        htmlRespone += "Your password is: " + password + "</h2>";    
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
	}*/
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		
		Enumeration<String> headerNames = request.getParameterNames();
		String headerName;
		while(headerNames.hasMoreElements()){
			headerName = headerNames.nextElement();
			out.println(headerName+ " :"+ request.getParameterValues(headerName)[0] + "<br/>");
		}
		out.println("</body>");
		out.println("</html>");
		

}
}
