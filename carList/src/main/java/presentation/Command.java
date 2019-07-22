package presentation;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();

       // commands.put("login", new LoginCommand());
       // commands.put("shop", new ShopCommand());
        //commands.put("character", new CharacterCommand());
       

    }

  

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception;

}
