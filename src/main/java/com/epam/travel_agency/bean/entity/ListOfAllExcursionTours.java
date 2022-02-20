package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfExcursion;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfExcursionPlace;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllExcursionTours
 *
 * <p>Contains all available tours of type Excursion</p>
 */
public class ListOfAllExcursionTours {
    List<Excursion> listOfAllExcursionTours = new ArrayList<>();

    private static final ListOfAllExcursionTours instance = new ListOfAllExcursionTours();

    /**
     * Constructor fill in listOfExcursionTours with tours
     */
    private ListOfAllExcursionTours() {
        listOfAllExcursionTours.add(new Excursion(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, true,
                TypesOfExcursionPlace.OUT_OF_CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.WALKING));
        listOfAllExcursionTours.add(new Excursion(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.TRANSPORT));
        listOfAllExcursionTours.add(new Excursion(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, true,
                TypesOfExcursionPlace.CITY, TypesOfExcursion.TRANSPORT));




    }

    public static ListOfAllExcursionTours getInstance() {
        return instance;
    }

    public String toString() {
        return listOfAllExcursionTours.toString();
    }

    public List<Excursion> getListOfAllExcursionTours() {
        return listOfAllExcursionTours;
    }
}
