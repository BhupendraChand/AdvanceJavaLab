 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Employee List</h2>");
        out.println("<table border='1'><tr><th>Emp Id</th><th>Name</th><th>Address</th><th>Salary</th></tr>");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
        int eid = rs.getInt("eid");
        String name = rs.getString("name");
        String address = rs.getString("address");
        double salary =rs.getDouble("salary");

                out.println("<tr><td>" + eid + "</td><td>" + name + "</td><td>" + address + "</td><td>"+salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println("</table>");
        out.println("<br><a href='insert.html'>Add New Student</a>");
    }
}
