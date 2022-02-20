package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfTreatment;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Treatment.
 *
 * <p>Treatment extends TravelTour and this class is a type to all tours</p>
 *
 * <p>It contains the only one variable typeOfTreatment. All other variables
 * extended from super class TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Treatment extends TravelTour {
    TypeOfTreatment typeOfTreatment;

    /**
     * Constructor initialize the only one variable typeOfTreatment.
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
     * @param typeOfTreatment type of treatment from enum TypeOfTreatment
     */
    public Treatment(double price, int durationOfTrip, double insuranceCost,
                     String food, String transport, String country,
                     TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                     TypeOfTreatment typeOfTreatment) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.typeOfTreatment = typeOfTreatment;
    }

    @Override
    public String toString() {
        return "\n\nTreatment{" +
                "[price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
                "], [transport='" + transport + '\'' +
                "], \n[country='" + country + '\'' +
                "], [typeOfRoom=" + typeOfRoom +
                "], [typeOfPlacement=" + typeOfPlacement +
                "], [typeOfTreatment=" + typeOfTreatment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Treatment treatment = (Treatment) o;
        return typeOfTreatment == treatment.typeOfTreatment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfTreatment);
    }
}
