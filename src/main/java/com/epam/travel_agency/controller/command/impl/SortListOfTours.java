package com.epam.travel_agency.controller.command.impl;

import com.epam.travel_agency.bean.Request;
import com.epam.travel_agency.bean.Response;
import com.epam.travel_agency.bean.SortToursRequest;
import com.epam.travel_agency.bean.entity.TravelTour;
import com.epam.travel_agency.controller.command.Command;

import java.util.Collections;

/**
 * Class SortListOfTours implements interface Command and its method execute()
 *
 * <p>Gets SortToursRequest (extended Request) of user with type SORT_TOURS
 * and sort the list of tours and put this list to Response</p>
 */
public class SortListOfTours implements Command {

    /**
     * <p>The execute method is called from the Controller object, gets the
     * user's request, determines whether it is a SortToursRequest type, makes
     * an explicit cast and works with the request.</p>
     *
     * <p>From the request we get a user's command of sorting the list and
     * the list is needed to sort, type of sorting parameter</p>
     *
     * <p>Sort the list</p>
     *
     * <p>We write this sorted list to the Response object and return a
     * reference to this object in Controller</p>
     * @param request
     * @return
     */
    @Override
    public Response execute(Request request) {

        // Checking if this is the correct request
        SortToursRequest sortToursRequest = null;
        if (request instanceof SortToursRequest) {
            sortToursRequest = (SortToursRequest) request;
        }

        Response response = new Response();

        //Sorting by price or by durationOfTrip
        switch (sortToursRequest.getSortingType()) {

            case "price":
                Collections.sort(sortToursRequest.getSortingList(),
                                (TravelTour o1, TravelTour o2) -> {
                    if(o1.getPrice() > o2.getPrice()){
                        return 1;
                    }
                    if(o1.getPrice() < o2.getPrice()){
                        return -1;
                    }
                    return 0;
                });

                response.setMessage("\nThe list is sorted by price:");
                response.setErrorStatus(false);
                response.setListOfOrderedTours(sortToursRequest.getSortingList());
                break;

            case "durationOfTrip":
                Collections.sort(sortToursRequest.getSortingList(),
                                (TravelTour o1, TravelTour o2) -> {
                    if(o1.getDurationOfTrip() > o2.getDurationOfTrip()){
                        return 1;
                    }
                    if(o1.getDurationOfTrip() < o2.getDurationOfTrip()){
                        return -1;
                    }
                    return 0;
                });

                response.setMessage("\nThe list is sorted by duration of Trip:");
                response.setErrorStatus(false);
                response.setListOfOrderedTours(sortToursRequest.getSortingList());
                break;

            default:
                response.setErrorStatus(true);
                response.setErrorMessage("Something has gone wrong");
                break;
        }

        return response;
    }
}


