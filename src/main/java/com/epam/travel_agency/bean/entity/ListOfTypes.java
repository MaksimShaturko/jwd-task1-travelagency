package com.epam.travel_agency.bean.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfTypes
 *
 * <p>Contains list of all available types of tours</p>
 */
public class ListOfTypes {
    private static final ListOfTypes instance = new ListOfTypes();

    private List<String> listOfTypes = new ArrayList<>();

    /**
     * Constructor fill in listOfTypes with types of tours
     */
    private ListOfTypes(){
        listOfTypes.add("Relax");
        listOfTypes.add("Excursion");
        listOfTypes.add("Rafting");
        listOfTypes.add("DownhillSkiing");
        listOfTypes.add("Diving");
        listOfTypes.add("Fishing");
        listOfTypes.add("Hunting");
        listOfTypes.add("Cruise");
        listOfTypes.add("Treatment");
    }

    public static ListOfTypes getInstance(){
        return instance;
    }

    public String toString(){
        return listOfTypes.toString();
    }

    public List<String> getListOfTypes() {
        return listOfTypes;
    }
}
