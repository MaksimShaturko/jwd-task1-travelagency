package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfSport;

import java.util.Objects;

/**
 * Abstract class Sport.
 *
 * <p>This class is a super class to all sport travel tour classes.
 * Existed to divide other classes from classes with sport types
 * of rest.
 * Contains the only variable typeOfSport.
 * Every class extending class Sport is a class of an active type
 * of a tour and contains a common variable typeOfSport</p>
 *
 * <p>Classes extended class Sport:</p>
 * <p>DownhillSkiing</p>
 * <p>Rafting</p> *
 *
 * @author Maksim Shaturko
 */
public abstract class Sport extends TravelTour {
    protected TypesOfSport typeOfSport;

    /**
     * Constructor initialize variable typeOfSport.
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
     * @param typeOfSport     type of activity from enum TypesOfActivity
     */
    public Sport(double price, int durationOfTrip, double insuranceCost,
                 String food, String transport, String country,
                 TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement,
                 TypesOfSport typeOfSport) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement);
        this.typeOfSport = typeOfSport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sport sport = (Sport) o;
        return typeOfSport == sport.typeOfSport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfSport);
    }
}
