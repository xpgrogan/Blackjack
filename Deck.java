Public class Deck
{
    Card card;
    List<Card> hearts = <card.create(2, H)>;
    public static void main(String[] args)
    {
        for(int i = 0; i < hearts.length(); i++)
        {
            System.out.println(hearts[i].getCardNumber());
            System.out.println(hearts[i].getCardSuit());
        }
    }
}