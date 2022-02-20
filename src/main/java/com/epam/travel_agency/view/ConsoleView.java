package com.epam.travel_agency.view;

import com.epam.travel_agency.bean.GetToursRequest;
import com.epam.travel_agency.bean.Response;
import com.epam.travel_agency.bean.SortToursRequest;
import com.epam.travel_agency.controller.Controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The main class in which the application starts.
 *
 * <p>Create a Controller object</p>
 *
 * <p>Create a GetToursRequest object, thereby forming requirements
 * user (generated in the GetToursRequest constructor)</p>
 *
 * <p>We send a request to the created Controller object and get a response in
 * the Response object</p>
 *
 * <p>This object contains a generated list of tours according to wishes
 * the user. If the isErrorStatus in Response is false, then the list means
 * formed, there are no errors, you can view the list.</p>
 *
 * <p>After receiving and viewing the generated list, we create an object of
 * the class SortToursRequest, thereby forming a request to sort this list.</p>
 *
 * <p>Sorting by price and duration of the trip is possible. The sorting type
 * is selected randomly. This request is sent to the created Controller
 * object.</p>
 *
 * <p>The Response class object is returned again and if there are no errors,
 * then the user can see the result</p>
 */
public class ConsoleView {

    public static void main(String[] args) throws FileNotFoundException {

        Controller controller = new Controller();

        // Creating a user request to get a list of tours
        GetToursRequest getToursRequest = new GetToursRequest("GET_LIST_OF_REQUIRED_TOURS");

        /*
         * Send a request to controller.doAction, where it is defined
         * where exactly, to which object Command to send the request.
         * Request is accepted there - a super class for GetToursRequest
         */
        Response response = controller.doAction(getToursRequest);

        /*
         * Check the status of the response error. If there is no error, then
         * output required list
         */
        if (response.isErrorStatus()) {
            System.out.println(response.getErrorMessage());
        } else {
            System.out.println(response.getMessage());
            System.out.println(response.getListOfOrderedTours());
        }

        // Creating a list to add sorting types to it
        List<String> listOfSortingTypes = new ArrayList<>();
        listOfSortingTypes.add("price");
        listOfSortingTypes.add("durationOfTrip");

        // Random number for random selection of the sorting type
        Random random = new Random();
        int numberOfSortingType = random.nextInt(2);

        // Creating a user request to sort the list
        SortToursRequest sortToursRequest = new SortToursRequest("SORT_TOURS",
                response.getListOfOrderedTours(),
                listOfSortingTypes.get(numberOfSortingType));

        /*
         * We send a request to controller.doAction, where it is defined
         * where exactly, to which object Command to send the request.
         * Request is accepted there - a super class for GetToursRequest
         */
        response = controller.doAction(sortToursRequest);

        /*
         * Check the status of the response error. If there is no error, then
         *  output required list
         */
        if (response.isErrorStatus()) {
            System.out.println(response.getErrorMessage());
        } else {
            System.out.println(response.getMessage());
            System.out.println(response.getListOfOrderedTours());
        }


    }
}
