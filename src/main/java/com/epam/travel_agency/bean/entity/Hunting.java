package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypeOfHunting;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Type of tour Hunting. Extends class Activity
 *
 * <p>Hunting extends abstract class Activity, which extends TravelTour which
 * is a type to all tours</p>
 *
 * <p>Contains variables typeOfHunting, beast, individualHunting. All other
 * variables extended from super class Activity and TravelTour</p>
 *
 * @author Maksim Shaturko
 */
public class Hunting extends Activity {

    private TypeOfHunting typeOfHunting;
    private String beast;
    boolean individualHunting;

    /**
     * Constructor initialize variables typeOfHunting, beast, individualHunting.
     *
     * <p>Other variables initialize in a super class Activity and
     * TravelTour</p>
     *
     * @param price
     * @param durationOfTrip
     * @param insuranceCost
     * @param food              type of food in tour (from listOfFood of
     *                          class Food)
     * @param transport         type of transport in tour (from
     *                          listOfTransport of class Transport)
     * @param country
     * @param typeOfRoom        type of room from enum TypesOfRoom
     * @param typeOfPlacement   type of placement from enum TypesOfPlacement
     * @param typeOfActivity    type of activity from enum TypesOfActivity
     * @param typeOfHunting     type of hunting from enum TypesOfHunting
     * @param beast
     * @param individualHunting
     */
    public Hunting(double price, int durationOfTrip, double insuranceCost,
                   String food, String transport, String country,
                   TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                   TypesOfActivity typeOfActivity, TypeOfHunting typeOfHunting,
                   String beast, boolean individualHunting) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement, typeOfActivity);
        this.typeOfHunting = typeOfHunting;
        this.beast = beast;
        this.individualHunting = individualHunting;
    }

    @Override
    public String toString() {
        return "\n\nHunting{" +
                "[typeOfActivity=" + typeOfActivity +
                "], [typeOfHunting=" + typeOfHunting +
                "], [beast='" + beast + '\'' +
                "], [individualHunting=" + individualHunting +
                "], [price=" + price +
                "], \n[durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
                "], [transport='" + transport + '\'' +
                "], [country='" + country + '\'' +
                "], [typeOfRoom=" + typeOfRoom +
                "], \n[typeOfPlacement=" + typeOfPlacement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hunting hunting = (Hunting) o;
        return individualHunting == hunting.individualHunting
                && typeOfHunting == hunting.typeOfHunting
                && Objects.equals(beast, hunting.beast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfHunting, beast,
                            individualHunting);
    }
}
