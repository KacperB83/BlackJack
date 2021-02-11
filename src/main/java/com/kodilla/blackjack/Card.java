package com.kodilla.blackjack;

import javafx.scene.image.Image;

public class Card {

    private int rank;
    private int suit;

    private static String[] ranks = {"as","2","3","4","5","6","7","8","9","10","walet","dama","krol"};
    private static String[] suits = {"karo","kier","pik","trefl"};

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Image getCardImage() {

        Image image = new Image("file:src/main/resources/Cards/Gify/"+ranks[rank] +"_" + suits[suit]+".gif", 150, 225, false, false);

        return image;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }
}
