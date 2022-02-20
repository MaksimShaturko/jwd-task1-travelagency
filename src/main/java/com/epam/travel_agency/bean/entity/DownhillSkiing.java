package com.epam.travel_agency.bean.entity;

import com.epam.travel_agency.bean.entity.auxiliary.TypesOfPlacement;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfRoom;
import com.epam.travel_agency.bean.entity.auxiliary.TypesOfSport;

import java.util.Objects;

/**
 * Type of tour DownhillSkiing extends class Sport
 *
 * <p>DownhillSkiing extends abstract class Sport, which extends
 * TravelTour which is a type to all cruise tours</p>
 *
 * <p>DownhillSkiing inherits variables from super classes Sport and
 * TravelTour</p>
 *
 * <p>Contains variables: altitude, difficultyOfRace,
 * possibilityWithoutTraining, needOfOwnEquipment</p>
  *
 * @author Maksim Shaturko
 */
public class DownhillSkiing extends Sport {
    private int altitude;
    private int difficultyOfRace;
    private boolean possibilityWithoutTraining;
    private boolean needOfOwnEquipment;

    /**
     * Constructor initialize variables altitude, difficultyOfRace,
     *  * possibilityWithoutTraining, needOfOwnEquipment
     *
     * <p>Other variables initialize in a super class Sport and
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
     * @param typeOfSport     type of sport from enum TypesOfSport
     * @param altitude
     * @param difficultyOfRace
     * @param possibilityWithoutTraining
     * @param needOfOwnEquipment
     */
    public DownhillSkiing(double price, int durationOfTrip, double insuranceCost,
                          String food, String transport, String country,
                          TypesOfRoom typeOfRoom,
                          TypesOfPlacement typeOfPlacement,
                          TypesOfSport typeOfSport, int altitude,
                          int difficultyOfRace,
                          boolean possibilityWithoutTraining,
                          boolean needOfOwnEquipment) {
        super(price, durationOfTrip, insuranceCost, food, transport, country,
                typeOfRoom, typeOfPlacement, typeOfSport);
        this.altitude = altitude;
        this.difficultyOfRace = difficultyOfRace;
        this.possibilityWithoutTraining = possibilityWithoutTraining;
        this.needOfOwnEquipment = needOfOwnEquipment;
    }

    @Override
    public String toString() {
        return "\n\nDownhillSkiing{" +
                "[altitude=" + altitude +
                "], [difficultyOfRace=" + difficultyOfRace +
                "], [possibilityWithoutTraining=" + possibilityWithoutTraining +
                "], [needOfOwnEquipment=" + needOfOwnEquipment +
                "], [typeOfActivity=" + typeOfSport +
                "], \n[price=" + price +
                "], [durationOfTrip=" + durationOfTrip +
                "], [insuranceCost=" + insuranceCost +
                "], [food='" + food + '\'' +
                "], [transport='" + transport + '\'' +
                "], [country='" + country + '\'' +
                "], \n[typeOfRoom=" + typeOfRoom +
                "], [typeOfPlacement=" + typeOfPlacement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DownhillSkiing that = (DownhillSkiing) o;
        return altitude == that.altitude
                && difficultyOfRace == that.difficultyOfRace
                && possibilityWithoutTraining == that.possibilityWithoutTraining
                && needOfOwnEquipment == that.needOfOwnEquipment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), altitude, difficultyOfRace,
                            possibilityWithoutTraining, needOfOwnEquipment);
    }
}
