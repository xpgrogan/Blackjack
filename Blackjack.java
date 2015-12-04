import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Blackjack 
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		Scanner scan = new Scanner(System.in);
		int player, dealer;
		String input;
		Boolean isPlaying = true;
		player = deck.pDeal();
		dealer = deck.dDeal();
		
		while(isPlaying == true)
		{
			System.out.println("Would you like to 'hit' or 'stay'?");
			input = scan.nextLine();
			System.out.println("");
			
			if(input.equals("hit"))
			{
				player = deck.pHit(player);
				
				if(player > 21)
				{
					System.out.println("Sorry friend, that's a bust...");
					System.out.println("Dealer wins.....");
					isPlaying = false;
				}
				else if(player == 21)
				{
					System.out.println("BLACKJACK!!! YOU WIN!!!!");
					isPlaying = false;
				}
			}
			else
			{
				System.out.println("Okay, dealer's turn.");
				System.out.println("His hidden card was a " + deck.D1 + ".");
				System.out.println("His total was " + deck.dTotal + ".\n");
				
				while(dealer < 16)
				{
					System.out.println("Dealer chooses to hit.");
					dealer = deck.dHit(dealer);
					
					if(dealer > 21)
					{
						System.out.println("Dealer busts! You win!");
						isPlaying = false;
						System.exit(0);
					}
					else if(dealer == 21)
					{
						System.out.println("Dealer has blackjack... You lose...");
						isPlaying = false;
						System.exit(0);
					}
				}
				
				System.out.println("Dealer stays. \n");
				
				System.out.println("Dealer's total is " + dealer + ".");
				System.out.println("Your total is " + player + ".");
				
				if(player > dealer)
				{
					System.out.println("YOU WIN!!!!!");
					isPlaying = false;
				}
				else if(player == dealer)
				{
					System.out.println("Tie, that means the Dealer wins...");
					isPlaying = false;
				}
				else
				{
					System.out.println("Dealer wins.....");
					isPlaying = false;
				}
			}
		}
	}
}
