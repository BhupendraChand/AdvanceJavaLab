
package lab4;


import java.sql.*;
public class InsertEx {
    public static void main(String [] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        Statement st = con.createStatement();
        String sql = "insert into employees(id,name,semester,rollno) values(1,'Sita','1 semester',12),(1,'Romeo','2ndsemester',12)";
        int row = st.executeUpdate(sql);
        if(row>0)
            System.out.println(row+"Row Insert Successfully");
        else
            System.out.println("Error");
        con.close();
    }          
}