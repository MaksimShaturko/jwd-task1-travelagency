package com.epam.travel_agency.bean;

/**
 * Main common class Request for all other requests extended this one
 *
 * <p>Contains the only one field commandName which must be in every user
 * request
 * </p>
 */
public class Request {
    String commandName;

    /**
     * Constructor get command name and initialising field commandName
     * <p>There is no constructor without parameters because it cannot be a
     * request without command</p>
     * @param commandName
     */
    public Request(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }


}
