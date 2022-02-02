packagecom.flight;
importjava.io.IOException;
importjava.sql.SQLException;
importjava.util.List;
importjavax.servlet.ServletException;
importjavax.servlet.annotation.WebServlet;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;
importcom.database.DAO;

@WebServlet("/FlightList")
publicclassFlightlistextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;

	protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String departure=request.getParameter("departure");
		
		try {
			DAO dao = newDAO();
			List<String[]>flights=dao.getAvailableFlights(from, to, departure);			
			HttpSessionsession=request.getSession();
			session.setAttribute("flights", flights);
			
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("FlightList.jsp");
	}
}


