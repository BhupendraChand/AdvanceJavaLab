
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exception Handling</title>
    </head>
    <body>
      
        <form action="" method="POST">
            <fieldset>
                 <legend>Division Operation</legend>
            <legend> Enter the First Number</legend>
            <input type="text" name="fnum">
            <br><br>
            <legend> Enter the Second Number</legend>
            <input type="text" name="snum">
            <br> <br>
              <input type="submit" name="calculate" value="divide">
              </fieldset>
        </form>   
        <%
            if(request.getParameter("calculate")!=null){
int fnum= Integer.parseInt(request.getParameter("fnum"));
int snum= Integer.parseInt(request.getParameter("snum"));
int div=fnum/snum;
out.println("<h2> The Divide is ="+div+"</h2>");
            }
                
                %>
    </body>
</html>
