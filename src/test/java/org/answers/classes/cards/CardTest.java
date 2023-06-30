package org.answers.classes.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CardTest {

    Card card;

    @BeforeEach
    void setUp() throws Exception {
        card = new Card(0, 0);
        card.setSuits(1);
        card.setRanks(1);
    }

    @Test
    @DisplayName("Testing switch Ace = 1, returns string 'Ace' ")
    void rankToStringAce() {
        card.rankToString(1);
        assertEquals("Ace", card.rankToString(1));
    }

    @Test
    @DisplayName("Testing switch Deuce = 2, returns string 'Deuce' ")
    void rankToStringDeuce() {
        assertEquals("Deuce", card.rankToString(2));
    }

    @Test
    @DisplayName("Testing switch Three, returns string 'Three' ")
    void rankToStringThree() {
        assertEquals("Three", card.rankToString(3));
    }

    @Test
    @DisplayName("Testing switch Four, returns string 'Four' ")
    void rankToStringFour() {
        assertEquals("Four", card.rankToString(4));
    }

    @Test
    @DisplayName("Testing switch Five, returns string 'Five' ")
    void rankToStringFive() {
        assertEquals("Five", card.rankToString(5));
    }

    @Test
    @DisplayName("Testing switch Six, returns string 'Six' ")
    void rankToStringSix() {
        assertEquals("Six", card.rankToString(6));
    }

    @Test
    @DisplayName("Testing switch Seven, returns string 'Seven' ")
    void rankToStringSeven() {
        assertEquals("Seven", card.rankToString(7));
    }

    @Test
    @DisplayName("Testing switch Eight, returns string 'Eight' ")
    void rankToStringEight() {
        assertEquals("Eight", card.rankToString(8));
    }

    @Test
    @DisplayName("Testing switch Nine, returns string 'Nine' ")
    void rankToStringNine() {
        assertEquals("Nine", card.rankToString(9));
    }

    @Test
    @DisplayName("Testing switch Ten, returns string 'Ten' ")
    void rankToStringTen() {
        assertEquals("Ten", card.rankToString(10));
    }


    @Test
    @DisplayName("Testing switch Jack, returns string 'Jack' ")
    void rankToStringJack() {
        assertEquals("Jack", card.rankToString(11));
    }

    @Test
    @DisplayName("Testing switch Queen, returns string 'Queen' ")
    void rankToStringQueen() {
        assertEquals("Queen", card.rankToString(12));
    }

    @Test
    @DisplayName("Testing switch King, returns string 'King' ")
    void rankToStringKing() {
        assertEquals("King", card.rankToString(13));
    }

    @Test
    @DisplayName("Testing rankToString NULL value, returns NULL ")
    void returnNullIfInputAnyNumber() {
        assertEquals(null, card.rankToString(14));
    }

    // Suits
    @Test
    @DisplayName("Testing Diamond, returns 'Diamond' ")
    void suitToStringDiamond() {
        assertEquals("Diamond", card.suitToString(1));

    }

    @Test
    @DisplayName("Testing Diamond, returns 'Club'")
    void suitToStringClub() {
        assertEquals("Clubs", card.suitToString(2));
    }


    @Test
    @DisplayName("Testing Diamond, returns 'Heart'")
    void suitToStringHeart() {
        assertEquals("Hearts", card.suitToString(3));
    }

    @Test
    @DisplayName("Testing Spade, returns 'Spades' ")
    void suitToStringSpade() {
        assertEquals("Spades", card.suitToString(4));
    }

    @Test
    @DisplayName("Testing suitToString NULL value, returns NULL ")
    void throwsIllegalExceptionIfInputFiveSuitToString() {
        assertEquals(null, card.suitToString(5));
    }


    @Test
    @DisplayName("Test suits getter method")
    void testGetSuits() {
        assertEquals(1, card.getSuits());
    }


    @Test
    @DisplayName("Test ranks getter method")
    void testGetRanks() {
        assertEquals(1, card.getRanks());
    }


    @Test
    @DisplayName("Testing ToString, returns Strings")
    void toStringReturnsAccountDetailsString() throws Exception {

        assertEquals(card.toString(), "CardTest{" +
                "suits=" + card.getSuits() +
                ", ranks=" + card.getRanks() +
                '}');
    }


    @Test
    @DisplayName("Test if valid rank is true")
    void isValidRank() {
        assertEquals(true, card.isValidRank(1));

    }


    @Test
    @DisplayName("Test if valid suit is true")
    void isValidSuit() {
        assertEquals(true, card.isValidSuit(1));
    }

}
