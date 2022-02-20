package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfHunting;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ListOfAllHuntingTours
 *
 * <p>Contains all available tours of type Hunting</p>
 */
public class ListOfAllHuntingTours {
    List<Hunting> listOfAllHuntingTours = new ArrayList<>();

    private static final ListOfAllHuntingTours instance = new ListOfAllHuntingTours();

    /**
     * Constructor fill in listOfHuntingTours with tours
     */
    private ListOfAllHuntingTours() {
        listOfAllHuntingTours.add(new Hunting(2200, 28, 30, "AI", "Fly",
                "Turkey", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Fox", true));
        listOfAllHuntingTours.add(new Hunting(900, 10, 30, "BB", "Minibus",
                "SAR", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.HUNTING,
                TypeOfHunting.FOTO, "Lion", true));
        listOfAllHuntingTours.add(new Hunting(1500, 24, 30, "FB", "Bus",
                "Ukraine", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.HUNTING,
                TypeOfHunting.TRAP, "Rabbit", true));
        listOfAllHuntingTours.add(new Hunting(950, 7, 30, "BB", "Minibus",
                "Belarus", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Lynx", true));
        listOfAllHuntingTours.add(new Hunting(1200, 12, 30, "HB", "Minibus",
                "Belarus", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.HUNTING,
                TypeOfHunting.TRAP, "Fox", true));
        listOfAllHuntingTours.add(new Hunting(1840, 18, 30, "FB", "Fly",
                "Italy", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.FOTO, "Birds", true));
        listOfAllHuntingTours.add(new Hunting(1230, 14, 30, "HB", "Bus",
                "Egypt", TypesOfRoom.SUPERIOR, TypesOfPlacement.TRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.FOTO, "Tiger", true));
        listOfAllHuntingTours.add(new Hunting(680, 7, 30, "RO", "Own car",
                "Kenya", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.HUNTING,
                TypeOfHunting.SAFARI, "Lion", true));
        listOfAllHuntingTours.add(new Hunting(1700, 19, 30, "UAI", "Fly",
                "France", TypesOfRoom.SUPERIOR, TypesOfPlacement.QUADRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Wolf", true));
        listOfAllHuntingTours.add(new Hunting(1720, 18, 30, "FB", "Bus",
                "Romania", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.TRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Deer", true));
        listOfAllHuntingTours.add(new Hunting(1400, 15, 30, "FB", "Own car",
                "Serbia", TypesOfRoom.STUDIO, TypesOfPlacement.DBL, TypesOfActivity.HUNTING,
                TypeOfHunting.TRAP, "Wolf", true));
        listOfAllHuntingTours.add(new Hunting(1000, 8, 30, "BB", "Minibus",
                "Russia", TypesOfRoom.STUDIO, TypesOfPlacement.SINGLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Fox", true));
        listOfAllHuntingTours.add(new Hunting(890, 9, 30, "RO", "Bus",
                "SAR", TypesOfRoom.STANDART, TypesOfPlacement.SINGLE, TypesOfActivity.HUNTING,
                TypeOfHunting.SAFARI, "Leopard", true));
        listOfAllHuntingTours.add(new Hunting(2050, 25, 30, "UAI", "Fly",
                "Czech Republic", TypesOfRoom.FAMILY_ROOM, TypesOfPlacement.QUADRIPLE, TypesOfActivity.HUNTING,
                TypeOfHunting.RIFLE, "Fox", true));
        listOfAllHuntingTours.add(new Hunting(1080, 13, 30, "AI", "Minibus",
                "Austria", TypesOfRoom.STANDART, TypesOfPlacement.DBL, TypesOfActivity.HUNTING,
                TypeOfHunting.FOTO, "Wolf", true));

    }

    public List<Hunting> getListOfAllHuntingTours() {
        return listOfAllHuntingTours;
    }

    public static ListOfAllHuntingTours getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ListOfAllHuntingTours{" +
                "listOfAllHuntingTours=" + listOfAllHuntingTours +
                '}';
    }

}
