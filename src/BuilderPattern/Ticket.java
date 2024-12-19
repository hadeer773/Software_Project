/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author user
 */
public class Ticket {
     private String movieName;
    private String theaterType;
    private String genre;
    private String sessionId;
    
        private Ticket(TicketBuilder builder) {
        this.movieName = builder.movieName;
        this.theaterType = builder.theaterType;
        this.genre = builder.genre;
        this.sessionId = builder.sessionId;
    }
        
         public static class TicketBuilder {
        private String movieName;
        private String theaterType;
        private String genre;
        private String sessionId;

        public TicketBuilder setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        public TicketBuilder setTheaterType(String theaterType) {
            this.theaterType = theaterType;
            return this;
        }

        public TicketBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public TicketBuilder setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }

    @Override
    public String toString() {
        return "Ticket [movieName=" + movieName + ", theaterType=" + theaterType + ", genre=" + genre + ", sessionId=" + sessionId + "]";
    }
}
