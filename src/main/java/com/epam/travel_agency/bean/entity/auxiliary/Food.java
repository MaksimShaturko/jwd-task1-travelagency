package com.epam.travel_agency.bean.entity.auxiliary;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Food contains types of food using in travel tours
 *
 * @author Maksim Shaturko
 */
public class Food {

    /**
     * The variable indicates the only instance of class Food
     */
    private static final Food instance = new Food();

    /**
     * Contains types of food
     */
    List<String> listOfFood = new ArrayList<>();

    /**
     * Constructor fills listOfFood with types of food
     */
    private Food(){
        listOfFood.add("RO");
        listOfFood.add("BB");
        listOfFood.add("HB");
        listOfFood.add("FB");
        listOfFood.add("AI");
        listOfFood.add("UAI");
    }

    public static Food getInstance(){
        return instance;
    }

    public List<String> getListOfFood() {
        return listOfFood;
    }

    public void setListOfFood(List<String> listOfFood) {
        this.listOfFood = listOfFood;
    }

    /**
     * Add type of food to listOfFood
     *
     * @param typeOfFood
     */
    public void addToLIstOfFood(String typeOfFood){
        listOfFood.add(typeOfFood);
    }

    public String toString(){
        return listOfFood.toString();
    }
}
