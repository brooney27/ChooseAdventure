import java.util.Scanner;

public class ChooseAdventure {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int choice;
		
		System.out.println("Welcome to Candyland!");
		System.out.println("Would you like to go into:");
		System.out.println("1 - The Gum Drop Forest");
		System.out.println("or 2 - Fudge Castle");
		choice = in.nextInt();
		
		
		//Gum Drop Forest
		if(choice == 1){
			System.out.println("You skip down the path into the Gumdrop Forest");
			System.out.println("The path splits, go down the dark path?");
			System.out.println("You see a red light at far into it's depths");
			System.out.println("1 - Dark Path");
			System.out.println("or 2 - stay on the Lighted path");
			choice = in.nextInt();
			
			//Dark Path
			if(choice == 1){
				System.out.println("You near the red light, it's a gummy bear! Do you:");
				System.out.println("1 - Poke it with a stick");
				System.out.println("or 2 - Run away");
				choice = in.nextInt();
				
				if(choice == 1)System.out.println("The gummy bear bursts into flames, killing you in the process");
				else System.out.println("The gummy bear's natural instincts kick in and he runs you down and kills you");
			}
			
			//Light Path
			else {
				System.out.println("You continue down the lit path and come across a bridge:");
				System.out.println("1 - Cross the Bridge");
				System.out.println("or 2 - Turn back");
				choice = in.nextInt();
				
				if(choice == 1)System.out.println("You step onto the bridge confidently, however half way across the bridge suddenly collapses and you fall to your death");
				else System.out.println("You turn around and are mauled by a scornful gummy bear");
			}
		}
		
		//Fudge Castle
		else{

			System.out.println("You approach the Fudge Castle");
			System.out.println("The bridge across is drawn");
			System.out.println("Do you:");
			System.out.println("1 - Shout for help");
			System.out.println("or 2 - Swim across the moat");
			choice = in.nextInt();
			
			//Shout for help
			if(choice == 1){
				System.out.println("A fudge monkey appears on the battlements.");
				System.out.println("\"Who goes there!\" he cries");
				System.out.println("You reply:");
				System.out.println("1 - A weary traveler looking for shelter");
				System.out.println("or 2 - A heroic adventurer looking for treasures!");
				choice = in.nextInt();
				
				if(choice == 1){
					System.out.println("The monkey eyes you distrustfully but lowers the draw bridge");
					System.out.println("We have no food for you, but you may rest here");
					System.out.println("You lay down to sleep on a bed of marshmallows");
					System.out.println("However, you do not wake up as the Fudge Monkey disembowels you while you sleep");
				}
				
				else{
					System.out.println("The Fudge Monkey flings his fudge poo at you, screams and is not seen again");
					System.out.println("Dejected, you turn around to the sound of giant syrup bees attracted by the fudge poo");
					System.out.println("You die of a thousand stings, syrup oozes from your corpse and you are eaten by cotton candy vultures");
				}
			}
			
			//Swim across the moat
			else {
				System.out.println("You dive into the lemonade moat,");
				System.out.println("You see a ramp leading to a door into the castle and a sewer line leading under the castle");
				System.out.println("1 - Swim toward the ramp");
				System.out.println("or 2 - Swim toward the sewer");
				choice = in.nextInt();
				
				if(choice == 1)System.out.println("You swim toward the ramp, you begin wading to shore\rHowever, before you can reach dry land, you are happened upon by a school of licorice snakes and are devoured");
				
				else {
					System.out.println("You swim toward the sewer and are soon under the castle\rThe current picks up and you are certain you will drown");
					System.out.println("Lemonade begins to fill your lungs, you are swept into a whirlpool and are lost in the blackness");
					
				}
				
			}
			
		}
		
	}
}
