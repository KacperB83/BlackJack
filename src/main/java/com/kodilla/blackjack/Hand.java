package com.kodilla.blackjack;

public class Hand {

    Card card;
    private int value;

    public int evaluateHand() {
        if(card.getRank() > 10) {
            value = 10;
        } else {
            value = card.getRank();
        }
        return value;
    }

    public int getSoft() {
        if(card.getRank() == 1) {
            value = 11;
        }
        return value;
    }

    public void discardHand() {
        return;
    }
}
