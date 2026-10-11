package com.vishal;

import java.sql.*;

public class Demo {
    private static final String url = "jdbc:mysql://localhost:3306/demo";
    private static final String userName = "root";
    private static final String password = "";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();

            String query = "select * from users";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println("Id: " + resultSet.getInt("id") + " Name: " + resultSet.getString("name"));
            }
            statement.close();
            connection.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
