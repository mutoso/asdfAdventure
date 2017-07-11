import java.util.Scanner;

public class Location 
{
	//save
	//load
	//die
	//stats
	//level up
	//inventory
	//give
	//quit
	//Walk out gates
	//Look around
	//go to castle
	//go to tavern
	//go to inn
	//admire town
	//punch citizen
	//punch self (done)
	//scream loudly
	//nail bunnies to trees
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
	//Animal skin (OF EVERY KIND)
	//
	//
	//
	//GROUND ARRAY
	//SAVES = NAME, RACE, CLASS, LEVEL, SAVE SLOT, PLAYER LOCATION, HEALTH (2 ints), MANA (2 ints), ENERGY (2 ints)
	//		  STATS (STRENGTH, INTELLECT, STAMINA, DEXTERITY, EGO)
	//
	//
	//
	//add The Nether (OC DO NOT STEAL)
	//its a 2x2 square of grid
	//connects the 4 main towns
	//
	//
	//
	//
	//
	//
	//
	//
	//String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int ITEMCOST, int STRENGTH, 
	//int INT, int STAM, int DEX, int DUKE, int SLOTX, int SLOTY
	
	public static void Hamshirevilletowningtonvilleshiretonville() throws InterruptedException
	{
		Player.location = "Hamshirevilletowningtonvilleshiretonville";
		Player.inHamshire = true;
		String nakedText = "";
		String yep = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		if (Player.name.toUpperCase().equals("TODARAC"))
		{
			yep = " You own this place :D.";
		}
		System.out.println("Thou art in Hamshirevilletowningtonvilleshiretonville."+nakedText+yep);
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String ultimateChoice = scan.nextLine();
		Action.defaultActions(ultimateChoice);
		Action.locationChanges(ultimateChoice);
		if (ultimateChoice.toUpperCase().equals("TALK TO COURIER")||ultimateChoice.toUpperCase().equals("COURIER")||ultimateChoice.toUpperCase().equals("WALK TO COURIER"))
		{
			if (Quest.mainQuestPrologue == false)
			{
				Quest.mainQuestPrologue();
			}
			if (Quest.mainQuestPrologue == true)
			{
				System.out.println();
				System.out.println("The COURIER hath left. Thou just missed him.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (ultimateChoice.toUpperCase().equals("LOOK")||ultimateChoice.toUpperCase().equals("LOOK AROUND"))
		{
			Text.cityLookArounds();
		}
		if (ultimateChoice.toUpperCase().equals("READ PAPER")||ultimateChoice.toUpperCase().equals("LOOK AT PAPER")||ultimateChoice.toUpperCase().equals("TAX QUIRY")||ultimateChoice.toUpperCase().equals("READ TAX QUIRY"))
		{
			if (Item.search("TAX QUIRY") != null)
			{
				System.out.println();
				System.out.println("Thou looketh at the PAPER titled \"TODARIAN TAX QUIRY 001\"...");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (Item.search("TAX QUIRY") == null)
			{
				System.out.println();
				System.out.println("Thou cannot read the PAPER because thou hath possesseth it not.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (ultimateChoice.toUpperCase().equals("PICK")||ultimateChoice.toUpperCase().equals("PAPER")||ultimateChoice.toUpperCase().equals("PICK UP")||ultimateChoice.toUpperCase().equals("PICK UP PAPER"))
		{
			if (Player.paperOnGround == true)
			{
				System.out.println();
				System.out.println("Thou walketh over to the PAPER on the ground and pick it up...");
				Item.give("TAX QUIRY", "TODARIAN TAX QUIRY 001", false,0, 0, 0, 0, 0, 0, 0, 0);
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (Player.paperOnGround == false)
			{
				System.out.println();
				System.out.println("...But there is no PAPER on the ground for which to pick up!");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (ultimateChoice.toUpperCase().equals("ADMIRE")||ultimateChoice.toUpperCase().equals("ADMIRE TOWN"))
		{
			System.out.println();
			System.out.println("Looking around with observational eyes, thou start to appreciate the intrinsic beauty of");
			System.out.println("Hamshirevilletowningtonvilleshiretonville, including he building layout, the differing");
			System.out.println("city height and even the Todarian architectural style of the entire town.");
			System.out.println("But, thou can't help but shake the odd feeling that no one is here in town at all. NO ONE.");
			System.out.println("Other than the COURIER, you are completly alone here.");
			System.out.println("Thou sit there for a minute though, hand on chin, deeply admiring the town...");
			System.out.println("After an intense session of admiring, thou return back to the town square.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (ultimateChoice.toUpperCase().equals("LEVEL UP"))
		{
			Player.levelUp();
			Action.gotoLocation(Player.location);
		}
		if (ultimateChoice.toUpperCase().equals("FIGHT"))
		{
			Enemy.Peasant();
			Fight.doFight();
			Action.gotoLocation(Player.location);
		}
		if (ultimateChoice.toUpperCase().equals("ACCEPT QUEST"))
		{
			System.out.println();
			System.out.println("Thou metaphorically accept the COURIER'S quest.");
			System.out.println("Thou didn't really need to do that, but thanks anyways.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (ultimateChoice.toUpperCase().equals("PUNCH PEASANT")||ultimateChoice.toUpperCase().equals("FIGHT PEASANT")||ultimateChoice.toUpperCase().equals("FP"))
		{
			System.out.println();
			Action.punchPeasant();
		}
		if (ultimateChoice.toUpperCase().equals("PUNCH"))
		{
			System.out.println("PUNCH WHO?");
			System.out.println();
			System.out.println("THINESELF");
			System.out.println("RANDOM PEASANT");
			System.out.println("NEITHER");
			System.out.println();
			System.out.print("CHOOSETH: ");
			String punchChoice = scan.nextLine();
			if (punchChoice.toUpperCase().equals("THINESELF"))
			{
				Action.punchSelf();
			}
			if (punchChoice.toUpperCase().equals("PEASANT")||punchChoice.toUpperCase().equals("RANDOM PEASANT")||punchChoice.toUpperCase().equals("RANDOM"))
			{
				Action.punchPeasant();
			}
			if (punchChoice.toUpperCase().equals("NEITHER"))
			{
				System.out.println("Oh well okay then.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (ultimateChoice.toUpperCase().equals("LEAVE")||ultimateChoice.toUpperCase().equals("WALK OUT GATES")||ultimateChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("Thou cant leave town from here. Go to the GATES.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireTavern() //work on
	{
		Player.location = "Tavern";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art in the Tavern."+nakedText);
		System.out.println();
		System.out.println("TALK TO BARTENDER");
		System.out.println("LEAVE");
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String tavernChoice = scan.nextLine();
		Action.defaultActions(tavernChoice);
		Action.locationChanges(tavernChoice);
		if (tavernChoice.toUpperCase().equals("TALK")||tavernChoice.toUpperCase().equals("TALK TO BARTENDER"))
		{
			
		}
		if (tavernChoice.toUpperCase().equals("LEAVE")||tavernChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			try {
				Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireInn() //make innkeeper react differently to naked
	{
		Player.location = "Inn";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art in the Inn."+nakedText);
		System.out.println();
		System.out.println("TALK TO INNKEEPER");
		System.out.println("LEAVE");
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String innChoice = scan.nextLine();
		Action.defaultActions(innChoice);
		Action.locationChanges(innChoice);
		if (innChoice.toUpperCase().equals("LEAVE")||innChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			try {
				Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (innChoice.toUpperCase().equals("TALK")||innChoice.toUpperCase().equals("TALK TO INNKEEPER"))
		{
			System.out.println();
			System.out.println("Thou start to converse with the INNKEEPER...");
			System.out.println("\"Would thou liketh to stay the night at this INN?\"");
			System.out.println("\"The rent is only 10 gold per night.\" asks the INKEEPER...");
			System.out.println();
			System.out.println("YES");
			System.out.println("NO");
			System.out.println();
			System.out.print("CHOOSETH: ");
			String innkeeperChoice = scan.nextLine();
			if (innkeeperChoice.toUpperCase().equals("YES"))
			{
				if (Player.Gold >= 10)
				{
					System.out.println();
					System.out.println("Thou make thine way upstairs to the rooms, where you comfily spend the night...");
					System.out.println("After a good nights sleep, thou wakest up and continue thine adventure.");
					System.out.println("Thine health, mana, and energy hath been replenished!");
					Player.healthNow = Player.healthMax;
					Player.manaNow = Player.manaMax;
					Player.energyNow = Player.energyMax;
					Player.Gold -= 10;
					Action.gotoLocation(Player.location);
				}
				else
				{
					System.out.println();
					System.out.println("The INNKEEPER just stares at thou for 10 seconds with the widest, scariest eyes imagineable.");
					System.out.println("The look of murder, hate, and disgust fill his eyes. He screams 'THOU HATH NOT ENOUGH GOLD! GET OUT OF MY SIGHT!'");
					System.out.println("You slowly walk backwards, away from the INNKEEPER...");
					Action.gotoLocation(Player.location);
				}
			}
			if (innkeeperChoice.toUpperCase().equals("NO"))
			{
				System.out.println();
				System.out.println("The INNKEEPER just stares at thou for 10 seconds with the widest, scariest eyes imagineable.");
				System.out.println("You slowly walk backwards, away from the INNKEEPER...");
				Action.gotoLocation(Player.location);
			}
			else
			{
				System.out.println();
				System.out.println("The INNKEEPER has no idea what thou are saying and just glares at you.");
				System.out.println("You slowly walk backwards, away from the INNKEEPER...");
				Action.gotoLocation(Player.location);
			}
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireStore()
	{
		//add a chest and lever
		//(see the lookaround for it)
		//
		Player.location = "Store";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art in the Store."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String storeChoice = scan.nextLine();
		Action.defaultActions(storeChoice);
		Action.locationChanges(storeChoice);
		if (storeChoice.toUpperCase().equals("LEAVE")||storeChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			try {
				Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (storeChoice.toUpperCase().equals("TALK")||storeChoice.toUpperCase().equals("TALK TO SHOPKEEPER"))
		{
			System.out.println("Thou walk up to the SHOPKEEPER and start to converse...");
			System.out.println();
			System.out.println();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireUpperCity() 
	{
		Player.location = "Upper City";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art in the Upper City."+nakedText);
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String upperCityChoice = scan.nextLine();
		Action.defaultActions(upperCityChoice);
		Action.locationChanges(upperCityChoice);
		if (upperCityChoice.toUpperCase().equals("LEAVE")||upperCityChoice.toUpperCase().equals("WALK OUT GATES")||upperCityChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("Thou cant leave town from here. Go to the GATES.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireEmptyBuilding()
	{
		Player.location = "Empty Building";
		String nakedText = "";
		String dwellerText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		if (Player.foundDweller == true && Player.dwellerFled == false)
		{
			dwellerText = " The DWELLER stands in the corner. WAITING.";
		}
		if (Player.foundDweller == true && Player.dwellerFled == true)
		{
			dwellerText = " The DWELLER is nowhere to be found...";
		}
		System.out.println("Thou art in the Empty Building."+nakedText+dwellerText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String emptyBuildingChoice = scan.nextLine();
		Action.defaultActions(emptyBuildingChoice);
		Action.locationChanges(emptyBuildingChoice);
		if (emptyBuildingChoice.toUpperCase().equals("CALL") && Player.dwellerFled == false||emptyBuildingChoice.toUpperCase().equals("CALL OUT") && Player.dwellerFled == false)
		{
			Player.foundDweller = true;
			System.out.println();
			System.out.println("Thou shoutest out into the blackness...");
			System.out.println("\"HEY! IS THERE ANYONE THERE?\" Thou yellest loudly.");
			System.out.println("There is a pause...");
			System.out.println("\"...NO.\" the DWELLER yells back.");
			System.out.println("Maybe you should APPROACH him? Or not. He could be dangerous...");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (emptyBuildingChoice.toUpperCase().equals("CALL") && Player.dwellerFled == true||emptyBuildingChoice.toUpperCase().equals("CALL OUT") && Player.dwellerFled == true)
		{
			Player.foundDweller = true;
			System.out.println();
			System.out.println("Thou shoutest out into the blackness...");
			System.out.println("\"HEY! IS THERE ANYONE THERE?\" Thou yellest loudly.");
			System.out.println("There is a pause...");
			Action.wait(1);
			System.out.println("Nothing...");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (emptyBuildingChoice.toUpperCase().equals("APPROACH")&& Player.dwellerFled == false ||emptyBuildingChoice.toUpperCase().equals("APPROACH DWELLER")&& Player.dwellerFled == false ||emptyBuildingChoice.toUpperCase().equals("DWELLER")&& Player.dwellerFled == false)
		{
			System.out.println();
			System.out.println("Thou approacheth the man in the corner of the dark room...");
			System.out.println("\"HALT\" he quickly shouts!");
			System.out.println("\"Come no further... Lest ye be willing for a quest, perhaps?\"");
			System.out.println("\"I am in need of an assistant. Can thouest help me?\" he asks.");
			System.out.println();
			System.out.print("YES OR NO: ");
			String questChoice = scan.nextLine();
			if (questChoice.toUpperCase().equals("YES"))
			{
				Quest.emptyBuildingQuest();
			}
			if (questChoice.toUpperCase().equals("NO"))
			{
				System.out.println();
				System.out.println("\"HMMM.. Well that is too bad, truly.\"");
				System.out.println("\"If thou ever need me, thou know where to findeth me.\" He says.");
				System.out.println("He slowly backs away, returning to the shadows from whence he came.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			else
			{
				System.out.println();
				System.out.println("The DWELLER stares at you for a bit before slowly backing away,");
				System.out.println("returning to the shadows from whence he came.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (emptyBuildingChoice.toUpperCase().equals("APPROACH")&& Player.dwellerFled == true ||emptyBuildingChoice.toUpperCase().equals("APPROACH DWELLER")&& Player.dwellerFled == true ||emptyBuildingChoice.toUpperCase().equals("DWELLER") && Player.dwellerFled == true)
		{
			System.out.println();
			System.out.println("But the DWELLER has already fled!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (emptyBuildingChoice.toUpperCase().equals("LEAVE")||emptyBuildingChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			try {
				Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireGates()
	{
		Player.location = "Gates";
		Player.inAGrid = false;
		Player.inHamshire = true;
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art at the Gates."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String gatesChoice = scan.nextLine();
		Action.defaultActions(gatesChoice);
		Action.locationChanges(gatesChoice);
		if (gatesChoice.toUpperCase().equals("LEAVE")||gatesChoice.toUpperCase().equals("WALK OUT GATES")||gatesChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("Thou leaveth HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE.");
			System.out.println();
			Map.grid5_5();
		}
	}
	public static void HamshireCastleOutside()
	{
		Player.location = "CastleOutside";
		String x = "";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Also, thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art outside the Castle.");
		if (Player.firstCastleVisit == true)
		{
			x = " He looks oddly familiar...";
			Player.firstCastleVisit = false;
		}
		System.out.println("There is a single guard at the entrance."+x+nakedText);
		System.out.println();
		System.out.println("GO IN");
		System.out.println("TALK TO GUARD");
		System.out.println("WALK AWAY");
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String castleChoice1 = scan.nextLine();
		Action.defaultActions(castleChoice1);
		Action.locationChanges(castleChoice1);
		if (castleChoice1.toUpperCase().equals("GO IN")||castleChoice1.toUpperCase().equals("GO"))
		{
			if (Player.castleClearance == true)
			{
				Action.guardEncounter("CASTLE CLEARANCE YAY");
			}
			if (Player.castleClearance == false)
			{
				Action.guardEncounter("CASTLE CLEARANCE NAY");
			}
		}
		if (castleChoice1.toUpperCase().equals("TALK TO GUARD")||castleChoice1.toUpperCase().equals("TALK"))
		{
			System.out.println();
			System.out.println("Thou walketh up to the GUARD and converse thusly.");
			Action.guardEncounter("CASTLE GUARD CONVO");
		}
		if (castleChoice1.toUpperCase().equals("LEAVE")||castleChoice1.toUpperCase().equals("WALK AWAY")||castleChoice1.toUpperCase().equals("WALK"))
		{
			System.out.println("Thou turn around and walketh away.");
			System.out.println();
			HamshireUpperCity();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireCastleInside()
	{
		Player.location = "CastleInside";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art inside the Castle."+nakedText);
		if (Player.kingIsIn == true)
		{	
			System.out.println("Thou art in the presence of the KING.");
		}
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String castleChoice2 = scan.nextLine();
		Action.defaultActions(castleChoice2);
		Action.locationChanges(castleChoice2);
		if (castleChoice2.toUpperCase().equals("TALK")||castleChoice2.toUpperCase().equals("TALK TO KING")||castleChoice2.toUpperCase().equals("SPEAK TO KING"))
		{
			if (Quest.stumpQuest == false)
			{
				Quest.stumpQuest();
			}
			else
			{
				System.out.println();
				System.out.println("Thou walketh up to the KING and TALK to him...");
				System.out.println();
				System.out.println();
			}
		}
		if (castleChoice2.toUpperCase().equals("LEAVE")||castleChoice2.toUpperCase().equals("WALK AWAY"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			HamshireUpperCity();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireMarketplace()
	{
		Player.location = "Marketplace";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art in the Marketplace."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String marketChoice = scan.nextLine();
		Action.defaultActions(marketChoice);
		Action.locationChanges(marketChoice);
		if (marketChoice.toUpperCase().equals("LEAVE")||marketChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou returneth back to the town.");
			System.out.println();
			HamshireUpperCity();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireGraveyard()
	{
		Player.location = "Graveyard";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art at the Graveyard."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String graveyardChoice = scan.nextLine();
		Action.defaultActions(graveyardChoice);
		Action.locationChanges(graveyardChoice);
		if (graveyardChoice.toUpperCase().equals("LEAVE")||graveyardChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou returneth back to the town.");
			System.out.println();
			HamshireUpperCity();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireTower()
	{
		Player.location = "Tower";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println("Thou art in the Tower."+nakedText);
		System.out.println();
		System.out.println("LEAVE");
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String towerChoice = scan.nextLine();
		Action.defaultActions(towerChoice);
		Action.locationChanges(towerChoice);
		if (towerChoice.toUpperCase().equals("LEAVE")||towerChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			HamshireUpperCity();
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void HamshireJail()
	{
		Player.location = "Jail";
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art at the Jail."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String jailChoice = scan.nextLine();
		Action.defaultActions(jailChoice);
		Action.locationChanges(jailChoice);
		if (jailChoice.toUpperCase().equals("LEAVE")||jailChoice.toUpperCase().equals("WALK OUT"))
		{
			System.out.println("Thou turn around and walketh out the door.");
			System.out.println();
			try {
				Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	
	public static void Stingerville()
	{
		Player.location = "Stingerville";
		Player.inStingerville = true;
		String nakedText = "";
		String yep = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		if (Player.name.toUpperCase().equals("STINGER"))
		{
			yep = " You own this place :D.";
		}
		System.out.println("Thou art in Stingerville."+nakedText+yep);
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String ultimateChoice = scan.nextLine();
		Action.defaultActions(ultimateChoice);
		Action.locationChanges(ultimateChoice);
		if (ultimateChoice.toUpperCase().equals("LEAVE")||ultimateChoice.toUpperCase().equals("WALK OUT GATES")||ultimateChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("But thou art in the center of STINGERVILLE! Go to the GATES first.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		else
		{
			System.out.println();
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void StingervilleGates()
	{
		Player.location = "StingervilleGates";
		Player.inAGrid = false;
		Player.inStingerville = true;
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art at the Gates."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String gatesChoice = scan.nextLine();
		Action.defaultActions(gatesChoice);
		Action.locationChanges(gatesChoice);
		if (gatesChoice.toUpperCase().equals("LEAVE")||gatesChoice.toUpperCase().equals("WALK OUT GATES")||gatesChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("Thou leaveth STINGERVILLE.");
			System.out.println();
			Map.grid1_2();
		}
		else
		{
			System.out.println();
			System.out.println("Thouest command is not recognizable, sire!");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void StingervilleInn()
	{
		
	}
	public static void StingervilleStore()
	{
		
	}
	public static void StingersHouse()
	{
		
	}
	
	
	public static void Stump()
	{
		Player.location = "Stump";
		Player.inStump = true;
		String nakedText = "";
		String yep = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		if (Player.name.toUpperCase().equals("STUMP"))
		{
			yep = " You own this place :D.";
		}
		System.out.println("Thou art in Stump."+nakedText+yep);
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String ultimateChoice = scan.nextLine();
		Action.defaultActions(ultimateChoice);
		Action.locationChanges(ultimateChoice);
		
	}
	public static void StumpGates()
	{
		Player.location = "StumpGates";
		Player.inAGrid = false;
		Player.inStump = true;
		String nakedText = "";
		if (Player.isNaked == true)
		{
			nakedText = " Thou art naked.";
		}
		System.out.println();
		System.out.println("Thou art at the Gates."+nakedText);
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String gatesChoice = scan.nextLine();
		Action.defaultActions(gatesChoice);
		Action.locationChanges(gatesChoice);
		if (gatesChoice.toUpperCase().equals("LEAVE")||gatesChoice.toUpperCase().equals("WALK OUT GATES")||gatesChoice.toUpperCase().equals("LEAVE TOWN"))
		{
			System.out.println();
			System.out.println("Thou leaveth STUMP.");
			System.out.println();
			Map.grid9_5();
		}
	}
	public static void StumpCastle()
	{
		
	}
	public static void StumpStore()
	{
		
	}
	public static void StumpInn()
	{
		
	}
	
	
	
	
}
