package com.epam.travel_agency.controller;

import com.epam.travel_agency.bean.Request;
import com.epam.travel_agency.bean.Response;
import com.epam.travel_agency.controller.command.Command;

import java.io.FileNotFoundException;

/**
 * Class Controller has access to CommandProvider where it directs Request
 * by the method doAction() called from ConsoleView
 */
public class Controller {

    private final CommandProvider provider = new CommandProvider();

    /**
     * Get commandName from request
     *
     * Call method getCommand() from CommandProvider provider to get object
     * implemented Command, which can execute this particular type of command
     * received from request (commandName in class Request parent to any
     * types of requests)
     *
     * Doing method execute() in received object implemented Command and
     * getting the response
     *
     * interface Command
     * @param request
     * @return response
     * @throws FileNotFoundException
     */
    public Response doAction(Request request) throws FileNotFoundException {
        String commandName = request.getCommandName();

        Command command = provider.getCommand(commandName);

        Response response = command.execute(request);

        return response;

    }
}
