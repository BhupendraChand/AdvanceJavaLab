/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class GenericServlet extends HttpServlet {

      @Override
      public void service (ServletRequest req,ServletResponse res)
            throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.print("<html><body>");
        out.print("<h1>Create Servlet by extending GenericServlet.</h1>");
        out.print("</body></html>");
        
        
    }
}

