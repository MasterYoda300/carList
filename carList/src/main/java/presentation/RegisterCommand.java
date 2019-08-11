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
public class RegisterCommand extends Command {

@Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws userException, IOException {
        try {
            String email = request.getParameter("email");
            byte[] bytes = email.getBytes(StandardCharsets.ISO_8859_1);
            email = new String(bytes, StandardCharsets.UTF_8);
            String password1 = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            String userName = request.getParameter("userName");
            byte[] FNbytes = userName.getBytes(StandardCharsets.ISO_8859_1);
            userName = new String(FNbytes, StandardCharsets.UTF_8);
         

            if (password1.equals(password2)) {
                User user = LogicFacade.createUser(email, password2, userName);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                // session.setAttribute( "role", user.getRole() );
                // return user.getRole() + "page";
                return "../index";

            } else {
                response.sendRedirect("jsp/login.jsp?Rerror=true");
            }

        } catch (userException e) {
            request.setAttribute("Rerror", e.getMessage());

        }
        return "../index";

    }
}
