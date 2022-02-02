packagecom.flight;

importjavax.servlet.annotation.WebServlet;
importjavax.servlet.http.HttpServlet;
importjava.io.IOException;
importjava.sql.SQLException;
importjava.util.HashMap;
importjavax.servlet.ServletException;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;
importcom.database.DAO;

@WebServlet(“/InsertFlight”)
publicclassInsertFlightextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;
protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
		String name=request.getParameter(“name”);
		String from=request.getParameter(“from”);
		String to=request.getParameter(“to”);
		String departure=request.getParameter(“departure”);
		String time=request.getParameter(“time”);
		String price=request.getParameter(“price”);
		HashMap<String,String>flight=newHashMap<>();
		flight.put(“name”, name);
		flight.put(“from”, from);
		flight.put(“to”, to);
		flight.put(“date”, departure);
		flight.put(“time”, time);
		flight.put(“price”, price);
		
		try {
			 DAO dao=newDAO();
			HttpSessionsession=request.getSession();
			if(dao.insertFlight(flight)) {
				
				session.setAttribute(“message”, “Flight Added Successfully”);
			}
			else {
				session.setAttribute(“message”, “Invalid Details”);
			}
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			System.out.print(“error”);
			e.printStackTrace();
		}
		response.sendRedirect(“AdminHome.jsp”);
