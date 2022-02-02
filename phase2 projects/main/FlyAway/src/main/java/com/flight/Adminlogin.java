packagecom.flight;
importjava.io.IOException;
importjava.sql.SQLException;
importjavax.servlet.ServletException;
importjavax.servlet.annotation.WebServlet;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;
importcom.database.DAO;

@WebServlet("/AdminLogin")
publicclassAdminloginextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;

protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
	String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
			DAO dao=newDAO();
			
			if(dao.checkAdmin(email,password)) {
				response.sendRedirect("AdminHome.jsp");
			}
			else {
				HttpSessionsession=request.getSession();
				session.setAttribute("message", "Invalid Details");
				response.sendRedirect("AdminPage.jsp");
			}
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
