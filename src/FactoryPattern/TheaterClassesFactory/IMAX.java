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
public class IMAX extends Theater {
    @Override
    public void show() {
        System.out.println("Showing in an IMAX theater.");
    }
}
