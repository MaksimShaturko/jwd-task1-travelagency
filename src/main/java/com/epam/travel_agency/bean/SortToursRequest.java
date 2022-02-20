package com.epam.travel_agency.bean;

import com.epam.travel_agency.bean.entity.TravelTour;

import java.util.List;

/**
 * Class SortToursRequest
 *
 * <p>Simulates user requirements.</p>
 *
 * <p>Gets in the constructor a command (user request) about the desire to
 * sort the list, the list is nedded to sort, and type of sorting</p>  *
 *
 * @author Maksim Shaturko
 */
public class SortToursRequest extends Request{

    private String sortingType;
    private List<?extends TravelTour> sortingList;

    /**
     * Constructor Gets in the constructor a command (user request) about the
     * desire to sort the list, the list is nedded to sort, and type of sorting
     * @param commandName
     * @param sortingList
     * @param sortingType
     */
    public SortToursRequest(String commandName,
                            List<?extends TravelTour> sortingList,
                            String sortingType)
    {
        super(commandName);
        this.sortingType = sortingType;
        this.sortingList = sortingList;
    }

    public String getSortingType() {
        return sortingType;
    }

    public List<? extends TravelTour> getSortingList() {
        return sortingList;
    }
}
