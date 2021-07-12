package com.braincraft.praktike;

import com.mysql.cj.protocol.Resultset;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class ConnectiontoDB {
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultset = null;

    //connection factory
    public  static Connection setConnection (){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/provat", "root", "Sonnecto001 @");
            return connection;
        }catch (Exception e){

            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
       return  connection;
    }

    public static Statement setStatement (){

        try {
            statement = setConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return statement;
    }

    public static int writetoDB (String query) throws SQLException {
        return setStatement().executeUpdate(query);
    }

}
