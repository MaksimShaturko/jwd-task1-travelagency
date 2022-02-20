package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfSport;

import java.util.Objects;

/**
 * Type of tour Rafting extends class Sport
 *
 * <p>Rafting extends abstract class Sport, which extends TravelTour which is
 * a type to all cruise tours</p>
 *
 * <p>Rafting inherits variables from super classes Sport and TravelTour</p>
 *
 * <p>Contains the only one variable difficultyOfRiverTiding</p>
 *
 * @author Maksim Shaturko
 */
public class Rafting extends Sport {
    private int difficultyOfRiverTiding;

    /**
     * Constructor initialize the only one variable difficultyOfRiverTiding
     *
     * <p>Other variables initialize in a super class Sport and TravelTour</p>
     *
     * @param price
     * @param durationOfTrip
     * @param insuranceCost
     * @param food                    type of food in tour (from listOfFood of
     *                                class Food)
     * @param transport               type of transport in tour (from
     *                                listOfTransport of class Transport)
     * @param country
     * @param typeOfRoom              type of room from enum TypesOfRoom
     * @param typeOfPlacement         type of placement from enum
     *                                TypesOfPlacement
     * @param typeOfSport             type of sport from enum TypesOfSport
     * @param difficultyOfRiverTiding
     */
    public Rafting(double price, int durationOfTrip, double insuranceCost,
                   String food, String transport, String country,
                   TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                   TypesOfSport typeOfSport, int difficultyOfRiverTiding) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement, typeOfSport);
        this.difficultyOfRiverTiding = difficultyOfRiverTiding;
    }

    @Override
    public String toString() {
        return "\n\nRafting{" +
                "[difficultyOfRiverTiding=" + difficultyOfRiverTiding +
                "], [typeOfActivity=" + typeOfSport +
                "], [price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], \n[food='" + food + '\'' +
                "], [transport='" + transport + '\'' +
                "], [country='" + country + '\'' +
                "], [typeOfRoom=" + typeOfRoom +
                "], [typeOfPlacement=" + typeOfPlacement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rafting rafting = (Rafting) o;
        return difficultyOfRiverTiding == rafting.difficultyOfRiverTiding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), difficultyOfRiverTiding);
    }
}
