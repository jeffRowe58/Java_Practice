package cardGames;

public class Card {
    String suit;
    int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;

    }

    public Card(){}
    

    public int getValue(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }
}
