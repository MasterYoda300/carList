/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import logic.LogicFacade;
import models.userException;
import models.User;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author pc
 */
public class LoginCommand extends Command {
    
    
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws userException, IOException {
        try {
            String email = request.getParameter("email");
            byte[] bytes = email.getBytes(StandardCharsets.ISO_8859_1);
            email = new String(bytes, StandardCharsets.UTF_8);

            String password = request.getParameter("password");
           User user = LogicFacade.login(email, password);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        } catch (userException e) {
            request.setAttribute("error", e.getMessage());
            response.sendRedirect("jsp/login.jsp?error=true");
        }
        return "../index";
    }
}
