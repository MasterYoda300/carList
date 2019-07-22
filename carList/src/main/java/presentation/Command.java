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
       
       
       

    }

  

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception;

}
