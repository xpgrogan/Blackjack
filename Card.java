Public class Card
{
    private final int cardNumber;
    private final char cardSuit;

	public Card()
    {

    }

    public void create(int num, char suit)
    {
        cardNumber = num;
        cardSuit = suit;
    }

    public void getCardNumber()
    {
        return cardNumber;
    }

    public void getCardSuit()
    {
        return cardSuit;
    }
}