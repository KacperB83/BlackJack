package com.kodilla.blackjack;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;
    private int index;

    public Deck(int numberOfDecks) {
        deck = new ArrayList<>();
        index = 0;

        for(int d = 0; d < numberOfDecks; d++) {
            for (int n = 0; n < 4; n++) {
                for (int i = 0; i < 13; i++) {
                    Card card = new Card(n, i);
                    addCard(card);
                }
            }
        }
        shuffle();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public int getSizeOfDeck() {
        return deck.size();
    }
    public int getNumberOfCardsRemaining() {
        return deck.size() - index;
    }

    public Card dealCard() {
        if (index >= deck.size()) {
            return null;
        } else {
            return deck.get(index++);
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    public void restoreDeck() {
        index = 0;
    }
}
