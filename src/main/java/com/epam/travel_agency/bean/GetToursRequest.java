package com.epam.travel_agency.bean;

import com.epam.travel_agency.bean.entity.auxiliary.Food;
import com.epam.travel_agency.bean.entity.auxiliary.Transport;
import com.epam.travel_agency.dao.source.ToursProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Class GetToursRequest
 *
 * <p>Simulates user requirements.</p>
 *
 * <p>Gets in the constructor a command (user request) about the desire to
 * receive
 * a list of tours according to its requirements.
 * The requirements are generated in turn:
 * Randomly assigned:
 * - the type of tour that the user wants and write his choice to a file
 * Clients_wishes.txt
 * - the number of types of transport and the selected types are written to
 * the file
 * - the range of the number of days of travel ("from" and "to") is generated
 * and is written to the file
 * - the number of types of food is generated and written to the file.</p>
 *
 * @author Maksim Shaturko
 */
public class GetToursRequest extends Request {

    private int numberOfChosenTypesOfTransport;
    private int numberOfChosenTypesOfFood;

    private String path;
    private File file;

    /**
     * Constructor gets parameter commandName "GET_LIST_OF_REQUIRED_TOURS"
     *
     * <p>Sets the path to file Clients_wishes.txt and then generates
     * requirements randomly in turn:
     * - the type of tour that the user wants and write his choice to a file
     * Clients_wishes.txt
     * - the number of types of transport and the selected types are written to
     * the file
     * - the range of the number of days of travel ("from" and "to") is
     * generated and is written to the file
     * - the number of types of food is generated and written to the file.</p>
     *
     * @param commandName
     * @throws FileNotFoundException
     */
    public GetToursRequest(String commandName) throws FileNotFoundException {
        super(commandName);
        this.path = "D:" + File.separator + "ProjectsJWD" + File.separator +
                "Travel_Agency" + File.separator + "Clients_wishes.txt";
        this.file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        generateTypeOfTour(pw);
        this.numberOfChosenTypesOfTransport =
                generateNumberOfChosenTypesOfTransport(pw);
        generateDaysOfTour(pw);
        this.numberOfChosenTypesOfFood =
                generateNumberOfChosenTypesOfFood(pw);
        pw.close();
    }

    /**
     * Generate the type of tour that the user wants and write his choice to a
     * file Clients_wishes.txt
     *
     * @param pw PrintWriter write to file Clients_wishes.txt
     * @throws FileNotFoundException
     */
    private void generateTypeOfTour(PrintWriter pw) throws FileNotFoundException {
        Random random = new Random();

        // Generate random number from 0 to number of tours to choose which
        // tour write to file
        int index = random.nextInt(ToursProvider.getInstance()
                                                .getListOfTypes()
                                                .size());
        System.out.println("Index = " + index);

        // Write type of tour to file
        pw.println(ToursProvider.getInstance()
                                .getListOfTypes()
                                .get(index));

        System.out.println(ToursProvider.getInstance()
                                        .getListOfTypes()
                                        .get(index));
    }

    /**
     * Generate the number of types of transport and, the selected types write
     * to the file and the chosen number return for using when we want to get
     * this number for reading and forming list of requirements tours
     * in class GetListOfTours
     *
     * @param pw PrintWriter write to file Clients_wishes.txt
     * @return numberOfTypesOfTransport
     * @throws FileNotFoundException
     */
    private int generateNumberOfChosenTypesOfTransport(PrintWriter pw) throws FileNotFoundException {
        Random random = new Random();
        int numberOfTypesOfTransport;

        /* Getting a number of transport types
        (equal getListOfTransport().size() + 1)
         */
        numberOfTypesOfTransport = random.nextInt(Transport
                .getInstance()
                .getListOfTransport()
                .size()) + 1;

        // Writing to file types of chosen Transport
        for (int i = 0; i < numberOfTypesOfTransport; i++) {
            pw.println(Transport.getInstance()
                                .getListOfTransport()
                                .get(i));
        }

        return numberOfTypesOfTransport;
    }

    /**
     * Generate number of days of travelling ("from", "to") and write to File
     * @param pw PrintWriter write to file Clients_wishes.txt
     * @throws FileNotFoundException
     */
    private void generateDaysOfTour(PrintWriter pw) throws FileNotFoundException {
        Random random = new Random();

        // Write to the file number of days "from" (number from 3 to 10)
        pw.println(random.nextInt(8) + 3);

        // Write to the file number of days "to" (number from 11 to 30)
        pw.println(random.nextInt(20) + 11);
    }

    /**
     * Generate the number of types of food, the selected types write
     * to the file and the chosen number return for using when we want to get
     * this number for reading and forming list of requirements tours in
     * class GetListOfTours
     *
     * @param pw PrintWriter write to file Clients_wishes.txt
     * @return numberOfTypesOfFood
     * @throws FileNotFoundException
     */
    private int generateNumberOfChosenTypesOfFood(PrintWriter pw) throws FileNotFoundException {
        int numberOfTypesOfFood;
        Random random = new Random();

        // Determine randomly how many types user choose
        numberOfTypesOfFood = random.nextInt(Food.getInstance()
                                                        .getListOfFood()
                                                        .size() + 1);

        // Write to file all chosen types
        for (int i = 0; i < numberOfTypesOfFood; i++) {
            pw.println(Food.getInstance()
                           .getListOfFood()
                           .get(i));
        }

        return numberOfTypesOfFood;
    }

    public String getPath() {
        return path;
    }

    public int getNumberOfChosenTypesOfTransport() {
        return numberOfChosenTypesOfTransport;
    }

    public int getNumberOfChosenTypesOfFood() {
        return numberOfChosenTypesOfFood;
    }
}
