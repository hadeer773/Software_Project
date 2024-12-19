/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author user
 */
public class ThirdPartyPaymentSystem {
     public void makePayment(String details) {
        System.out.println("Payment made using third-party system: " + details);
    }
}
