package by.htp.ex.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("!!!!!!!!!!!");
		response.getWriter().print("contact = " + request.getParameter("contact") + "<br/>");
		response.getWriter().print("contact1 = " + request.getParameter("contact1") + "<br/>");
		
		
		String[] checkboxValues2 = request.getParameterValues("vehicle");
		
		for(int i=0; i<checkboxValues2.length; i++) {
			System.out.println(checkboxValues2[i]);
		}
		
		
		response.getWriter().print("checkboxValues = " + request.getParameter("vehicle") + "<br/>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}