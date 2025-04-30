/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class cookie extends HttpServlet {
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        // Create a new cookie
        Cookie cookie = new Cookie("username", "Bhupendra_Chand");


        cookie.setMaxAge(100);
        response.addCookie(cookie);
out.println("<h2> Cookie is created.</h2>");

        out.println("<a href='ReadCookie'>Click here to read cookie.</a>");
        
    }

   
}