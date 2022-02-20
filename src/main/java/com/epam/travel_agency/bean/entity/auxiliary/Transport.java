package com.epam.travel_agency.bean.entity.auxiliary;

import java.util.ArrayList;
import java.util.List;

/**
 * ENUM contains types of transport used in travel tours.
 *
 * @author Maksim Shaturko
 */
public class Transport {

    /**
     * The variable indicates the only instance of class Food
     */
    private static final Transport instance = new Transport();

    /**
     * Contains types of transport
     */
    private List<String> listOfTransport = new ArrayList<>();

    /**
     * Constructor fills listOfTransport with types of food
     */
    private Transport(){
        listOfTransport.add("Fly");
        listOfTransport.add("Bus");
        listOfTransport.add("Minibus");
        listOfTransport.add("Sea");
        listOfTransport.add("Own car");
    }

    public static Transport getInstance(){
        return instance;
    }

    public List<String> getListOfTransport() {
        return listOfTransport;
    }

    public void setListOfTransport(List<String> listOfTransport) {
        this.listOfTransport = listOfTransport;
    }

    /**
     * Add type of transport to listOfTransport
     *
     * @param typeOfTransport
     */
    public void addToLIstOfFood(String typeOfTransport){
        listOfTransport.add(typeOfTransport);
    }

    public String toString(){
        return listOfTransport.toString();
    }
}
