

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sum of Individual Digits</title>
    </head>
    <body>
        <h1>Sum of Digits</h1>
        <form action="" method="POST">
            <label> Enter the number</label>
            <input type="text" name="number">
            <br> <br>
              <input type="submit" name="calculate" value="calculate">
        </form><!-- comment -->
        
        <%
if(request.getParameter("calculate")!=null){
int n= Integer.parseInt(request.getParameter("number"));
int sum=0;
int temp=n;
while(temp!=0){
int digit=temp%10;
sum+=digit;
temp=temp/10;
            }
            
            out.println("<h2> The sum of digits is ="+sum+"</h2>");
            }
                %>
    </body>
</html>
