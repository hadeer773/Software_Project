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
public class RealTicketBookingSystem implements TicketBookingSystem  {

    public void bookTicket(Ticket ticket) {
        // Logic for booking a ticket
        System.out.println("Ticket booked: " + ticket);
    }
}
