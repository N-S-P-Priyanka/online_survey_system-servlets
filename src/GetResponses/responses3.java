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
@WebServlet("/responses3")
public class responses3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public responses3() {
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
		String joblevel=request.getParameter("dropdown");
		String experience=request.getParameter("number");
		String meaniful=request.getParameter("tab-group-1");
		String satisfaction=request.getParameter("tab-group-2");
		String position=request.getParameter("radio-buttons");
		String improve=request.getParameter("check-boxes");
		String comments=request.getParameter("comment");
		try {
			// load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			//Connection establishment
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",	"ep","ep123");
			String sql="insert into form3 values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, joblevel);
			pstmt.setString(4, experience);
			pstmt.setString(5, meaniful);
			pstmt.setString(6, satisfaction);
			pstmt.setString(7, position);
			pstmt.setString(8, improve);
			pstmt.setString(9, comments);
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
