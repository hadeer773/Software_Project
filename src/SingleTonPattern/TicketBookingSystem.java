package SingleTonPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

//Singleton pattern 1
public class TicketBookingSystem {
    
    private static TicketBookingSystem instance;
    
        private TicketBookingSystem() {
        // Private constructor to prevent instantiation
    }
    
     public static synchronized TicketBookingSystem getInstance() {
        if (instance == null) {
            instance = new TicketBookingSystem();
        }
        return instance;
    }
     
      public void bookTicket(String movie, String theater) {
        // Logic for booking a ticket
        System.out.println("Ticket booked for " + movie + " at " + theater);
    }
}