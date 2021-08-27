package Login_verify;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
String un=request.getParameter("uname");
String pw=request.getParameter("pswd");
try {
// load the driver
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver loaded");
//Connection establishment
Connection conn = DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe", "ep","ep123");
String sql="select * from register_value where username = ? and password = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, un);
pstmt.setString(2, pw);
ResultSet rs = pstmt.executeQuery();
if(rs.next()) {
	HttpSession session=request.getSession(true);  
    session.setAttribute("name",un); 
    response.sendRedirect("login.jsp"); 
}
else {
RequestDispatcher rd = request.getRequestDispatcher("failure.html");
rd.forward(request, response);
}

} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

}