package com.kodilla.blackjack;

public class Deck {
    private int numberOfDecks = 1;
    private Card card;

    public Deck(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public Card dealCard() {

        return card;
    }

    public void restoreDeck() {

    }

    public void shuffle() {

    }

    public int getNumberOfCardsRemaining() {
        return 0;
    }

    public int getSizeOfDeck() {
        return 0;
    }
}
