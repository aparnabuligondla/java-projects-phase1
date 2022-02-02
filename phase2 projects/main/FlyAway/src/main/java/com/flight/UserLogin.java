packagecom.flight;

importjavax.servlet.annotation.WebServlet;
importjava.io.IOException;
importjava.sql.SQLException;
importjava.util.HashMap;

importjavax.servlet.ServletException;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;
importjavax.servlet.http.HttpSession;

importcom.database.DAO;
@WebServlet("/UserLogin")
publicclassUserLoginextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;
protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
			DAO dao=newDAO();
			HashMap<String,String>user=dao.checkUser(email,password);
			HttpSessionsession=request.getSession();
			if(user!=null) {
				session.setAttribute("user", user);
				response.sendRedirect("HomePage.jsp");
			}
			else {
				session.setAttribute("message", "Invalid Details");
				response.sendRedirect("UserPage.jsp");
			}
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}



