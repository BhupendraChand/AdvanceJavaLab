
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Display Page</title>
    </head>
    <body>
 <fieldset>
            <h1>Employee Information</h1>
            <form action="" method="POST">
                 <legend>Id:</legend>
                <input type="number" name="eid"><br><br>
                 <legend>Name: </legend>
                <input type="text" name="name"><br><br>
                   <legend>Address:</legend>
                <input type="text" name="address"><br><br>
                 <legend>Salary: </legend>
                <input type="text" name="salary"><br><br>
                 <input type="submit" name="submit" >
            </form>
            
        </fieldset>

<%
   if (request.getParameter("submit")!=null){
        int eid = Integer.parseInt(request.getParameter("eid"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int salary = Integer.parseInt(request.getParameter("salary"));
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
            String sql = "insert into employee values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, eid);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setInt(4,salary);
            int row = ps.executeUpdate();
            if (row > 0) {
                String sql2 = "Select * from employee";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ResultSet row2 = ps2.executeQuery();
                out.println("<table border='1'><th>Eid</th><th>Name</th><th>Address</th><th>Salary</th>");
                while (row2.next()) {
                    out.println("<tr><td>"+row2.getInt("eid")+"</td>");
                    out.println("<td>"+row2.getString("name")+"</td>");
                    out.println("<td>"+row2.getString("address")+"</td>");
                    out.println("<td>"+row2.getInt("salary")+"<td></tr>");
                }
                out.println("</table>");
            }
            else{
                out.println("<html><body></body><script>alert('Error')</script></html>");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
</body>
</html>
