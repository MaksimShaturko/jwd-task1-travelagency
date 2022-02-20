package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.HotelLines;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfBeach;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Relax.
 *
 * <p>Relax extends TravelTour and this class is a type to all tours</p>
 *
 * <p>It contains variables typeOfBeach, hotelLine. All other variables
 * extended from super class TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Relax extends TravelTour {
    private TypesOfBeach typeOfBeach;
    private HotelLines hotelLine;

    /**
     * Constructor initialize variables typeOfBeach, hotelLine.
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
     * @param typeOfBeach     type of beach from enum TypesOfBeach
     * @param hotelLine       type of line from enum HotelLine
     */
    public Relax(double price, int durationOfTrip, double insuranceCost,
                 String food, String transport, String country,
                 TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                 TypesOfBeach typeOfBeach, HotelLines hotelLine) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.typeOfBeach = typeOfBeach;
        this.hotelLine = hotelLine;
    }

    @Override
    public String toString() {
        return "\n\nRelax { " +
                "[typeOfBeach=" + typeOfBeach +
                "], [hotelLine=" + hotelLine +
                "], [price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], \n[food='" + food + '\'' +
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
        Relax relax = (Relax) o;
        return typeOfBeach == relax.typeOfBeach && hotelLine == relax.hotelLine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfBeach, hotelLine);
    }
}
