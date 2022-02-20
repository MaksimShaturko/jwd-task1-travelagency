package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfDiving;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllDivingTours
 *
 * <p>Contains all available tours of type Diving</p>
 */
public class ListOfAllDivingTours{

    List<Diving> listOfAllDivingTours = new ArrayList<>();

    private static final ListOfAllDivingTours instance = new ListOfAllDivingTours();

    /**
     * Constructor fill in listOfDivingTours with tours
     */
    private ListOfAllDivingTours() {
        listOfAllDivingTours.add(new Diving(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));
        listOfAllDivingTours.add(new Diving(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));
        listOfAllDivingTours.add(new Diving(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));
        listOfAllDivingTours.add(new Diving(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));
        listOfAllDivingTours.add(new Diving(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));
        listOfAllDivingTours.add(new Diving(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.DIVING,
                TypesOfDiving.EQUIPMENT));
        listOfAllDivingTours.add(new Diving(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.DIVING,
                TypesOfDiving.FREE));

    }

    public List<Diving> getListOfAllDivingTours() {
        return listOfAllDivingTours;
    }

    public static ListOfAllDivingTours getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ListOfAllDivingTours{" +
                "listOfAllDivingTours=" + listOfAllDivingTours +
                '}';
    }
}
