package com.jdit;

import java.sql.*;

public class Test {
    @org.junit.Test
    public  void  show(){
        //加载驱动
        try {
            Class.forName("oracle.jdbc.OracleDriver");
       //建立连接
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "123456");
String sql="select * from u_users";
            //4
            PreparedStatement ps=connection.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
