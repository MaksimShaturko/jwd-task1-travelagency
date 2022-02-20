package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfActivity;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Abstract class Activity.
 *
 * <p>This class is a super class to all activity travel tour classes.
 * Existed to divide other classes from classes with active types
 * of rest.
 * Contains the only variable typeOfActivity.
 * Every class extending class Activity is a class of an active type
 * of a tour and contains a common variable typeOfActivity</p>
 *
 * <p>Classes extended class Activity:</p>
 * <p>Diving</p>
 * <p>Fishing</p>
 * <p>Hunting</p>
 *
 * @author Maksim Shaturko
 */
public abstract class Activity extends TravelTour {

    protected TypesOfActivity typeOfActivity;

    /**
     * Constructor initialize variable typeOfActivity.
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
     * @param typeOfPlacement type of placement from enum TypesOfPlacement
     * @param typeOfActivity  type of activity from enum TypesOfActivity
     */
    public Activity(double price, int durationOfTrip, double insuranceCost,
                    String food, String transport, String country,
                    TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                    TypesOfActivity typeOfActivity) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.typeOfActivity = typeOfActivity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Activity activity = (Activity) o;
        return typeOfActivity == activity.typeOfActivity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfActivity);
    }
}
