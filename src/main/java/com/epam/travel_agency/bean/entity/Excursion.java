package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfExcursion;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfExcursionPlace;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Excursion.
 *
 * <p>Excursion extends TravelTour and this class is a type to all tours</p>
 *
 * <p>Contains variables guide, typeOfExcursionPlace, typeOfExcursion. All
 * other variables extended from super class TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Excursion extends TravelTour{
    private boolean guide;
    private TypesOfExcursionPlace typeOfExcursionPlace;
    private TypesOfExcursion typeOfExcursion;

    /**
     * Constructor initialize guide, typeOfExcursionPlace, typeOfExcursion.
     *
     * <p>Other variables initialize in a super class TravelTour</p>
     *
     * @param price
     * @param durationOfTrip
     * @param insuranceCost
     * @param food            type of food in tour (from listOfFood of class
     *                        Food)
     * @param transport       type of transport in tour (from listOfTransport
     *                        of class Transport)
     * @param country
     * @param typeOfRoom      type of room from enum TypesOfRoom
     * @param typeOfPlacement type of placement from enum TypesOPlacement
     * @param guide
     * @param typeOfExcursionPlace type of excursionPlace from enum
     *                             TypesOfExcursionPlace
     * @param typeOfExcursion type of excursion from enum TypesOfExcursion
     */
    public Excursion(double price, int durationOfTrip, double insuranceCost,
                     String food, String transport, String country,
                     TypesOfRoom typeOfRoom,TypesOfPlacement typeOfPlacement,
                     boolean guide, TypesOfExcursionPlace typeOfExcursionPlace,
                     TypesOfExcursion typeOfExcursion) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.guide = guide;
        this.typeOfExcursionPlace = typeOfExcursionPlace;
        this.typeOfExcursion = typeOfExcursion;
    }

    @Override
    public String toString() {
        return "\n\nExcursion { " +
                "[guide=" + guide +
                "], [typeOfExcursionPlace=" + typeOfExcursionPlace +
                "], [typeOfExcursion=" + typeOfExcursion +
                "], [price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], \n[insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
                "], [transport='" + transport + '\'' +
                "], [country='" + country + '\'' +
                "], [typeOfRoom=" + typeOfRoom +
                "], [typeOfPlacement=" + typeOfPlacement +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Excursion excursion = (Excursion) o;
        return guide == excursion.guide
                && typeOfExcursionPlace == excursion.typeOfExcursionPlace
                && typeOfExcursion == excursion.typeOfExcursion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), guide, typeOfExcursionPlace,
                            typeOfExcursion);
    }
}
