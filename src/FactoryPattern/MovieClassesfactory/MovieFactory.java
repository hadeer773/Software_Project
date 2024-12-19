/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.MovieClassesfactory;

/**
 *
 * @author user
 */
public class MovieFactory {
    public static Movie createMovie(String genre) {
        switch (genre.toLowerCase()) {
            case "action":
                return new ActionMovie();
            case "comedy":
                return new ComedyMovie();
            case "drama":
                return new DramaMovie();
            default:
                throw new IllegalArgumentException("Unknown genre: " + genre);

        }
    }
}
