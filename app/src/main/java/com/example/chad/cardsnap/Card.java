package com.example.chad.cardsnap;

/**
 * Created by chad on 27/10/2017.
 */

public class Card {

    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return this.rank.getValue();
    }
}
