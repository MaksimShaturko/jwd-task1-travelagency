package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfTreatment;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllTreatmentTours
 *
 * <p>Contains all available tours of type Treatment</p>
 */
public class ListOfAllTreatmentTours {

    List<Treatment> listOfAllTreatmentTours = new ArrayList<>();

    private static final ListOfAllTreatmentTours instance =
            new ListOfAllTreatmentTours();

    /**
     * Constructor fill in listOfTreatmentTours with tours
     */
    private ListOfAllTreatmentTours() {
        listOfAllTreatmentTours.add(new Treatment(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypeOfTreatment.DENTAL));
        listOfAllTreatmentTours.add(new Treatment(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypeOfTreatment.REHABILITATION));
        listOfAllTreatmentTours.add(new Treatment(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypeOfTreatment.REHABILITATION));
        listOfAllTreatmentTours.add(new Treatment(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypeOfTreatment.DENTAL));
        listOfAllTreatmentTours.add(new Treatment(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypeOfTreatment.REHABILITATION));
        listOfAllTreatmentTours.add(new Treatment(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypeOfTreatment.CHILDBIRTH));
        listOfAllTreatmentTours.add(new Treatment(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypeOfTreatment.CHILDBIRTH));
        listOfAllTreatmentTours.add(new Treatment(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypeOfTreatment.DENTAL));
        listOfAllTreatmentTours.add(new Treatment(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypeOfTreatment.PLASTIC));
        listOfAllTreatmentTours.add(new Treatment(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypeOfTreatment.REHABILITATION));
        listOfAllTreatmentTours.add(new Treatment(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypeOfTreatment.DENTAL));
        listOfAllTreatmentTours.add(new Treatment(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypeOfTreatment.PLASTIC));
        listOfAllTreatmentTours.add(new Treatment(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypeOfTreatment.REHABILITATION));
        listOfAllTreatmentTours.add(new Treatment(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypeOfTreatment.DENTAL));
        listOfAllTreatmentTours.add(new Treatment(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypeOfTreatment.CHILDBIRTH));

    }

    public static ListOfAllTreatmentTours getInstance() {
        return instance;
    }

    public String toString() {
        return listOfAllTreatmentTours.toString();
    }

    public List<Treatment> getListOfAllTreatmentTours() {
        return listOfAllTreatmentTours;
    }
}
