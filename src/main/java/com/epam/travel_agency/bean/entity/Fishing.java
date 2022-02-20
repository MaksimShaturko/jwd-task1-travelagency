package com.epam.travel_agency.bean.entity;


import com.epam.travel_agency.bean.entity.auxiliary.Season;
import com.epam.travel_agency.bean.entity.auxiliary.TypeOfWaterForFishing;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Fishing. Extends class Activity
 *
 * <p>Fishing extends abstract class Activity, which extends TravelTour which
 * is a type to all tours</p>
 *
 * <p>Contains variables typeOfWaterForFishing and season. All other variables
 * extended from super class Activity and TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Fishing extends Activity {

    private TypeOfWaterForFishing typeOfWaterForFishing;
    private Season season;

    /**
     * Constructor initialize variable typeOfWaterForFishing and season.
     *
     * <p>Other variables initialize in a super class Activity and
     * TravelTour</p>
     *
     * @param price
     * @param durationOfTrip
     * @param insuranceCost
     * @param food                  type of food in tour (from listOfFood of
     *                              class Food)
     * @param transport             type of transport in tour (from
     *                              listOfTransport of class Transport)
     * @param country
     * @param typeOfRoom            type of room from enum TypesOfRoom
     * @param typeOfPlacement       type of placement from enum TypesOfPlacement
     * @param typeOfActivity        type of activity from enum TypesOfActivity
     * @param typeOfWaterForFishing type of waterForFishing from
     *                              TypeOfWaterForFishing
     * @param season                type of season from enum Season
     */
    public Fishing(double price, int durationOfTrip, double insuranceCost,
                   String food, String transport, String country,
                   TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                   TypesOfActivity typeOfActivity,
                   TypeOfWaterForFishing typeOfWaterForFishing, Season season) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement, typeOfActivity);
        this.typeOfWaterForFishing = typeOfWaterForFishing;
        this.season = season;
    }

    @Override
    public String toString() {
        return "\n\nFishing{" +
                "[typeOfActivity=" + typeOfActivity +
                "], [typeOfWaterForFishing=" + typeOfWaterForFishing +
                "], [season=" + season +
                "], [price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], \n[insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
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
        Fishing fishing = (Fishing) o;
        return typeOfWaterForFishing == fishing.typeOfWaterForFishing
                && season == fishing.season;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfWaterForFishing, season);
    }
}
