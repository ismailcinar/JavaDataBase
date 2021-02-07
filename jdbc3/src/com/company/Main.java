package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  throws SQLException {
        Connection  connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
    String sql="insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
    statement=connection.prepareStatement(sql);
    statement.setString(1,"Çorum2");
    statement.setString(2,"Tur");
    statement.setString(3,"Turkey");
    statement.setString(4,"7777777");
            int result=statement.executeUpdate();
            System.out.println("Kayıt eklendi.");



        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }

}

 }
