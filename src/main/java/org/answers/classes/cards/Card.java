package org.answers.classes.cards;

public class Card {

    private int suits;
    private int ranks;

    public Card(int suits, int ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }

    public int getSuits() {
        return suits;
    }

    public void setSuits(int suits) {
        this.suits = suits;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public boolean isValidRank(int rank) {
        return ACE <= rank && rank <= KING;
    }

    public boolean isValidSuit(int suit) {
        return DIAMOND <= suit && suit <= SPADE;
    }

    // suits
    private static final int DIAMOND = 1;
    private static final int CLUBS = 2;
    private static final int HEARTS = 3;
    private static final int SPADE = 4;

    //ranks

    private static final int ACE = 1;
    private static final int DEUCE = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;


    public String suitToString(int suits) {
        switch (suits) {
            case DIAMOND:
                return "Diamond";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            case SPADE:
                return "Spades";
            default:
                return null;
        }
    }

    public String rankToString(int ranks) {
        switch (ranks) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "CardTest{" +
                "suits=" + suits +
                ", ranks=" + ranks +
                '}';
    }
}
