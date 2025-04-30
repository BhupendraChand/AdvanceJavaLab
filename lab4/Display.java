/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;



import java.sql.*;
public class Display {
public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/company","root","");
    Statement st=con.createStatement();
    String sql="select * from employees";
    ResultSet rs=st.executeQuery(sql);
    System.out.println("Eid\tName\tAddress\tDepartment");
    while(rs.next())
    {
      System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
    }
    con.close();
}    
}