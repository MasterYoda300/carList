/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class connector {
    private static final String URL = "jdbc:mysql://68.183.66.133:3306/carList?UseSSL=false";
    private static final String USERNAME = "car";
    private static final String PASSWORD = "ocRIx1qn9bM2UqrK";

    private static Connection singleton;

    public static Connection connection() throws ClassNotFoundException, SQLException
    {
        if (singleton == null)
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }
}
