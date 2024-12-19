/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyPattern;

import BuilderPattern.Ticket;

/**
 *
 * @author user
 */
public class TicketBookingProxy implements TicketBookingSystem   {
   private RealTicketBookingSystem realSystem;

    public TicketBookingProxy() {
        this.realSystem = new RealTicketBookingSystem();
    }  


    
    public void bookTicket(Ticket ticket) {
        // Additional access control logic
        System.out.println("Proxy: Checking access before booking ticket.");
        realSystem.bookTicket(ticket);
    }


}
