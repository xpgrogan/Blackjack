import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Deck2
{
		Random rand = new Random();
		int P1, P2, D1, D2, pTotal, dTotal;
		int high = 12;
		int low = 2;
		
		public int pDeal()
		{
			P1 = rand.nextInt(high - low) + low;
			P2 = rand.nextInt(high - low) + low;
			pTotal = P1 + P2;
			System.out.println("You get a " + P1 + " and a " + P2 + ".");
			System.out.println("Your total is " + pTotal + ".\n");
			return pTotal;
		}
		
		public int dDeal()
		{
			D1 = rand.nextInt(high - low) + low;
			D2 = rand.nextInt(high - low) + low;
			dTotal = D1 + D2;
			System.out.println("The dealer has a " + D2 + " and a hidden card.");
			System.out.println("His total is hidden, too.\n");
			return dTotal;
		}
		
		public int pHit(int total)
		{
			pTotal = total;
			int newCard = rand.nextInt(high - low) + low;
			System.out.println("You drew a " + newCard + ".");
			pTotal += newCard;
			System.out.println("Your total is " + pTotal + "\n");
			return pTotal;
		}
		
		public int dHit(int total)
		{
			dTotal = total;
			int newCard = rand.nextInt(high - low) + low;
			System.out.println("He draws a " + newCard + ".");
			dTotal += newCard;
			System.out.println("His total is " + dTotal + "\n");
			return dTotal;
		}
}
