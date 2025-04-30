/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ReadCookie extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         
        // Create a new cookie
        Cookie []ck = request.getCookies();
        for(int i=0; i<ck.length;i++){

        out.println("<h2> Cookie name="+ck[i].getName()+"</h2>");
               out.println("<h2> Cookie name="+ck[i].getValue()+"</h2>");

    }
    }
   
}
