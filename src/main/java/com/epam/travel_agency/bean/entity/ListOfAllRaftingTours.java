package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfSport;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllRaftingTours
 *
 * <p>Contains all available tours of type Rafting</p>
 */
public class ListOfAllRaftingTours {
    List<Rafting> listOfAllRaftingTours = new ArrayList<>();

    private static final ListOfAllRaftingTours instance = new ListOfAllRaftingTours();

    /**
     * Constructor fill in listOfRaftingTours with tours
     */
    private ListOfAllRaftingTours() {
        listOfAllRaftingTours.add(new Rafting(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfSport.RAFTING, 5));
        listOfAllRaftingTours.add(new Rafting(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.RAFTING, 7));
        listOfAllRaftingTours.add(new Rafting(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.RAFTING, 2));
        listOfAllRaftingTours.add(new Rafting(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.RAFTING, 1));
        listOfAllRaftingTours.add(new Rafting(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.RAFTING, 3));
        listOfAllRaftingTours.add(new Rafting(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfSport.RAFTING, 8));
        listOfAllRaftingTours.add(new Rafting(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfSport.RAFTING, 7));
        listOfAllRaftingTours.add(new Rafting(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfSport.RAFTING, 3));
        listOfAllRaftingTours.add(new Rafting(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypesOfSport.RAFTING, 9));
        listOfAllRaftingTours.add(new Rafting(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfSport.RAFTING, 4));
        listOfAllRaftingTours.add(new Rafting(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfSport.RAFTING, 8));
        listOfAllRaftingTours.add(new Rafting(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.RAFTING, 10));
        listOfAllRaftingTours.add(new Rafting(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfSport.RAFTING, 5));
        listOfAllRaftingTours.add(new Rafting(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfSport.RAFTING, 6));
        listOfAllRaftingTours.add(new Rafting(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.RAFTING, 9));

    }

    public List<Rafting> getListOfAllRaftingTours() {
        return listOfAllRaftingTours;
    }

    public static ListOfAllRaftingTours getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ListOfAllRaftingTours{" +
                "listOfAllRaftingTours=" + listOfAllRaftingTours +
                '}';
    }
}
