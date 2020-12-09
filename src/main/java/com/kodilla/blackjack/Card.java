package com.kodilla.blackjack;

import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.LinkedList;
import java.util.List;

public class Card {

    //private Image card = new Image();
    private List<Image> cards = new LinkedList<>();

    public Card(ListCell<Image> cards) {
        this.cards = cards;
        cards.add(new Image("file:src/main/resources/Cards/dama_karo.png"));
    }

    public Image getCardImage() {
        ImageView img = new ImageView(card);
        return card;
    }
}
