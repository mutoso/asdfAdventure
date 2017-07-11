import java.util.Scanner;

//GROUND ARRAY
//3 classes
//10x10 grid map
//randomly generated caves
//enterable towns, possibly randomly generated
//able to move freely within the grid
//able to look around for a fight in fields --> kicking bunnies
//
//PLEASE BE ABLE TO DO THIS:
//>start game
//>sell everything to vendor
//>be naked (certain % to be caught naked in a city)
//>buy 3 fabulous hats with the money you got from selling clothes
//>wear them all at once
//>run out a random field outside of the city, screaming
//>kick a random bunny / wildlife to death
//>run back into city, blood all over
//>get caught by guard
//>currently my #swag is through the roof (high ego)
//>guard lets me off the hook due to my "fabulous hats"
//>fuck a hooker in the local pub to celebrate
//>still naked
//>walk up to king
//>ego is still through the roof
//>King notices my fabulous hats
//>gives me a pair of gold pants
//>even higher ego now
//
//
//
//Normal mode - start game in middle of hamshire, start main quest w/ king
//peasant mode - start as a random peasant who starts in the middle of nowhere and cannot do anything like go to towns because hes a peasant
// and he has to argue his way into the city by the guards and etc
//
//
//Todarac is only guy living in hamshire
//Todarac starts the main quest by greeting you and handing you a letter
//The letter tells you to go to the castle to greet the king
//The king is Todarac
//everyone is Todarac
//Be able to question why he was also the courier
//Explain that he is the only one living in hamshire
//You have to do the main quest to become the first actual citizen of hamshire or something like that
//Quest = 5 chapters total, main goal = assembling the mighty broken sword to then use to slay the stingrarian empire leader, Stinger
//
//
//enchanting +dex and +stam on armor
//be able to stack
//all you need to get is magic essence from monsters in dungeons
//this is the only way to get super good items :-DDDD
//need super good / fast armor to dodge enemies and strike instantly in return
//2 hits in a row
//
//have a system to print a picture of your character next to his stats
//glorious fucking pixel art 1024x1024 picture
//saves as .png :-DD
//
//
//final boss battle = stingar
//the whole game youve been told hes the bad guy
//you finally get to fight him for the glory of the empire
//except, before you attack, you ask what he did to be hated by the empire
//"what? I didnt do anything. He came to our land, flattened everything and stole all our resources"
//"The empire is the evil one. you've just been doing what hes been telling you to. YOURE A TOOL"
//have the option to kill Todarac afterwards
//MORAL CHOICES
//
//
//SAVES = NAME, RACE, CLASS, LEVEL, SAVE SLOT, PLAYER LOCATION, HEALTH (2 ints), MANA (2 ints), ENERGY (2 ints)
//		  STATS (STRENGTH, INTELLECT, STAMINA, DEXTERITY, EGO)
//
//
//
//
//
//sweet talk
//kiss
//rape
//waste paper mode (prints after every action)
//
//
//Animal skin (OF EVERY KIND)
//to do
//write "look arounds" for all locations
//make ALL the items
//work on main quest
public class RPGmain
{
	public static void main(String args[])
	{
		System.out.println("WELCOME TO...");
		System.out.println(" ___    __ _____ _____     ___  _____ __ __ _____ __  __ ____ __ __ _____ _____      /  /");
		System.out.println("||=||  ((  ||  ) ||==     ||=|| ||  ) \\\\ // ||==  ||\\ ||  ||  || || ||_// ||==      '--/");
		System.out.println("|| || \\ )) ||_// ||       || || ||_//  \\V/  ||___ || \\||  ||  \\\\_// || \\\\ ||___       /");
		System.out.println();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gameStart();
	}
	public static void gameStart()
	{
		Player.inMainMenu = true;
		System.out.println("TYPETH WHAT CHOICE THOU WANT TO CHOOSE");
		System.out.println();
		System.out.println("NEW GAME");
		System.out.println("LOAD GAME");
		System.out.println("OPTIONS");
		System.out.println("QUIT");
		System.out.println();
		Action.print("CHOOSE THINE PATH: ");
		Scanner scan = new Scanner(System.in);
		String Choice = scan.nextLine();
		String[] temp;
		String delimiter = " ";
		temp = Choice.split(delimiter);
		if (temp.length == 1)
		{
			if (temp[0].toUpperCase().equals("NEW"))
			{
				Player.inMainMenu = false;
				System.out.println();
				System.out.println("PICK A SAVE SLOT 1 - 5");
				Save.pickSlot();
				characterCreation();
			}
			else if (temp[0].toUpperCase().equals("LOAD"))
			{
				Player.inMainMenu = false;
				Load.pickSlot();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
				
			}
			else if (temp[0].toUpperCase().equals("OPTIONS"))
			{
				Action.options();
				gameStart();
			}
			else if (temp[0].toUpperCase().equals("QUIT"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("THOU ART A PEASANT AND A KNAVE, AND I BID YOU GOOD DAY.");
			}
		}
		if (temp.length == 2)
		{
			if (temp[0].toUpperCase().equals("NEW")&&temp[1].toUpperCase().equals("GAME"))
			{
				Player.inMainMenu = false;
				Save.pickSlot();
				characterCreation();
				try {
					Location.Hamshirevilletowningtonvilleshiretonville();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("GAME"))
			{
				Player.inMainMenu = false;
				Load.pickSlot();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			if (temp[0].toUpperCase().equals("NEW")&&temp[1].toUpperCase().equals("1"))
			{
				System.out.println("THAT DOESNT WORK YET");
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("1"))
			{
				Player.inMainMenu = false;
				Load.slot(1);
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("2"))
			{
				Player.inMainMenu = false;
				Load.slot(2);
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("3"))
			{
				Player.inMainMenu = false;
				Load.slot(3);
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("4"))
			{
				Player.inMainMenu = false;
				Load.slot(4);
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			if (temp[0].toUpperCase().equals("LOAD")&&temp[1].toUpperCase().equals("5"))
			{
				Player.inMainMenu = false;
				Load.slot(5);
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
			else
			{
				System.out.println("LEARN TO PLAY PEASANT.");
			}
		}
	}
	public static void characterCreation()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("AS THOU EMBARK ON THOUEST JOURNEY INTO THE EMPIRE, THOU MUST FIRST CREATE A CHARACTER.");
		System.out.println("WHAT SHALL THINE NAME BE, ADVENTURER?");
		Scanner scan = new Scanner(System.in);
		Player.level = 1;
		Player.isNaked = false;
		System.out.println();
		System.out.print("ENTER THY NAME: ");
		Player.name = scan.nextLine();
		String[] temp;
		String delimiter = " ";
		temp = Player.name.split(delimiter);
		if (temp.length == 1)
		{
			Player.name = temp[0];
			System.out.println();
			System.out.println("NEXT, "+Player.name.toUpperCase()+", THOU MUST CHOOSE A RACE TO ABIDE.");
			System.out.println("EACH RACE HOLDS ITS OWN SPECIALITIES, SO CHOOSE CAREFULLY.");
			System.out.println();
			System.out.println("Human: Medium Health, Medium Mana, High Energy");
			System.out.println("Elf: Low Health, High Mana, High Energy");
			System.out.println("Orc: Very High Health, Low Mana, Medium Energy");
			System.out.println();
			System.out.print("CHOOSE THY RACE: ");
			Player.race = scan.nextLine();
			System.out.println();
			System.out.println("CONTINUING ON, "+Player.race.toUpperCase()+", THE LAST STEP THOU NEEDETH FOR THINE JOURNEY");
			System.out.println("IS PICKING A CLASS TO BE. THOU CAN BE EITHER A WARRIOR, MAGE, OR ROGUE.");
			System.out.println();
			System.out.print("CHOOSE THY CLASS: ");
			Player.Class = scan.nextLine();
			System.out.println();
			System.out.println("ROLL THINE STATS:");
			Player.rollStats();
			System.out.println("Name  - "+Player.name);
			System.out.println("Race  - "+Player.race);
			System.out.println("Class - "+Player.Class);
			System.out.println("IS ALL THIS INFO CORRECT, "+Player.name.toUpperCase()+"? Y/N");
			System.out.print("CHOOSETH: ");
			String choice = scan.nextLine();
			if (choice.toUpperCase().equals("Y"))
			{
				System.out.println();
				System.out.println("So thine name is "+Player.name+", the "+Player.race+" "+Player.Class+"? Good.");
				System.out.println("Thou shall face many hardships on your journey, but persevere and thou shall be greatly rewarded.");
				System.out.println("Thou start thine journey in the town of Hamshirevilletowningtonvilleshiretonville, or, Hamshire.");
				System.out.println("It is located in the heart of the Empire, south of the great sea and west of the endless desert.");
				System.out.println("You start your journey in the center of town, having just arrived from the lands far south to start a journey anew.");
				System.out.println("Alongside you in the center of town is a COURIER. You might want to TALK to him");
				System.out.println("He is looking in your general direction, tapping his foot...Maybe you could go over and TALK to him.");
				System.out.println("Anything past this point is purely up to you, "+Player.name.toUpperCase()+", choose wisely.");
				System.out.println();
				System.out.println("NOOB HINT - Anything in CAPS is usually do-able. I suggest you start by LOOKING AROUND... or maybe HELP..?");
				System.out.println();
				Item.give("Peasant Coif", "An old cloth coif made for PEASANTS and KNAVES", false, 1, 2, 3, 0, 0, 0, 0, -2);
				Item.give("Peasant String Necklace", "A piece of string that PEASANTS and KNAVES call a necklace", false, 1, 3, 1, 0, 0, 0, 0, -1);
				Item.give("Peasant Tunic", "An old tattered tunic typical for PEASANTS and KNAVES", false, 1, 4, 5, 0, 0, 0, 0, -4);
				Item.give("Peasant Belt", "A \"belt\" fashioned out of a piece of rope", false, 1, 5, 3, 0, 0, 0, 0, -1);
				Item.give("Peasant Pantaloons", "An old tattered cloth pant garment made for PEASANTS and KNAVES", false, 1, 6, 4, 0, 0, 0, 0, -4);
				Item.give("Peasant Sandals", "A pair of sandals that PEASANTS and KNAVES do their PEASANT work in", false, 1, 7, 4, 0, 0, 0, 0, -2);
				Item.equip("Peasant Coif");
				Item.equip("Peasant String Necklace");
				Item.equip("Peasant Tunic");
				Item.equip("Peasant Belt");
				Item.equip("Peasant Pantaloons");
				Item.equip("Peasant Sandals");
				try {
					Location.Hamshirevilletowningtonvilleshiretonville();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (choice.toUpperCase().equals("N"))
			{
				characterCreation();
			}
			else
			{
				System.out.println("Nope you messed up...");
				characterCreation();
			}
			
		}
		if (temp.length == 2)
		{
			System.out.println("Wrong syntax. Try: \"<Name> the <Race> <Class>\"");
			System.out.println("Ex: \"Todarac the Human Warrior\"");
			characterCreation();
		}
		if (temp.length == 3)
		{
			System.out.println("Wrong syntax. Try: \"<Name> the <Race> <Class>\"");
			System.out.println("Ex: \"Todarac the Human Warrior\"");
			characterCreation();
		}
		if (temp.length == 4)
		{
			System.out.println("FINALLY SOMEONE WHO KNOWS WHAT THEY'RE DOING");
			System.out.println("HERE, ROLLING STATS...");
			Player.rollStats();
			Player.name = temp[0];
			Player.race = temp[2];
			Player.Class = temp[3];
			System.out.println("Name  - "+Player.name);
			System.out.println("Race  - "+Player.race);
			System.out.println("Class - "+Player.Class);
			System.out.println("IS ALL THIS INFO CORRECT, "+Player.name.toUpperCase()+"? Y/N");
			System.out.print("CHOOSETH: ");
			String choice = scan.nextLine();
			if (choice.toUpperCase().equals("Y"))
			{
				System.out.println();
				System.out.println("Thou shall face many hardships on your journey, but persevere and thou shall be greatly rewarded.");
				System.out.println("Thou start thine journey in the town of Hamshirevilletowningtonvilleshiretonville, or, Hamshire.");
				System.out.println("It is located in the heart of the Empire, north of the great sea and west of the endless desert.");
				System.out.println("You start your journey in the center of town, having just arrived from the lands far south to start a journey anew.");
				System.out.println("Alongside you in the center of town is a COURIER. You might want to TALK to him");
				System.out.println("He is looking in your general direction, tapping his foot...Maybe you could go over and TALK to him.");
				System.out.println("Anything past this point is purely up to you, "+Player.name.toUpperCase()+", choose wisely.");
				System.out.println();
				Item.give("Peasant Coif", "An old cloth coif made for PEASANTS and KNAVES", false, 1, 2, 3, 0, 0, 0, 0, -2);
				Item.give("Peasant String Necklace", "A piece of string that PEASANTS and KNAVES call a necklace", false, 1, 3, 1, 0, 0, 0, 0, -1);
				Item.give("Peasant Tunic", "An old tattered tunic typical for PEASANTS and KNAVES", false, 1, 4, 5, 0, 0, 0, 0, -4);
				Item.give("Peasant Belt", "A \"belt\" fashioned out of a piece of rope", false, 1, 5, 3, 0, 0, 0, 0, -1);
				Item.give("Peasant Pantaloons", "An old tattered cloth pant garment made for PEASANTS and KNAVES", false, 1, 6, 4, 0, 0, 0, 0, -4);
				Item.give("Peasant Sandals", "A pair of sandals that PEASANTS and KNAVES do their PEASANT work in", false, 1, 7, 4, 0, 0, 0, 0, -2);
				Item.equip("Peasant Coif");
				Item.equip("Peasant String Necklace");
				Item.equip("Peasant Tunic");
				Item.equip("Peasant Belt");
				Item.equip("Peasant Pantaloons");
				Item.equip("Peasant Sandals");
				try {
					Location.Hamshirevilletowningtonvilleshiretonville();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (choice.toUpperCase().equals("N"))
			{
				characterCreation();
			}
			else
			{
				System.out.println("Nope you messed up...");
				characterCreation();
			}
		}
		if (temp.length == 5)
		{
			Player.name = temp[0];
			Player.race = temp[2];
			Player.Class = temp[3];
			if (temp[4].toUpperCase().equals("YES"))
			{
				System.out.println("OH SHIT YES SIR");
				Player.checkShit();
				Player.setStats();
			}
			else
			{
				while(true)
				{
					System.out.println("NOW YOU FUCKED UP");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		else
		{
			System.out.println("Nope you messed up...");
			characterCreation();
		}		
	}
}


