package com.epam.travel_agency.controller.command.impl;

import com.epam.travel_agency.bean.GetToursRequest;
import com.epam.travel_agency.bean.Request;
import com.epam.travel_agency.bean.Response;
import com.epam.travel_agency.bean.entity.TravelTour;
import com.epam.travel_agency.controller.command.Command;
import com.epam.travel_agency.dao.source.ToursProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class GetListOfTours implements interface Command and its method execute
 *
 * <p>Gets GetToursRequest (extended Request) of user with type
 * GET_LIST_OF_REQUIRED_TOURS and make the list of requirement tours and put
 * this list to Response</p>
 */
public class GetListOfTours implements Command {

    public GetListOfTours() {
    }

    /**
     * The execute method is called from the Controller object, accepts the
     * user's request, determines whether it is a GetToursRequest type, makes
     * an explicit cast and works with the request.
     *
     * From the request we get a file containing the user's requirements and
     * from there we read the data in order.
     *
     * In accordance with the received data, we form a list of tours to the
     * user that meets the requirements.
     *
     * We write this list to the Response object and return a reference to this
     * object in Controller
     *
     * @param request
     * @return response contained messages and required list of tours
     * @throws FileNotFoundException
     */
    public Response execute(Request request) throws FileNotFoundException {

        // Checking if this is the correct request
        GetToursRequest getToursRequest = null;
        if (request instanceof GetToursRequest) {
            getToursRequest = (GetToursRequest) request;
        }

        // We send the user's choice to the Scanner in the form of a file.
        Scanner sc = new Scanner(new File(getToursRequest.getPath()));

        // We read the tour type from the file
        String typeOfTour = sc.nextLine();

        // Creating sheets for the types of transport that the user has chosen
        List<String> typesOfTransport = new ArrayList<>();

        // We read the transport types in the user's request and add them to
        // the list
        for (int i = 0; i < getToursRequest.getNumberOfChosenTypesOfTransport(); i++) {
            typesOfTransport.add(sc.nextLine());
        }
        System.out.println(typesOfTransport);

        // We read the number of days of the tour "FROM"
        int lengthFrom = Integer.parseInt(sc.nextLine());
        System.out.println("lengthFrom = " + lengthFrom);

        // We read the number of days of the tour "TO"
        int lengthUntil = Integer.parseInt(sc.nextLine());
        System.out.println("lengthUntil = " + lengthUntil);

        // Creating sheets for the types of food that the user has chosen
        List<String> typesOfFood = new ArrayList<>();

        // We read the types of food in the user's request
        for (int i = 0; i < getToursRequest.getNumberOfChosenTypesOfFood(); i++) {
            typesOfFood.add(sc.nextLine());
        }
        System.out.println(typesOfFood);

        // Get a list of all tours of the required type
        List<? extends TravelTour> newList = ToursProvider.getInstance()
                                                          .getMapOfTourTypeLists()
                                                          .get(typeOfTour);

        // We filter the resulting list in accordance with the rest of the
        // user's requirements and assign the requiredList
        List<TravelTour> requiredList = formRequestedListOfTours(newList,
                typesOfTransport, typesOfFood, lengthFrom, lengthUntil);

        Response response = new Response();

        // We enter the received list in the request, set ErrorStatus and
        // a message that the list is sorted
        response.setListOfOrderedTours(requiredList);
        response.setErrorStatus(false);
        response.setMessage("List of requested required tours has been formed:");

        sc.close();

        return response;
    }

    /**
     * Check a list of a user's tour type for user's other requirements
     * @param newList
     * @param typesOfTransport
     * @param typesOfFood
     * @param lengthFrom
     * @param lengthUntil
     * @return
     */
    private List<TravelTour> formRequestedListOfTours(List<? extends TravelTour> newList,
                             List<String> typesOfTransport,
                             List<String> typesOfFood,
                             int lengthFrom, int lengthUntil) {
        List<TravelTour> requiredList = new ArrayList<>();

        for (TravelTour tour : newList) {
            if (checkTransport(tour.getTransport(), typesOfTransport)
                    && checkFood(tour.getFood(), typesOfFood)
                    && tour.getDurationOfTrip() >= lengthFrom
                    && tour.getDurationOfTrip() <= lengthUntil) {
                requiredList.add(tour);
            }
        }

        return requiredList;
    }

    /**
     * Check every tour for type of transport chosen by user
     * @param transport
     * @param list
     * @return true or false
     */
    private boolean checkTransport(String transport, List<String> list) {
        for (String s : list) {
            if (s.equals(transport)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check every tour for type of food chosen by user
     * @param food
     * @param list
     * @return trueor false
     */
    private boolean checkFood(String food, List<String> list) {
        for (String s : list) {
            if (s.equals(food)) {
                return true;
            }
        }
        return false;
    }
}