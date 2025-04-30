/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HttpServletEx extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
              throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Create Servlet by extending HttpServlet.</h1>");
    }
}