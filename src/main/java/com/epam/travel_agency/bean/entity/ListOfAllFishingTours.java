package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllFishingTours
 *
 * <p>Contains all available tours of type Fishing</p>
 */
public class ListOfAllFishingTours {
    List<Fishing> listOfAllFishingTours = new ArrayList<>();

    private static final ListOfAllFishingTours instance = new ListOfAllFishingTours();

    /**
     * Constructor fill in listOfFishingTours with tours
     */
    private ListOfAllFishingTours() {
        listOfAllFishingTours.add(new Fishing(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(900, 10, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.WINTER));
        listOfAllFishingTours.add(new Fishing(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.WINTER));
        listOfAllFishingTours.add(new Fishing(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1230, 14, 30, "HB", "Bus",
                "Germany", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(680, 7, 30, "RO", "Own car",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.WINTER));
        listOfAllFishingTours.add(new Fishing(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.WINTER));
        listOfAllFishingTours.add(new Fishing(890, 9, 30, "RO", "Bus",
                "Poland", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.SALTY, Season.WINTER));
        listOfAllFishingTours.add(new Fishing(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.SUMMER));
        listOfAllFishingTours.add(new Fishing(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.FISHING,
                TypeOfWaterForFishing.FRESH, Season.WINTER));

    }

    public List<Fishing> getListOfAllFishingTours() {
        return listOfAllFishingTours;
    }

    public static ListOfAllFishingTours getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ListOfAllFishingTours{" +
                "listOfAllFishingTours=" + listOfAllFishingTours +
                '}';
    }

}
