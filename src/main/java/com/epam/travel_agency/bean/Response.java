package com.epam.travel_agency.bean;

import com.epam.travel_agency.bean.entity.TravelTour;

import java.util.List;

/**
 * Class Response
 *
 * Contains:
 * - a list of tours that meet the requirements of the user's requests.
 * - type of tour of the request of the user
 * - error message (if there was an error)
 * - a message about what exactly was done
 */
public class Response {
    private List<?extends TravelTour> listOfOrderedTours;
    private String typeOfTour;
    private String errorMessage;
    private String message;
    private boolean isErrorStatus;

    public Response() {
    }

    public void setListOfOrderedTours(List<? extends TravelTour> listOfOrderedTours) {
        this.listOfOrderedTours = listOfOrderedTours;
    }

    public List<? extends TravelTour> getListOfOrderedTours() {
        return listOfOrderedTours;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isErrorStatus() {
        return isErrorStatus;
    }

    public void setErrorStatus(boolean errorStatus) {
        isErrorStatus = errorStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
