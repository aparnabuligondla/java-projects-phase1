packagecom.database;

importjava.sql.Connection;
importjava.sql.DriverManager;
importjava.sql.ResultSet;
importjava.sql.SQLException;
importjava.sql.Statement;
importjava.util.ArrayList;
importjava.util.HashMap;
importjava.util.List;

publicclass DAO {
	public Connection con=null;
	public Statement st=null;
	public DAO() throwsClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","password");
		System.out.println("connection established with database");
		st=con.createStatement();
	}
public List<String[]>getAvailableFlights(String f, String t, String d) {
		
		List<String[]>flights=newArrayList<>();
		String query="SELECT * FROM flyaway.flights where fromf='"+f+"' and tof='"+t+"' and datef='"+d+"'";
		try {
			ResultSetrs=st.executeQuery(query);
			
			if(rs.next()) {
				String[] flight=new String[3];
				flight[0]=rs.getString("name");
				flight[1]=rs.getString("timef");
				flight[2]=rs.getString("price");
				flights.add(flight);
				returnflights;
			}
			
			
		} catch (SQLExceptione) {
			e.printStackTrace();
		}
		
		returnnull;
	}

publicHashMap<String, String>checkUser(String email, String password) {
	
	HashMap<String,String>user=null;
	String query="select * from user where email='"+email+"' and password='"+password+"'";
	try {
		ResultSetrs=st.executeQuery(query);
		if(rs.next()) {
			user=newHashMap<>();
			user.put("name", rs.getString("name"));
			user.put("email",rs.getString("email"));
			user.put("phno",rs.getString("phno"));
			user.put("adno",rs.getString("adno"));
		}
		returnuser;
	} catch (SQLExceptione) {
		e.printStackTrace();
	}

	returnuser;
}

publicbooleaninsertUser(HashMap<String, String>user) {

	String query="INSERT INTO user (email, password, name, phno, adno) values('"+user.get("email")+"','"+user.get("password")+"','"+user.get("name")+"','"+user.get("phno")+"','"+user.get("adno")+"')";                   
	
	try {
		st.execute(query);
		returntrue;
	} catch (SQLExceptione) {
		e.printStackTrace();
	}
	returnfalse;
}

publicbooleancheckAdmin(String email, String password) {
	
	try {
		ResultSetrs=st.executeQuery("select * from admin where email='"+email+"' and password='"+password+"'");
		if(rs.next())
			returntrue;
	} catch (SQLExceptione) {
		e.printStackTrace();
	}
	returnfalse;
}

publicbooleanchangeAdminPassword(String email, String password) {

	try {
		ResultSetrs=st.executeQuery("select * from admin where email='"+email+"'");
		if(!rs.next()) {
			returnfalse;
		}
		st.execute("update admin set password='"+password+"' where email='"+email+"'");
		returntrue;
	} catch (SQLExceptione) {
		e.printStackTrace();
	}
	returnfalse;
}

publicbooleaninsertFlight(HashMap<String, String>flight) throwsSQLException {
	//PreparedStatementstm=con.prepareStatement("INSERT INTO 'flyaway.flights' ('name', 'from', 'to', 'date', 'time', 'price') values(?,?,?,?,?,?)");
	//String sql="INSERT INTO flights ('name','from','to','date','time','price') values('"+flight.get("name")+"','"+flight.get("from")+"','"+flight.get("to")+"','"+flight.get("date")+"','"+flight.get("time")+"','"+flight.get("price")+"');";
	String query1 = "INSERT INTO flights (name, fromf, tof, datef, timef, price) VALUES"+ " ('"
			+ StringUtil.fixSqlFieldValue(flight.get("name")) + "'," + " '" + StringUtil.fixSqlFieldValue(flight.get("from")) + "'," + " '"
			+ StringUtil.fixSqlFieldValue(flight.get("to")) + "'," + " '" + StringUtil.fixSqlFieldValue(flight.get("date")) + "'," + " '"
			+ StringUtil.fixSqlFieldValue(flight.get("time")) + "'," + " '" + StringUtil.fixSqlFieldValue(flight.get("price")) + "')";
	
	//String sql="INSERT INTO `flyaway`.`flights` (`name`, `fromf`, `tof`, `datef`, `timef`, `price`) VALUES ('indigo', 'hyd', 'viz', '2021-04-08', '10:00', '2000');";
	System.out.println(flight.get("date"));
	System.out.println(flight.get("time"));
	//String query1="INSERT into flyaway.flights (name,from,to,date,time,price) values('indigo','hyd','viz','24-02-2022','10:30','2000')";
	try {
		//stm.execute();
		st.execute(query1);
		returntrue;
	} catch (SQLExceptione) {
		System.out.print("error");
		e.printStackTrace();
	}
	returnfalse;
}
}






