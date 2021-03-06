package presentation;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put ("Toyota", new ToyotaCommand());
        commands.put("VW", new VWCommand());
         commands.put("Logout", new LogoutCommand());
        commands.put("login", new LoginCommand());
        commands.put("register", new RegisterCommand());
       
       
       

    }

  
static Command from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand());
    }

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception;

}