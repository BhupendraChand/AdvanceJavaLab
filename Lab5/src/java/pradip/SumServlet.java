package pradip;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SumServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         int num = Integer.parseInt(request.getParameter("number"));
         int sum = 0;
         while(num>0){
             sum += num %10;
             num /=10;
         }
         out.println("<h2>Sum of Digits</h2>");
            
            out.println("<p>The Sum of digits is: " + sum + "</p>");
         
           
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}