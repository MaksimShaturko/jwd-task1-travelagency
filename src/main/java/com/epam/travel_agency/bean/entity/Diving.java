package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfDiving;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Diving. Extends class Activity
 *
 * <p>Diving extends abstract class Activity, which extends TravelTour which
 * is a type to all tours</p>
 *
 * <p>Contains the only variable typeOfDiving. All other variables extended
 * from super class Activity and TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Diving extends Activity {
    private TypesOfDiving typeOfDiving;

    /**
     * Constructor initialize variable typeOfDiving.
     *
     * <p>Other variables initialize in a super class Activity and
     * TravelTour</p>
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
     * @param typeOfPlacement type of placement from enum TypesOfPlacement
     * @param typeOfActivity  type of activity from enum TypesOfActivity
     * @param typeOfDiving    type of diving from TypesOfDiving
     */
    public Diving(double price, int durationOfTrip, double insuranceCost,
                  String food, String transport, String country,
                  TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                  TypesOfActivity typeOfActivity, TypesOfDiving typeOfDiving) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement, typeOfActivity);
        this.typeOfDiving = typeOfDiving;
    }

    @Override
    public String toString() {
        return "\n\nDiving{" +
                "[typeOfActivity=" + typeOfActivity +
                "], [typeOfDiving=" + typeOfDiving +
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
        Diving diving = (Diving) o;
        return typeOfDiving == diving.typeOfDiving;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfDiving);
    }
}
