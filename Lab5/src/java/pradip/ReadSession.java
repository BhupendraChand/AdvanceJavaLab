/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ReadSession extends HttpServlet {
   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        String sessionValue=(String)session.getAttribute("username");
         
out.println("<h2> Session  value=" +sessionValue+"</h2>");

      

         
   }
}