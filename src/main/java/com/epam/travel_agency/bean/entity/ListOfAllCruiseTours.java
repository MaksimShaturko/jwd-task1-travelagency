package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfCruise;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;


/**
 * Class ListOfAllCruiseTours
 *
 * <p>Contains all available tours of type Cruise</p>
 */
public class ListOfAllCruiseTours {

    List<Cruise> listOfAllCruiseTours = new ArrayList<>();

    private static final ListOfAllCruiseTours instance =
            new ListOfAllCruiseTours();

    /**
     * Constructor fill in listOfCruiseTours with tours
     */
    private ListOfAllCruiseTours() {
        listOfAllCruiseTours.add(new Cruise(2200, 28,
                30, "AI", "Fly","Turkey",
                TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE,
                TypeOfCruise.COASTAL));
        listOfAllCruiseTours.add(new Cruise(900, 10,
                30, "BB", "Minibus","Russia",
                TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE,
                TypeOfCruise.INLAND));
        listOfAllCruiseTours.add(new Cruise(1500, 24,
                30, "FB", "Bus","Ukraine",
                TypesOfRoom.STANDART, TypesOfPlacement.DBL,
                TypeOfCruise.COASTAL));
        listOfAllCruiseTours.add(new Cruise(950, 7,
                30, "BB", "Minibus","Belarus",
                TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE,
                TypeOfCruise.INLAND));
        listOfAllCruiseTours.add(new Cruise(1200, 12,
                30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL,
                TypeOfCruise.EXPEDITIONARY));
        listOfAllCruiseTours.add(new Cruise(1840, 18,
                30, "FB", "Fly","Italy",
                TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE,
                TypeOfCruise.COASTAL));
        listOfAllCruiseTours.add(new Cruise(1230, 14,
                30, "HB", "Bus","Germany",
                TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE,
                TypeOfCruise.TRANSATLANTIC));
        listOfAllCruiseTours.add(new Cruise(680, 7,
                30, "RO", "Own car","Belarus",
                TypesOfRoom.STANDART, TypesOfPlacement.SINGLE,
                TypeOfCruise.INLAND));
        listOfAllCruiseTours.add(new Cruise(1700, 19,
                30, "UAI", "Fly","France",
                TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE,
                TypeOfCruise.TRANSATLANTIC));
        listOfAllCruiseTours.add(new Cruise(1720, 18,
                30, "FB", "Bus","Romania",
                TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE,
                TypeOfCruise.COASTAL));
        listOfAllCruiseTours.add(new Cruise(1400, 15,
                30, "FB", "Own car","Serbia",
                TypesOfRoom.STUDIO, TypesOfPlacement.DBL,
                TypeOfCruise.INLAND));
        listOfAllCruiseTours.add(new Cruise(1000, 8,
                30, "BB", "Minibus","Russia",
                TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE,
                TypeOfCruise.COASTAL));
        listOfAllCruiseTours.add(new Cruise(890, 9,
                30, "RO", "Bus","Poland",
                TypesOfRoom.STANDART, TypesOfPlacement.SINGLE,
                TypeOfCruise.TRANSATLANTIC));
        listOfAllCruiseTours.add(new Cruise(2050, 25,
                30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM,
                TypesOfPlacement.QUADRIPLE, TypeOfCruise.INLAND));
        listOfAllCruiseTours.add(new Cruise(1080, 13,
                30, "AI", "Minibus","Austria",
                TypesOfRoom.STANDART, TypesOfPlacement.DBL,
                TypeOfCruise.EXPEDITIONARY));
    }

    public static ListOfAllCruiseTours getInstance() {
        return instance;
    }

    public String toString() {
        return listOfAllCruiseTours.toString();
    }

    public List<Cruise> getListOfAllCruiseTours() {
        return listOfAllCruiseTours;
    }
}
