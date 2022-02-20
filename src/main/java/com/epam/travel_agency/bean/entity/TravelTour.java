package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;

import java.util.Objects;

/**
 * Abstract class TravelTour.
 *
 * <p>This class is a super class to all travel tours in this program.
 * Contains variables common for all classes of all kind of tours
 *
 * Contains variables: price, durationOfTrip, insuranceCost, food, transport,
 * country, typeOfRoom, typeOfPlacement;
 *
 * <p>Abstract classes extended class TravelTours:</p>
 * <p>Activity</p>
 * <p>Sport</p>
 *
 * <p>Classes extended class TravelTours directly:</p>*
 * <p>Relax</p>
 * <p>Excursion</p>
 * <p>Treatment</p>
 * <p>Cruise</p>
 *
 * <p>Classes extended class TravelTours through abstract classes Sport,
 * Activity:</p>*
 * <p>DownhillSkiing</p>
 * <p>Rafting</p>
 * <p>Diving</p>
 * <p>Fishing</p>
 * <p>Hunting</p>
 *
 * @author Maksim Shaturko
 */
public abstract class TravelTour {

    protected double price;
    protected int durationOfTrip;
    protected double insuranceCost;
    protected String food;
    protected String transport;
    protected String country;
    protected TypesOfRoom typeOfRoom;
    protected TypesOfPlacement typeOfPlacement;

    /**
     * Constructor initialize variables:
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
     */
    public TravelTour(double price, int durationOfTrip, double insuranceCost,
                      String food, String transport, String country,
                      TypesOfRoom typeOfRoom, TypesOfPlacement typeOfPlacement) {
        this.price = price;
        this.durationOfTrip = durationOfTrip;
        this.insuranceCost = insuranceCost;
        this.food = food;
        this.transport = transport;
        this.country = country;
        this.typeOfRoom = typeOfRoom;
        this.typeOfPlacement = typeOfPlacement;
    }

    public double getPrice() {
        return price;
    }

    public int getDurationOfTrip() {
        return durationOfTrip;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public String getFood() {
        return food;
    }

    public String getTransport() {
        return transport;
    }

    public String getCountry() {
        return country;
    }

    public TypesOfRoom getTypeOfRoom() {
        return typeOfRoom;
    }

    public TypesOfPlacement getTypeOfPlacement() {
        return typeOfPlacement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelTour that = (TravelTour) o;
        return Double.compare(that.price, price) == 0
                && durationOfTrip == that.durationOfTrip
                && Double.compare(that.insuranceCost, insuranceCost) == 0
                && Objects.equals(food, that.food)
                && Objects.equals(transport, that.transport)
                && Objects.equals(country, that.country)
                && typeOfRoom == that.typeOfRoom
                && typeOfPlacement == that.typeOfPlacement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, durationOfTrip, insuranceCost, food,
                            transport, country, typeOfRoom, typeOfPlacement);
    }
}
