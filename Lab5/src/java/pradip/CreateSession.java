 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CreateSession extends HttpServlet {
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        session.setAttribute("username","Bhupendra_Chand");
        
out.println("<h2> Session  is created successfully.</h2>");

        out.println("<a href='ReadSession'>Click here to read Session.</a>");

         
   }
}