/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.UserMapper;
import models.User;
import models.userException;

/**
 *
 * @author pc
 */
public class LogicFacade {
    
 public static User login(String email, String password) throws userException {
        return UserMapper.login(email, password);
    
}
     
      public static User createUser(String email, String password, String userName) throws userException {
        User user = new User(email, password, userName);
        UserMapper.createuser(user);
        return user;
}
}

