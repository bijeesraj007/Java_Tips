package com.braj.examples.methodOnEnumTypes;

public class MovieTicketMain {

    public static void main(String[] args) {
        int comedyMovieprice = MovieTypes.COMEDY.calculatePrice();
        System.out.println("comedyMovieprice = " + comedyMovieprice);

        int adventureMoviePrice = MovieTypes.ADVENTURE.calculatePrice();
        System.out.println("adventureMoviePrice = " + adventureMoviePrice);

    }
}
