package devmater.edu.vn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeServlet() {
		super();
	}
protected void doGet(HttpServletRequest request ,HttpServletResponse response)
throws ServletException, IOException { 
	// Forward to /WEB-INF/views/homeView.
	// (Users can not JSP pages placed in WEB-INF)
	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB- INF/views/homeView.jsp");
	dispatcher.forward(request,response);
}
protected void doP(HttpServletRequest request ,HttpServletResponse response)
throws ServletException, IOException { 
	doGet(request,response);
}
}

