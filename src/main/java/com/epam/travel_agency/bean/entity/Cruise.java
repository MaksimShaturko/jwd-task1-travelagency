package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfCruise;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour cruise.
 *
 * <p>Cruise extends TravelTour and this class is a type to all tours</p>
 *
 * <p>Contains the only variable typeOfCruise. All other variables extended
 * from super class TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Cruise extends TravelTour {
    private TypeOfCruise typeOfCruise;

    /**
     * Constructor initialize variable typeOfCruise.
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
     * @param typeOfCruise    type of cruise from enum TypesOfCruise
     */
    public Cruise(double price, int durationOfTrip, double insuranceCost,
                  String food, String transport, String country,
                  TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                  TypeOfCruise typeOfCruise) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.typeOfCruise = typeOfCruise;
    }

    @Override
    public String toString() {
        return "\n\nCruise{" +
                "[typeOfCruise=" + typeOfCruise +
                "], [price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
                "], \n[transport='" + transport + '\'' +
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
        Cruise cruise = (Cruise) o;
        return typeOfCruise == cruise.typeOfCruise;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfCruise);
    }
}
