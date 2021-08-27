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
@WebServlet("/display3")
public class display3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display3() {
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
            ResultSet rs = stmt.executeQuery("select * from form3");  
            out.println("<center><table border=1 width=50% height=30%>");  
            out.println("<tr><th>Name</th><th>Email</th><th>JobLevel</th><th>Experience</th><th>Meaniful</th><th>Satisfaction</th><th>Position</th><th>Improve</th><th>Comments</th><tr>");  
            while (rs.next()) 
            {  
            	count++;
            	System.out.println("driver loaded");
        		String name=rs.getString("name");
        		String email=rs.getString("email");
        		String joblevel=rs.getString("joblevel");
        		String experience=rs.getString("experience");
        		String meaniful=rs.getString("meaniful");
        		String satisfaction=rs.getString("satisfaction");
        		String position=rs.getString("position");
        		String improve=rs.getString("improve");
        		String comments=rs.getString("comments");   
                out.println("<tr><td>"+name+"</td><td>"+email+"</td><td>"+joblevel+"</td><td>"+experience+"</td><td>"+meaniful+"</td><td>"+satisfaction+"</td><td>"+position+"</td><td>"+improve+"</td><td>"+comments+"</td></tr>");   
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
