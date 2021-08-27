package GetResponses;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/responses4")
public class responses4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public responses4() {
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
		System.out.println("driver loaded");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String program=request.getParameter("program");
		String choice=request.getParameter("choice");
		String facility=request.getParameter("facilty");
		String suggestions=request.getParameter("suggestions");
		try {
			// load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			//Connection establishment
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",	"ep","ep123");
			String sql="insert into form4 values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, age);
			pstmt.setString(4, program);
			pstmt.setString(5, choice);
			pstmt.setString(6, facility);
			pstmt.setString(7, suggestions);
			System.out.println("hchd");
			int count = pstmt.executeUpdate();
			if(count > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.forward(request, response);
			}
			System.out.println("hchd");
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
