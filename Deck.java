import java.util.ArrayList;
import java.util.List;

public class Deck
{
    public static void main(String[] args)
    {
        Card card = new Card();
        //List<Card> hearts = card.create(2, 'H');
        Card x = new Card();
        x = card.create(2, 'H');
        List<Card> hearts = new ArrayList<>();
        hearts.add(x);
        for(int i = 0; i < hearts.size(); i++)
        {
            System.out.println(hearts.get(i).getCardNumber());
            System.out.println(hearts.get(i).getCardSuit());
        }
    }
}