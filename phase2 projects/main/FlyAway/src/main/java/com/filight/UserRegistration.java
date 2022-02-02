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

@WebServlet("/UserRegistration")
publicclassUserRegistrationextendsHttpServlet {
	privatestaticfinallongserialVersionUID = 1L;
	protectedvoiddoPost(HttpServletRequestrequest, HttpServletResponseresponse) throwsServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String phno=request.getParameter("phno");
		String adno=request.getParameter("adno");
		
		HashMap<String,String>user=newHashMap<>();
		user.put("email", email);
		user.put("password", password);
		user.put("name", name);
		user.put("phno", phno);
		user.put("adno", adno);
		
		try {
			DAO dao=newDAO();
			booleanresult=dao.insertUser(user);
			HttpSessionsession=request.getSession();
			if(result) {
				session.setAttribute("message", "User Added Successfully");
			}
			else {
				session.setAttribute("message","Invalid Details");
			}
		} catch (ClassNotFoundException | SQLExceptione) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("UserPage.jsp");
	}

}

