package com.kodilla.blackjack;

import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.List;


public class Card {

    private int rank;
    private int suit;

    private static String[] ranks = {"as","2","3","4","5","6","7","8","9","10","walet","dama","krol"};
    private static String[] suits = {"karo","kier","pik","trefl"};

    private List<Image> cardsImages = new ArrayList<>();
    private int cardImage =  cardsImages.indexOf(ranks[rank] +"_" + suits[suit]);

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Image getCardImage() {
        Image dama_karo = new Image("file:src/main/resources/Cards/Gify/dama_karo.gif");
        Image dama_kier = new Image("file:src/main/resources/Cards/Gify/dama_kier.gif");
        Image dama_pik = new Image("file:src/main/resources/Cards/Gify/dama_pik.gif");
        Image dama_trefl = new Image("file:src/main/resources/Cards/Gify/dama_trefl.gif");
        cardsImages.add(dama_karo);
        cardsImages.add(dama_kier);
        cardsImages.add(dama_pik);
        cardsImages.add(dama_trefl);

        return cardsImages.get(cardImage);
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }
}
