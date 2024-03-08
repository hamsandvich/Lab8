package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    // In CustomListTest.java
    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        list.addCity(new City("Saskatoon", "SK"));
        assertTrue(list.hasCity("Saskatoon"));
    }
    // In CustomListTest.java
    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        list.addCity(new City("Regina", "SK"));
        assertTrue(list.hasCity("Regina"));
        list.deleteCity("Regina");
        assertFalse(list.hasCity("Regina"));
    }
    // In CustomListTest.java
    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount());
        list.addCity(new City("Moose Jaw", "SK"));
        assertEquals(1, list.getCount());
    }



}
