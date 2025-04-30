/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pradip;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServletInterfaceEx implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        
        this.config=config;
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> Create Servlet by implementing Servlet Interface.</h1>");
    }
    

    @Override
    public void destroy()
    {
        
    }
    @Override
    public ServletConfig getServletConfig()
    {
        return config;
    }
    @Override
    public String getServletInfo()
    {
        return "Servlet By implementing servlet Interface";
    }

}
