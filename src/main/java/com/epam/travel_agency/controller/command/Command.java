package com.epam.travel_agency.controller.command;

import com.epam.travel_agency.bean.Request;
import com.epam.travel_agency.bean.Response;

import java.io.FileNotFoundException;

/**
 * Interface Command contains the method execute() which accept Request and
 * return Response.
 *
 * <p>What kind of request it will be and what the response will be is decided
 * in the classes implementing this interface</p>
 */
public interface Command {
    Response execute(Request request) throws FileNotFoundException;
}
