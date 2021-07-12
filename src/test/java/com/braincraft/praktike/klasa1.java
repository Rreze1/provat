package com.braincraft.praktike;
// summarize of java that I need to know

import java.sql.Connection;
import java.sql.SQLException;

public class Klasa1 {
    public static void main(String[] args) {

       Studenti dardani = new Studenti(2,"Dardan", "Gjoka", "Drenas", 12,true);
        dardani.addToDB();


    }
}



