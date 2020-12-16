package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private int numberOfDecks = 1;
    private ArrayList<Card> cards;

    public Deck(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;

        for(int n = 0; n < 4; n++) {
            for (int i = 0; i <= 13; i ++) {
                cards.add(new Card(n, i));
            }
        }
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public void restoreDeck() {

    }

    public void shuffle() {
        Random random = new Random();
        Card temp;
        for(int i=0; i<200; i++)
        {
            int index1 = random.nextInt(cards.size()-1);
            int index2 = random.nextInt(cards.size()-1);
            temp = cards.get(index2);
            cards.set(index2, cards.get(index1));
            cards.set(index1, temp);
        }
    }

    public int getNumberOfCardsRemaining() {
        return cards.size();
    }

    public int getSizeOfDeck() {
        return cards.size();
    }
}
