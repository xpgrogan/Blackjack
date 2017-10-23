public class Card
{
    private int cardNumber = 0;
    private char cardSuit = 'x';

	public Card()
    {

    }

    public Card create(int num, char suit)
    {
        cardNumber = num;
        cardSuit = suit;
        return this;
    }

    public int getCardNumber()
    {
        return cardNumber;
    }

    public char getCardSuit()
    {
        return cardSuit;
    }
}