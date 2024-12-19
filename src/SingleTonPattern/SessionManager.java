/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTonPattern;

/**
 *
 * @author user
 */
public class SessionManager {
  private static SessionManager instance;

    private SessionManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void manageSession(String sessionId) {
        // Logic for managing session
        System.out.println("Managing session: " + sessionId);
    }
}   

