package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.HotelLines;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfBeach;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllRelaxTours
 *
 * <p>Contains all available tours of type Relax</p>
 */
public class ListOfAllRelaxTours {
    List<Relax> listOfAllRelaxTours = new ArrayList<>();

    private static final ListOfAllRelaxTours instance = new ListOfAllRelaxTours();

    /**
     * Constructor fill in listOfRaftingTours with tours
     */
    private ListOfAllRelaxTours() {
        listOfAllRelaxTours.add(new Relax(2200, 15, 30, "BB", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfBeach.SAND, HotelLines.FIRST));
        listOfAllRelaxTours.add(new Relax(2000, 12, 22, "AI", "Fly",
                "Turkey", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfBeach.SAND, HotelLines.SECOND));
        listOfAllRelaxTours.add(new Relax(1600, 15, 35, "BB", "Bus",
                "Egypt", TypesOfRoom.STANDART, TypesOfPlacement.TRIPLE, TypesOfBeach.SAND, HotelLines.THIRD));
        listOfAllRelaxTours.add(new Relax(2120, 11, 30, "FB", "Fly",
                "Egypt", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfBeach.SAND, HotelLines.FIRST));
        listOfAllRelaxTours.add(new Relax(2600, 10, 30, "FB", "Bus",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfBeach.SAND, HotelLines.FIRST));
        listOfAllRelaxTours.add(new Relax(800, 7, 20, "RO", "Fly",
                "Bulgaria", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfBeach.SAND, HotelLines.FAR));
        listOfAllRelaxTours.add(new Relax(1680, 21, 45, "RO", "Bus",
                "Turkey", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfBeach.SAND, HotelLines.FAR));
        listOfAllRelaxTours.add(new Relax(1700, 14, 30, "UAI", "Own car",
                "Montenegro", TypesOfRoom.SUPERIOR, TypesOfPlacement.SINGLE, TypesOfBeach.PEBBLE, HotelLines.SECOND));
        listOfAllRelaxTours.add(new Relax(1920, 17, 30, "HB", "Fly",
                "Croatia", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfBeach.PEBBLE, HotelLines.FIRST));
        listOfAllRelaxTours.add(new Relax(2300, 28, 55, "AI", "Fly",
                "Greece", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfBeach.SAND, HotelLines.SECOND));

    }

    public List<Relax> getListOfAllRelaxTours() {
        return listOfAllRelaxTours;
    }

    public static ListOfAllRelaxTours getInstance() {
        return instance;
    }

//    public String toString() {
//        System.out.println("Type of Tour: RELAX:");
//        int i = 1;
//        for (Relax rel : listOfAllRelaxTours) {
//            System.out.println("TOUR №" + i);
//            System.out.println(rel.toString());
//            i++;
//        }
//
//        return "*******************************";
//    }

    @Override
    public String toString() {
        return "ListOfAllRelaxTours{" +
                "listOfAllRelaxTours=" + listOfAllRelaxTours +
                '}';
    }
}
