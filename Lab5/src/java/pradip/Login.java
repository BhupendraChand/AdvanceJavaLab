/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
       
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        RequestDispatcher rd;
        
        if(username.equals("bhupendra") && password.equals("venom"))
        {
            rd = req.getRequestDispatcher("/DashboardAdmin");
            rd.forward(req, res);
        }
        else{
            out.println("<h2> Invalid User </h2>");
            rd = req.getRequestDispatcher("/login.html");
            rd.forward(req, res);
        }
        
    }
}
