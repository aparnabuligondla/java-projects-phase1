packagecom.flight;

importjavax.servlet.annotation.WebServlet;
importjava.io.IOException;
importjavax.servlet.ServletException;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;

@WebServlet("/Logout")
publicclassLogOutextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;
protectedvoiddoGet(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
		HttpSessionsession=request.getSession();
		session.setAttribute("user", null);
		response.sendRedirect("HomePage.jsp");
	}

}

