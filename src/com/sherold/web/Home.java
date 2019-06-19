package com.sherold.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Sets parameters for query
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");
		
		// Event handlers for blank queries
		if(firstName == null) {
			firstName = "Unknown";
		}
		if(lastName == null) {
			lastName = "Unknown";
		}
		if(favoriteLanguage == null) {
			favoriteLanguage = "Unknown";
		}
		if(homeTown == null) {
			homeTown = "Unknown";
		}
		
		// Sets the content type of the response -- in this case HTML
		response.setContentType("text/html");
		
		// Instansiates PrintWriter object to display data
		PrintWriter out = response.getWriter();
		out.write(
				"<h1>Welcome, " + firstName + " " + lastName + 
				"</h1><h3>Your favorite language is: " + favoriteLanguage + 
				"</h3><h3>Your hometown is: " + homeTown + "</h3>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
