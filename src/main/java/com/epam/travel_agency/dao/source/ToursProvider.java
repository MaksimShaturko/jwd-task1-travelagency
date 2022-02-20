package com.epam.travel_agency.dao.source;

import com.epam.travel_agency.bean.entity.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class TourProvider provides date.
 *
 * <p>All lists of available type of tours can be obtained in ToursProvider</p>
 *
 * <p>Types of tours are in listOfTypes</p>
 *
 * <p>Lists of available tours relate to type of tour are
 * in mapOfTourTypeLists</p>
 */
public class ToursProvider {
    private Map<String, List<? extends TravelTour>> mapOfTourTypeLists = new HashMap<>();
    private List<String> listOfTypes;

    private static final ToursProvider instance = new ToursProvider();

    /**
     * Constructor initialize listOfTypes and mapOfTourTypeLists by getting
     * data from Lists in com.epam.travel_agency.bean.entity
     */
    private ToursProvider() {
        listOfTypes = ListOfTypes.getInstance().getListOfTypes();

        mapOfTourTypeLists.put(listOfTypes.get(0),
                ListOfAllRelaxTours.getInstance()
                                   .getListOfAllRelaxTours());
        mapOfTourTypeLists.put(listOfTypes.get(1),
                ListOfAllExcursionTours.getInstance()
                                       .getListOfAllExcursionTours());
        mapOfTourTypeLists.put(listOfTypes.get(2),
                ListOfAllRaftingTours.getInstance()
                                     .getListOfAllRaftingTours());
        mapOfTourTypeLists.put(listOfTypes.get(3),
                ListOfAllDownhillSkiingTours.getInstance()
                                            .getListOfAllDownhillSkiingTours());
        mapOfTourTypeLists.put(listOfTypes.get(4),
                ListOfAllDivingTours.getInstance()
                                    .getListOfAllDivingTours());
        mapOfTourTypeLists.put(listOfTypes.get(5),
                ListOfAllFishingTours.getInstance()
                                     .getListOfAllFishingTours());
        mapOfTourTypeLists.put(listOfTypes.get(6),
                ListOfAllHuntingTours.getInstance()
                                     .getListOfAllHuntingTours());
        mapOfTourTypeLists.put(listOfTypes.get(7),
                ListOfAllCruiseTours.getInstance()
                                    .getListOfAllCruiseTours());
        mapOfTourTypeLists.put(listOfTypes.get(8),
                ListOfAllTreatmentTours.getInstance()
                                       .getListOfAllTreatmentTours());

    }

    public static ToursProvider getInstance() {
        return instance;
    }

    public Map<String, List<? extends TravelTour>> getMapOfTourTypeLists() {
        return mapOfTourTypeLists;
    }

    public List<String> getListOfTypes() {
        return listOfTypes;
    }
}
