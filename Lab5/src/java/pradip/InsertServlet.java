 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InsertServlet extends HttpServlet {
    public void doPost(HttpServletRequest req ,HttpServletResponse res ) throws IOException, ServletException
    {
        try {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int eid = Integer.parseInt(req.getParameter("eid"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        double salary = Double.parseDouble(req.getParameter("salary"));
        
            // Load MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to Database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            // Prepare SQL statement
            PreparedStatement ps = conn.prepareStatement("INSERT INTO employee (eid, name, address, salary) VALUES (?, ?, ?, ?)");
            ps.setInt(1, eid);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setDouble(4, salary);
            int row = ps.executeUpdate();
            
            if(row>0)
            {
                out.println("<p>Insert Successfully</P>");
            }
            else{
                out.println("<p>Error in Insertion</p>");
            }

            ps.close();
            conn.close();
            
     } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            res.getWriter().println("SQL Error: " + e.getMessage()); // Display error
        }
    }
}
