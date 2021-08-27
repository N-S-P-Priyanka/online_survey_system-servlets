package displaying;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class display
 */
@WebServlet("/display4")
public class display4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count=0;
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body style='background-color:silver'>");  
        try 
        {  
        	
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ep", "ep123"); 
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from form4");  
            out.println("<center><table border=1 width=50% height=30%>");  
            out.println("<tr><th>Name</th><th>Email</th><th>Age</th><th>Program</th><th>Choice</th><th>Facility</th><th>Suggestions</th><tr>");  
            while (rs.next()) 
            {  
            	count++;
            	System.out.println("driver loaded");
        		String name=rs.getString("name");
        		String email=rs.getString("email");
        		String age=rs.getString("age");
        		String program=rs.getString("program");
        		String choice=rs.getString("choice");
        		String facility=rs.getString("faility");
        		String suggestions=rs.getString("suggestions");  
                out.println("<tr><td>"+name+"</td><td>"+email+"</td><td>"+age+"</td><td>"+program+"</td><td>"+choice+"</td><td>"+facility+"</td><td>"+suggestions+"</td></tr>");   
            }  
            out.println("<h1>Total responses="+count+"</h1>");
            out.println("</table></center>");  
            out.println("</html></body>");  
            con.close();  
        } 
        catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
	}

}
