/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import models.userException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
public class UnknownCommand extends Command{
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws userException {
        String msg = "Unknown command. Contact IT";
        throw new userException(msg);
    }
    
}
