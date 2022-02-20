package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfSport;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllDownhillSkiingTours
 *
 * <p>Contains all available tours of type DownhillSkiing</p>
 */
public class ListOfAllDownhillSkiingTours{

    List<DownhillSkiing> listOfAllDownhillSkiingTours = new ArrayList<>();

    private static final ListOfAllDownhillSkiingTours instance = new ListOfAllDownhillSkiingTours();

    /**
     * Constructor fill in listOfDownhillSkiingTours with tours
     */
    private ListOfAllDownhillSkiingTours() {
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));
        listOfAllDownhillSkiingTours.add(new DownhillSkiing(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfSport.DOWNHILL_SKIING,
                1500, 7, true, true));

    }

    public List<DownhillSkiing> getListOfAllDownhillSkiingTours() {
        return listOfAllDownhillSkiingTours;
    }

    public static ListOfAllDownhillSkiingTours getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ListOfAllDownhillSkiingTours{" +
                "listOfAllDownhillSkiingTours=" + listOfAllDownhillSkiingTours +
                '}';
    }
}
