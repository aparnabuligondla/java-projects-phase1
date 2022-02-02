packagecom.flight;
importjavax.servlet.annotation.WebServlet;
importjava.io.IOException;
importjava.sql.SQLException;

importjavax.servlet.ServletException;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;

importcom.database.DAO;
@WebServlet("/ForgotPassword")
publicclassForgotpasswordextendsHttpServlet {
privatestaticfinallongserialVersionUID = 1L;
protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
			DAO dao=newDAO();
			HttpSessionsession=request.getSession();
			if(dao.changeAdminPassword(email,password)) {
				session.setAttribute("message", "Password Changed Successfully");
			}
			else {
				session.setAttribute("message", "Invalid Details");
			}
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("AdminPage.jsp");
		
	}

}

