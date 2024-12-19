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
public class PaymentAdapter {
    private ThirdPartyPaymentSystem thirdPartyPaymentSystem;
    
    
    public PaymentAdapter(ThirdPartyPaymentSystem thirdPartyPaymentSystem) {
        this.thirdPartyPaymentSystem = thirdPartyPaymentSystem;
    }

    public void pay(String details) {
        thirdPartyPaymentSystem.makePayment(details);
    }
    
}
