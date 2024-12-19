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
public class DramaMovie extends Movie{
    @Override
    public void play() {
        System.out.println("Playing a drama movie.");
    }
}
