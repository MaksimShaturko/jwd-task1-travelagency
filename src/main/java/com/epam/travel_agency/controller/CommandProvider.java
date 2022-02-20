package com.epam.travel_agency.controller;

import com.epam.travel_agency.controller.command.Command;
import com.epam.travel_agency.controller.command.impl.GetListOfTours;
import com.epam.travel_agency.controller.command.impl.SortListOfTours;

import java.util.HashMap;
import java.util.Map;

/**
 * The CommandProvider class is needed in order to get the commandName and
 * get from the Map exactly the command object that can execute the request
 * with the commandName command
 */
public class CommandProvider {

    private Map<String, Command> commands = new HashMap<>();

    /**
     * In Constructor CommandProvider (object is created in Controller), the
     * commands map is initialized, which contains the names of the commands
     * and the corresponding objects of the implementing classes of these
     * commands
     */
    public CommandProvider(){
        commands.put("GET_LIST_OF_REQUIRED_TOURS", new GetListOfTours());
        commands.put("SORT_TOURS", new SortListOfTours());
    }

    public Command getCommand(String commandName){
        Command command;
        command = commands.get(commandName);
        return command;
    }
}
