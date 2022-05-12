package org.example;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list;

    @BeforeEach
    public void setup(){

        list = new ArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        System.out.println(list.size());
    }


    @Test
    public void insertTest() {

        assertEquals(2, list.size(), "List size should be 2");
        list.add("Gama");
        assertEquals(3, list.size(), "List size should be 3");

        assertEquals(list.get(0), "Alpha", "First element should be Alpha");
        assertEquals(list.get(1), "Beta", "First element should be Beta");
        assertEquals(list.get(2), "Gama", "First element should be Gama");
    }

    @Test
    public void replaceTest() {


        assertEquals(2, list.size(), "List size should be 2");
        list.add("Gama");
        assertEquals(3, list.size(), "List size should be 3");

        list.set(0, "FirstValue");

        assertEquals(list.get(0), "FirstValue", "First element should be FirstValue");
        assertEquals(list.get(1), "Beta", "First element should be Beta");
        assertEquals(list.get(2), "Gama", "First element should be Gama");
    }
}
