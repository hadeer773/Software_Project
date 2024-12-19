/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.TheaterClassesFactory;

/**
 *
 * @author user
 */
public class TheaterFactory {
    
public static Theater createTheater(String type) {
        switch (type.toLowerCase()) {
            case "cinema hall":
                return new CinemaHall();
            case "imax":
                return new IMAX();
            default:
                throw new IllegalArgumentException("Unknown theater type: " + type);
        }
    }
}