/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import models.userException;
import models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author stoff
 */
public class UserMapper {

// creates user
    public static User createuser(User user) throws userException {

        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO user (email, password, userName) VALUES ( ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getUserName());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setId(id);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new userException(ex.getMessage());
        }
        return user;
    }

    // Method to login as a user through users email and password.
    public static User login(String email, String password) throws userException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT id, userName FROM user  "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String userName = rs.getString("userName");
                int id = rs.getInt("id");
               User user = new User (email,password,userName);
                user.setId(id);
                return user;
            } else {
                throw new userException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new userException(ex.getMessage());
        }
    }

}
