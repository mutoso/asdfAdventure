import java.util.Random;
import java.util.Scanner;

public class Action
{
	//String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int ITEMCOST, int STRENGTH,
	//int INT, int STAM, int DEX, int DUKE, int SLOTX, int SLOTY
	
	public static void options()
	{
		Scanner scan = new Scanner(System.in);
		Action.println();
		if(Player.scrollingQuestText == false)
		{
			Action.println("1 to enable scrolling text");
		}
		if(Player.scrollingQuestText == true)
		{
			Action.println("1 to disable scrolling text");
		}
		Action.println("Map options");
		Action.println("Back");
		System.out.println();
		System.out.print("CHOOSETH: ");
		String optionsChoice = scan.nextLine();
		if (optionsChoice.toUpperCase().equals("1"))
		{
			Player.scrollingQuestText = !Player.scrollingQuestText;
		}
		if (optionsChoice.toUpperCase().equals("BACK"))
		{
			if (Player.inMainMenu == true)
			{
				System.out.println();
				RPGmain.gameStart();
			}
			if (Player.inMainMenu == false)
			{
				if (Player.savedInLocation == true)
				{
					System.out.println();
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					System.out.println();
					Map.goToGrid(Player.gridLocation);
				}
			}
		}
		if (optionsChoice.equalsIgnoreCase("Map")||optionsChoice.equalsIgnoreCase("Map options"))
		{
			System.out.println();
			Action.println("1 to adjust starting size, 2 for starting position, or DEFAULT, or BACK");
			optionsChoice = scan.nextLine();
			System.out.print("CHOOSETH: ");
			if (optionsChoice.toUpperCase().equals("BACK"))
			{
				options();
			}
			if (optionsChoice.toUpperCase().equals("1"))
			{
				Action.println("New map width: default 1016");
				Player.mapWidth = scan.nextInt();
				Action.println("New map height: default 1038");
				Player.mapHeight = scan.nextInt();
			}
			if (optionsChoice.toUpperCase().equals("2"))
			{
				Action.println("New map starting x: default 0");
				Player.mapSpwanX = scan.nextInt();
				Action.println("New map starting y: default 0");
				Player.mapSpwanY = scan.nextInt();
			}
			if (optionsChoice.toUpperCase().equals("DEFAULT"))
			{
				Player.mapWidth = 1016;
				Player.mapHeight = 1038;
				Player.mapSpwanX = 0;
				Player.mapSpwanY = 0;
			}
		}
	}
	public static void inventoryWindow()
	{
		@SuppressWarnings("unused")
		InventoryWindow window = new InventoryWindow();
	}
	public static void map()
	{
		if (Item.searchinv("Map") != null)
		{
			System.out.println();
			System.out.println("Thou open thine MAP...");
			System.out.println();
			@SuppressWarnings("unused")
			MapWindow window = new MapWindow();
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		else
		{
			System.out.println();
			System.out.println("Thou hath possesseth a map not.");
			System.out.println();
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
	}
	public static void shoptest()
	{
		boolean loop = true;
		while(loop)
			{
			System.out.println();
			Scanner scan = new Scanner(System.in);
			Shop shop = new Shop("Magic");
			shop.getInventory();
			System.out.println("INSPECT/BUY/QUIT");
			String Choice = scan.nextLine();
			String[] temp;
			String delimiter = " ";
			temp = Choice.split(delimiter);
			if(temp[0].equalsIgnoreCase("quit"))
			{
				loop = false;
				Action.gotoLocation(Player.location);
			}
			if(temp[0].equalsIgnoreCase("inspect"))
			{
				shop.inspect(temp[1]+" "+temp[2]);
			}
			if(temp[0].equalsIgnoreCase("Buy")||temp[0].equalsIgnoreCase("Purchase"))
			{
				shop.purchase(temp[1]+" "+temp[2]);
			}

		}
	}
	public static void println(String in)
	{
		if(Player.scrollingQuestText == false)
		{
			System.out.println(in);
		}
		if(Player.scrollingQuestText == true)
		{
			String Choice = in;
			String[] temp;
			String delimiter = " ";
			temp = Choice.split(delimiter);
			long time = 0;
			for(int x = 0; x<temp.length; x++)
			{
				if(temp[x].length() != 0)
				{
					time = 1000/(temp[x].length()+10);
				}
				//System.out.print(time);
				for(int y = 0; y < temp[x].length(); y++)
				{
					System.out.print(temp[x].charAt(y));
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void print(String in)
	{
		if(Player.scrollingQuestText == false)
		{
			System.out.println(in);
		}
		if(Player.scrollingQuestText == true)
		{
			String Choice = in;
			String[] temp;
			String delimiter = " ";
			temp = Choice.split(delimiter);
			long time = 0;
			for(int x = 0; x<temp.length; x++)
			{
				if(temp[x].length() != 0)
				{
					time = 1000/(temp[x].length()+10);
				}
				//System.out.print(time);
				for(int y = 0; y < temp[x].length(); y++)
				{
					System.out.print(temp[x].charAt(y));
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(" ");
			}
		}
	}
	public static void wait(int time)
	{
		int waitTime = time * 1000;
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void defaultActions(String Choice)
	{
		if (Choice.toUpperCase().equals("INV"))
		{
			inventoryWindow();
		}
		if (Choice.toUpperCase().equals("MAP"))
		{
			map();
		}
		if (Choice.toUpperCase().equals("SHOP"))
		{
			shoptest();
		}
		if (Choice.toUpperCase().equals("HELP"))
		{
			getHelpNoob();
		}
		if (Choice.toUpperCase().equals("STATS"))
		{
			getStats();
		}
		if (Choice.toUpperCase().equals("WHAT DO"))
		{
			whatDo();
		}
		if (Choice.toUpperCase().equals("OPTIONS"))
		{
			options();
		}
		if (Choice.toUpperCase().equals("BOOLEANS"))
		{
			booleans();
		}
		if (Choice.toUpperCase().equals("INVENTORY"))
		{
			printInventory();
			getInventory();
		}
		if (Choice.toUpperCase().equals("PUNCH SELF"))
		{
			punchSelf();
		}
		if (Choice.toUpperCase().equals("SET EGO")||Choice.toUpperCase().equals("EGO"))
		{
			setEgo();
		}
		if (Choice.toUpperCase().equals("SET GOLD")||Choice.toUpperCase().equals("GOLD"))
		{
			setGold();
		}
		if (Choice.toUpperCase().equals("LOCATIONS")||Choice.toUpperCase().equals("CURRENT LOCATIONS"))
		{
			currentLocations();
		}
		if (Choice.toUpperCase().equals("QUEST")||Choice.toUpperCase().equals("QUEST LOG"))
		{
			Quest.currentQuests();
		}
		if (Choice.toUpperCase().equals("REMOVE QUEST")||Choice.toUpperCase().equals("REMOVE"))
		{
			Action.removeQuest();
		}
		if (Choice.toUpperCase().equals("DIE"))
		{
			System.out.println("Thou sufferest an aneurism and die on the spot.");
			Player.death();
		}
		if (Choice.toUpperCase().equals("MENU")||Choice.toUpperCase().equals("MAIN MENU"))
		{
			if (Player.inAGrid == false)
			{
				Player.savedInGrid = false;
				Player.savedInLocation = true;
				Save.slot(true);
				RPGmain.gameStart();
			}
			if (Player.inAGrid == true)
			{
				Player.savedInGrid = true;
				Player.savedInLocation = false;
				Save.slot(true);
				RPGmain.gameStart();
			}
		}
		if (Choice.toUpperCase().equals("NEW GAME") || Choice.toUpperCase().equals("NEW"))
		{
			System.out.println();
			System.out.println("..While you're already playing? Alright, sure, whatever.");
			System.out.println("Pick a slot, first. (1-5)");
			Save.pickSlot();
			RPGmain.characterCreation();
			Action.gotoLocation(Player.location);
		}
		if (Choice.toUpperCase().equals("SAVE"))
		{
			if (Player.inAGrid == false)
			{
				Player.savedInGrid = false;
				Player.savedInLocation = true;
				Save.slot(false);
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Player.savedInGrid = true;
				Player.savedInLocation = false;
				Save.slot(false);
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("LOAD GAME") || Choice.toUpperCase().equals("LOAD"))
		{
			Load.pickSlot();
		}
		if (Choice.toUpperCase().equals("QUIT")||Choice.toUpperCase().equals("END")||Choice.toUpperCase().equals("TERMINATE")||Choice.toUpperCase().equals("ABANDON"))
		{
			if (Player.inAGrid == false)
			{
				Player.savedInGrid = false;
				Player.savedInLocation = true;
				Save.slot(true);
				System.exit(0);
			}
			if (Player.inAGrid == true)
			{
				Player.savedInGrid = true;
				Player.savedInLocation = false;
				Save.slot(true);
				System.exit(0);
			}
		}
		if (Choice.toUpperCase().equals("DEFAULT ACTIONS"))
		{
			System.out.println("-DEFAULTETH ACTIONSETH-");
			System.out.println("HELP");
			System.out.println("OPTIONS");
			System.out.println("STATS");
			System.out.println("INVENTORY");
			System.out.println("QUEST LOG");
			System.out.println("SAVE GAME");
			System.out.println("LOAD GAME");
			System.out.println("NEW GAME");
			System.out.println("QUIT");
			System.out.println("LOCATIONS");
			System.out.println("PUNCH SELF");
			System.out.println("DIE");
			System.out.println("TAKE OFF CLOTHES");
			System.out.println();
			System.out.println("-DEV STUFF LOL- (will probably be removed)");
			System.out.println("HIT TEST");
			System.out.println("SET GOLD");
			System.out.println("SET EGO");
			System.out.println("ABRACADABRA");
			System.out.println("ALAKAZAM");
			System.out.println("GIVE IRON HELMET");
			System.out.println("BOOLEANS");
			System.out.println("SHOP");
			System.out.println();
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("HIT TEST"))
		{
			int x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			x = Player.generateHit();
			System.out.println(x);
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("NAKED")||Choice.toUpperCase().equals("BE NAKED")||Choice.toUpperCase().equals("GET NAKED")||Choice.toUpperCase().equals("TAKE OFF CLOTHES")||Choice.toUpperCase().equals("REMOVE CLOTHES"))
		{
			System.out.println();
			System.out.println("Thou taketh off all of thine clothes. Fuck the police.");
			System.out.println();
			Player.isNaked = true;
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("ABRACADABRA"))
		{
			Item.give("Magic Wand", "A wand, wise and old", false, 0, 8, 10000000, 0, 20, 0, 0, 20);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			System.out.println();
			System.out.println("A magic wand appears in front of you.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			System.out.println();
			System.out.println("You nimbily pluck it out of the air, and stow it in your pack");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			System.out.println();
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("ALAKAZAM"))
		{
			Item.remove("Magic Wand");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			System.out.println();
			System.out.println("The wand vanishes from your pack");
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (Choice.toUpperCase().equals("GIVE IRON HELMET")||Choice.toUpperCase().equals("IRON HELMET"))
		{
			System.out.println();
			System.out.println("Thou findeth an IRON HELMET on the ground and put it in thine INVENTORY.");
			System.out.println();
			
			Item.giveArmor("Iron Helmet");
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
	}
	public static void gotoLocation(String location)
	{
		if (location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
		{
			try {
				Location.Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (location.toUpperCase().equals("TAVERN"))
		{
			Location.HamshireTavern();
		}
		if (location.toUpperCase().equals("INN"))
		{
			Location.HamshireInn();
		}
		if (location.toUpperCase().equals("STORE"))
		{
			Location.HamshireStore();
		}
		if (location.toUpperCase().equals("EMPTY BUILDING"))
		{
			Location.HamshireEmptyBuilding();
		}
		if (location.toUpperCase().equals("GATES"))
		{
			Location.HamshireGates();
		}
		if (location.toUpperCase().equals("CASTLEOUTSIDE"))
		{
			Location.HamshireCastleOutside();
		}
		if (location.toUpperCase().equals("CASTLEINSIDE"))
		{
			Location.HamshireCastleInside();
		}
		if (location.toUpperCase().equals("MARKETPLACE"))
		{
			Location.HamshireMarketplace();
		}
		if (location.toUpperCase().equals("GRAVEYARD"))
		{
			Location.HamshireGraveyard();
		}
		if (location.toUpperCase().equals("TOWER"))
		{
			Location.HamshireTower();
		}
		if (location.toUpperCase().equals("UPPER CITY"))
		{
			Location.HamshireUpperCity();
		}
		if (location.toUpperCase().equals("JAIL"))
		{
			Location.HamshireJail();
		}
	}
	public static void printInventory()
	{
		System.out.println();
		System.out.println("GOLD: "+Player.Gold);
		int maxlength = 0;
		for(int x=0; x<2; x++)
		{
			if (Player.Hats[x] != null)
			{
				if (Player.Hats[x].getItemName().length() > maxlength)
				{
					maxlength = Player.Hats[x].getItemName().length();
				}
			}
		}
		for(int x=0; x<7; x++)
		{
			if (Player.Armor[x] != null)
			{
				if (Player.Armor[x].getItemName().length() > maxlength)
				{
					maxlength = Player.Armor[x].getItemName().length();
				}
			}
		}
		for(int x = 0; x<=2; x++)
		{
			for(int y=0; y<7; y++)
			{
				if (Player.Inventory[x][y] != null)
				{
					if (Player.Inventory[x][y].getItemName().length() > maxlength)
					{
						maxlength = Player.Inventory[x][y].getItemName().length();
					}
				}
			}
		}
		System.out.print("HATS:      ");
		for(int x = 0; x < Player.Hats.length; x++)
		{
			String hats = "";
			int spacing = maxlength;
			if(Player.Hats[x] != null)
			{
				hats = Player.Hats[x].getItemName();
				spacing = maxlength - Player.Hats[x].getItemName().length();
			}
			System.out.print("["+hats);
			for (int y = 0; y < spacing; y++)
			{
				System.out.print(" ");
			}
			System.out.print("] ");
		}
		System.out.println();
		System.out.println();
		System.out.print("ARMOR:     ");
		for(int x = 0; x < Player.Armor.length; x++)
		{
			String hats = "";
			int spacing = maxlength;
			if(Player.Armor[x] != null)
			{
				hats = Player.Armor[x].getItemName();
				spacing = maxlength - Player.Armor[x].getItemName().length();
			}
			System.out.print("["+hats);
			for (int y = 0; y < spacing; y++)
			{
				System.out.print(" ");
			}
			System.out.print("] ");
		}
		System.out.println();
		System.out.println();
		System.out.print("INVENTORY: ");
		for(int x = 0; x < Player.Inventory[0].length; x++)
		{
			String hats = "";
			int spacing = maxlength;
			if(Player.Inventory[0][x] != null)
			{
				hats = Player.Inventory[0][x].getItemName();
				spacing = maxlength - Player.Inventory[0][x].getItemName().length();
			}
			System.out.print("["+hats);
			for (int y = 0; y < spacing; y++)
			{
				System.out.print(" ");
			}
			System.out.print("] ");
		}
		System.out.println();
		System.out.print("           ");
		for(int x = 0; x < Player.Inventory[1].length; x++)
		{
			String hats = "";
			int spacing = maxlength;
			if(Player.Inventory[1][x] != null)
			{
				hats = Player.Inventory[1][x].getItemName();
				spacing = maxlength - Player.Inventory[1][x].getItemName().length();
			}
			System.out.print("["+hats);
			for (int y = 0; y < spacing; y++)
			{
				System.out.print(" ");
			}
			System.out.print("] ");
		}
		System.out.println();
		System.out.print("           ");
		for(int x = 0; x < Player.Inventory[2].length; x++)
		{
			String hats = "";
			int spacing = maxlength;
			if(Player.Inventory[2][x] != null)
			{
				hats = Player.Inventory[2][x].getItemName();
				spacing = maxlength - Player.Inventory[2][x].getItemName().length();
			}
			System.out.print("["+hats);
			for (int y = 0; y < spacing; y++)
			{
				System.out.print(" ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}
	public static void getInventory()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("GIVE/EQUIP X/UNEQUIP X/INSPECT X/REMOVE X/QUIT:");
		Player.name = scan.nextLine();
		String[] temp;
		String delimiter = " ";
		temp = Player.name.split(delimiter);
		if(temp[0].equalsIgnoreCase("Give"))
		{
			System.out.println("ENTER NAME");
			String name = scan.nextLine();
			System.out.println("ENTER DESCRIPTION");
			String description = scan.nextLine();
			System.out.println("DUEL HANDED TRUE/FALSE");
			String hand1 = scan.nextLine();
			boolean hand = false;
			if(hand1.equalsIgnoreCase("true"))
			{
				hand = true;
			}
			if(hand1.equalsIgnoreCase("false"))
			{
				hand = false;
			}
			int type = 0;
			if(hand == false)
			{
				System.out.println("UNEQUIPABLE/HAT/HEAD/NECKLACE/BODY/BELT/PANTS/BOOTS/MAINHAND/OFFHAND");
				String in = scan.nextLine();
				if(in.equalsIgnoreCase("hat"))
					type = 1;
				if(in.equalsIgnoreCase("head"))
					type = 2;
				if(in.equalsIgnoreCase("necklace"))
					type = 3;
				if(in.equalsIgnoreCase("body"))
					type = 4;
				if(in.equalsIgnoreCase("belt"))
					type = 5;
				if(in.equalsIgnoreCase("pants"))
					type = 6;
				if(in.equalsIgnoreCase("boots"))
					type = 7;
				if(in.equalsIgnoreCase("mainhand"))
					type = 8;
				if(in.equalsIgnoreCase("offhand"))
					type = 9;
			}
			else
			{
					type = 8;
			}
			System.out.println("ENTER MINIMUM LEVEL");
			int level = scan.nextInt();
			System.out.println("ENTER VALUE");
			int value = scan.nextInt();
			System.out.println("ENTER STRENGTH");
			int str = scan.nextInt();
			System.out.println("ENTER INTELLECT");
			int inte = scan.nextInt();
			System.out.println("ENTER STAMANA");
			int stam = scan.nextInt();
			System.out.println("ENTER DEXTERITY");
			int dex = scan.nextInt();
			System.out.println("ENTER EGO");
			int ego = scan.nextInt();
			Item.give(name, description, hand, level, type, value, str, inte, stam, dex, ego);
			Action.printInventory();
			getInventory();
		}
		if(temp[0].equalsIgnoreCase("Equip"))
		{
			String itemname = temp[1];
			for(int x = 2; x< temp.length; x++)
			{
				itemname += " "+temp[x];
			}
			Item.equip(itemname);
			Action.printInventory();
			getInventory();
		}
		if(temp[0].equalsIgnoreCase("Unequip"))
		{
			String itemname = temp[1];
			for(int x = 2; x< temp.length; x++)
			{
				itemname += " "+temp[x];
			}
			Item.unEquip(itemname);
			Action.printInventory();
			getInventory();
		}
		if(temp[0].equalsIgnoreCase("Inspect"))
		{
			String itemname = temp[1];
			for(int x = 2; x< temp.length; x++)
			{
				itemname += " "+temp[x];
			}
			Item.inspect(itemname);
			Action.printInventory();
			getInventory();
		}
		if(temp[0].equalsIgnoreCase("Remove"))
		{
			String itemname = temp[1];
			for(int x = 2; x< temp.length; x++)
			{
				itemname += " "+temp[x];
			}
			Item.remove(itemname);
			Action.printInventory();
			getInventory();
		}
		if(temp[0].equalsIgnoreCase("Quit"))
		{
			Action.gotoLocation(Player.location);
		}
		
	}
	public static void setGold()
	{
		System.out.println();
		System.out.println("Enter gold amount: ");
		Scanner scan = new Scanner(System.in);
		int goldAmount = scan.nextInt();
		Player.Gold = goldAmount;
		System.out.println();
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void punchPeasant()
	{
		Random rand = new Random();
		int peasantEncounter = rand.nextInt(100);
		int peasantNameGenerator = rand.nextInt(5);
		String peasantName = "";
		System.out.println("Thou look around for a random peasant to punch...");
		if (peasantEncounter < 5)
		{
			if (peasantNameGenerator == 0)
			{
				peasantName = "Edupop";
			}
			if (peasantNameGenerator == 1)
			{
				peasantName = "JasonBray";
			}
			if (peasantNameGenerator == 2)
			{
				peasantName = "Adunkadoo";
			}
			if (peasantNameGenerator == 3)
			{
				peasantName = "Stinger21";
			}
			if (peasantNameGenerator == 4)
			{
				peasantName = "Ratchex";
			}
			System.out.println("Thou actually manage to find someone just passing through Hamshire!! Possibly here just to steal resources.");
			System.out.println("Thou walk up to "+peasantName+" and punch him straight in the face!");
			System.out.println("Thou art now fighting "+peasantName+"!");
			Enemy.Peasant();
			try {
				Fight.doFight();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Action.gotoLocation(Player.location);
		}
		else
		{
			System.out.println("Thou spot no other peasants at all. The town is completly deserted.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
	}
	public static void punchSelf()
	{
		System.out.println("How hard?");
		System.out.print("CHOOSETH: ");
		Scanner scan = new Scanner(System.in);
		String punchStrength = scan.nextLine();
		Random rand = new Random();
		if (punchStrength.toUpperCase().equals("NOT HARD") || punchStrength.toUpperCase().equals("LIGHTLY"))// 0-10 damage
		{
			System.out.println();
			System.out.println("Thou puncheth thineself lightly in the face.");
			int randInt = rand.nextInt(10)+1;
			System.out.println("Thou suffer "+randInt+" damage");
			Player.healthNow -= randInt;
			if (Player.healthNow <= 0)
			{
				Player.death();
			}
			else
			{
				System.out.println("Thine health is "+Player.healthNow+"/"+Player.healthMax);
				System.out.println();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
		}
		if (punchStrength.toUpperCase().equals("HARD")) //10-25 damage
		{
			System.out.println();
			System.out.println("Thou puncheth thineself hard in the face.");
			int randInt = rand.nextInt(15)+10;
			System.out.println("Thou suffer "+randInt+" damage");
			Player.healthNow -= randInt;
			if (Player.healthNow <= 0)
			{
				Player.death();
			}
			else
			{
				System.out.println("Thine health is "+Player.healthNow+"/"+Player.healthMax);
				System.out.println();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
		}
		if (punchStrength.toUpperCase().equals("DECENTLY HARD")) // 25-50
		{
			System.out.println();
			System.out.println("Thou puncheth thineself decently hard in the face.");
			int randInt = rand.nextInt(25)+25;
			System.out.println("Thou suffer "+randInt+" damage");
			Player.healthNow -= randInt;
			if (Player.healthNow <= 0)
			{
				Player.death();
			}
			else
			{
				System.out.println("Thine health is "+Player.healthNow+"/"+Player.healthMax);
				System.out.println();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
		}
		if (punchStrength.toUpperCase().equals("PRETTY HARD")) // 50-100 damage
		{
			System.out.println();
			System.out.println("Thou puncheth thineself pretty hard in the face. Wow.");
			int randInt = rand.nextInt(50)+50;
			System.out.println("Thou suffer "+randInt+" damage");
			Player.healthNow -= randInt;
			if (Player.healthNow <= 0)
			{
				Player.death();
			}
			else
			{
				System.out.println("Thine health is "+Player.healthNow+"/"+Player.healthMax);
				System.out.println();
				if (Player.savedInGrid == false)
				{
					Action.gotoLocation(Player.location);
				}
				if (Player.savedInGrid == true)
				{
					Map.goToGrid(Player.gridLocation);
				}
			}
		}
		if (punchStrength.toUpperCase().equals("FUCKING HARD")) //INSTADEATH
		{
			System.out.println();
			System.out.print("Thou puncheth thineself with the force of the Wind God in the face, completly shattering all facial bone structure, killing thineself. You dumbass.");
			Player.death();
		}
	}
	public static void getStats()
	{
		System.out.println();
		System.out.println("STATS FOR "+Player.name.toUpperCase()+" THE "+Player.race.toUpperCase()+" "+Player.Class.toUpperCase()+":");
		System.out.println();
		System.out.println("Level "+Player.level);
		System.out.println("Health: "+Player.healthNow+"/"+Player.healthMax);
		System.out.println("Mana: "+Player.manaNow+"/"+Player.manaMax);
		System.out.println("Energy: "+Player.energyNow+"/"+Player.energyMax);
		System.out.println();
		System.out.println("Strength: "+Player.Strength);
		System.out.println("Intellect: "+Player.Intellect);
		System.out.println("Stamina: "+Player.Stamina);
		System.out.println("Dexterity: "+Player.Dexterity);
		System.out.println("Ego: "+Player.Ego);
		System.out.println();
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void currentLocations()
	{
		System.out.println();
		System.out.println("CURRENT LOCATIONS:");
		System.out.println("HAMSHIRE");
		System.out.println("TAVERN");
		System.out.println("INN");
		System.out.println("STORE");
		System.out.println("EMPTY BUILDING");
		System.out.println("GATES");
		System.out.println("UPPER CITY");
		System.out.println("MARKETPLACE");
		System.out.println("CASTLE");
		System.out.println("GRAVEYARD");
		System.out.println("TOWER");
		System.out.println("JAIL");
		System.out.println();
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void setEgo()
	{
		System.out.println();
		System.out.print("TO WHAT: ");
		Scanner scan = new Scanner(System.in);
		int egoChoice = scan.nextInt();
		Player.Ego += egoChoice;
		System.out.println();
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void locationChanges(String locationChoice)
	{
		if (locationChoice.toUpperCase().equals("STINGERVILLE")||locationChoice.toUpperCase().equals("GO TO STINGERVILLE")||locationChoice.toUpperCase().equals("TOWN CENTER"))
		{
			if (Player.inStump == true)
			{
				System.out.println();
				System.out.println("But thou art in STUMP!");
				System.out.println("Thou can not travel to that location from here.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (Player.inHamshire == true)
			{
				System.out.println();
				System.out.println("But thou art in HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE!");
				System.out.println("Thou can not travel to that location from here.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (Player.inStingerville == true)
			{
				System.out.println("Thou walkest over to the town center...");
				System.out.println();
				Location.Stingerville();
			}
			
		}
		if (locationChoice.toUpperCase().equals("HAMSHIRE")||locationChoice.toUpperCase().equals("GO TO HAMSHIRE")||locationChoice.toUpperCase().equals("TOWN CENTER"))
		{
			String x = "";
			// upper city locations V
			if (Player.location.toUpperCase().equals("UPPER CITY")
			  ||Player.location.toUpperCase().equals("MARKETPLACE")
			  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
			  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
			  ||Player.location.toUpperCase().equals("TOWER")
			  ||Player.location.toUpperCase().equals("GRAVEYARD"))
			{
				x = " down the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the town center...");
			System.out.println();
			try {
				Location.Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (locationChoice.toUpperCase().equals("TAVERN")||locationChoice.toUpperCase().equals("GO TO TAVERN")||locationChoice.toUpperCase().equals("WALK TO TAVERN"))
		{
			String x = "";
			// upper city locations V
			if (Player.location.toUpperCase().equals("UPPER CITY")
			  ||Player.location.toUpperCase().equals("MARKETPLACE")
			  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
			  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
			  ||Player.location.toUpperCase().equals("TOWER")
			  ||Player.location.toUpperCase().equals("GRAVEYARD"))
			{
				x = " down the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the TAVERN...");
			Location.HamshireTavern();
		}
		if (locationChoice.toUpperCase().equals("INN")||locationChoice.toUpperCase().equals("GO TO INN")||locationChoice.toUpperCase().equals("WALK TO INN"))
		{
			String x = "";
			// upper city locations V
			if (Player.location.toUpperCase().equals("UPPER CITY")
			  ||Player.location.toUpperCase().equals("MARKETPLACE")
			  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
			  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
			  ||Player.location.toUpperCase().equals("TOWER")
			  ||Player.location.toUpperCase().equals("GRAVEYARD"))
			{
				x = " down the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the INN...");
			Location.HamshireInn();
		}
		if (locationChoice.toUpperCase().equals("STORE")||locationChoice.toUpperCase().equals("GO TO STORE")||locationChoice.toUpperCase().equals("GENERAL STORE")||locationChoice.toUpperCase().equals("GO TO GENERAL STORE")||locationChoice.toUpperCase().equals("WALK TO STORE")||locationChoice.toUpperCase().equals("WALK TO GENERAL STORE"))
		{
			String x = "";
			// upper city locations V
			if (Player.location.toUpperCase().equals("UPPER CITY")
			  ||Player.location.toUpperCase().equals("MARKETPLACE")
			  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
			  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
			  ||Player.location.toUpperCase().equals("TOWER")
			  ||Player.location.toUpperCase().equals("GRAVEYARD"))
			{
				x = " down the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the STORE...");
			Location.HamshireStore();
		}
		if (locationChoice.toUpperCase().equals("EMPTY BUILDING")||locationChoice.toUpperCase().equals("GO TO EMPTY BUILDING")||locationChoice.toUpperCase().equals("WALK TO EMPTY BUILDING"))
		{
			String x = "";
			// upper city locations V
			if (Player.location.toUpperCase().equals("UPPER CITY")
			  ||Player.location.toUpperCase().equals("MARKETPLACE")
			  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
			  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
			  ||Player.location.toUpperCase().equals("TOWER")
			  ||Player.location.toUpperCase().equals("GRAVEYARD"))
			{
				x = " down the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the uninhabited EMPTY BUILDING...");
			Location.HamshireEmptyBuilding();
		}
		if (locationChoice.toUpperCase().equals("GATES")||locationChoice.toUpperCase().equals("GO TO GATES")||locationChoice.toUpperCase().equals("WALK TO GATES"))
		{
			if (Player.inHamshire == true)
			{
				String x = "";
				// upper city locations V
				if (Player.location.toUpperCase().equals("UPPER CITY")
				  ||Player.location.toUpperCase().equals("MARKETPLACE")
				  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
				  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
				  ||Player.location.toUpperCase().equals("TOWER")
				  ||Player.location.toUpperCase().equals("GRAVEYARD"))
				{
					x = " down the massive stairs and";
				}
				System.out.println("Thou walkest"+x+" over to the GATES leading out of town...");
				Location.HamshireGates();
			}
			if (Player.inStingerville == true)
			{
				System.out.println("Thou walkest over to the GATES leading out of town...");
				Location.StingervilleGates();
			}
			if (Player.inStump == true)
			{
				System.out.println("Thou walkest over to the GATES leading out of town...");
				Location.StumpGates();
			}
		}
		if (locationChoice.toUpperCase().equals("JAIL")||locationChoice.toUpperCase().equals("GO TO JAIL")||locationChoice.toUpperCase().equals("WALK TO JAIL"))
		{
			if (Player.inHamshire == true)
			{
				String x = "";
				// upper city locations V
				if (Player.location.toUpperCase().equals("UPPER CITY")
				  ||Player.location.toUpperCase().equals("MARKETPLACE")
				  ||Player.location.toUpperCase().equals("CASTLEINSIDE")
				  ||Player.location.toUpperCase().equals("CASTLEOUTSIDE")
				  ||Player.location.toUpperCase().equals("TOWER")
				  ||Player.location.toUpperCase().equals("GRAVEYARD"))
				{
					x = " down the massive stairs and";
				}
				System.out.println("Thou walkest"+x+" over to the JAIL...");
				Location.HamshireJail();
			}
			if (Player.inStingerville == true)
			{
				System.out.println("Thou can not walk there from here...");
				Action.gotoLocation(Player.location);
			}
		}
		if (locationChoice.toUpperCase().equals("UPPER CITY")||locationChoice.toUpperCase().equals("GO TO UPPER CITY")||locationChoice.toUpperCase().equals("WALK TO UPPER CITY"))
		{
			String x = "";
			// lower city locations V
			if (Player.location.toUpperCase().equals("INN")
			  ||Player.location.toUpperCase().equals("TAVERN")
			  ||Player.location.toUpperCase().equals("STORE")
			  ||Player.location.toUpperCase().equals("EMPTY BUILDING")
			  ||Player.location.toUpperCase().equals("GATES")
			  ||Player.location.toUpperCase().equals("JAIL")
			  ||Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
			{
				x = " up the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the UPPER CITY...");
			Location.HamshireUpperCity();
		}
		if (locationChoice.toUpperCase().equals("CASTLE")||locationChoice.toUpperCase().equals("GO TO CASTLE")||locationChoice.toUpperCase().equals("WALK TO CASTLE"))
		{
			String x = "";
			// lower city locations V
			if (Player.location.toUpperCase().equals("INN")
			  ||Player.location.toUpperCase().equals("TAVERN")
			  ||Player.location.toUpperCase().equals("STORE")
			  ||Player.location.toUpperCase().equals("EMPTY BUILDING")
			  ||Player.location.toUpperCase().equals("GATES")
			  ||Player.location.toUpperCase().equals("JAIL")
			  ||Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
			{
				x = " up the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the massive CASTLE...");
			Location.HamshireCastleOutside();
		}
		if (locationChoice.toUpperCase().equals("MARKETPLACE")||locationChoice.toUpperCase().equals("GO TO MARKETPLACE")||locationChoice.toUpperCase().equals("WALK TO MARKETPLACE"))
		{
			String x = "";
			// lower city locations V
			if (Player.location.toUpperCase().equals("INN")
			  ||Player.location.toUpperCase().equals("TAVERN")
			  ||Player.location.toUpperCase().equals("STORE")
			  ||Player.location.toUpperCase().equals("EMPTY BUILDING")
			  ||Player.location.toUpperCase().equals("GATES")
			  ||Player.location.toUpperCase().equals("JAIL")
			  ||Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
			{
				x = " up the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the MARKETPLACE...");
			Location.HamshireMarketplace();
		}
		if (locationChoice.toUpperCase().equals("TOWER")||locationChoice.toUpperCase().equals("GO TO TOWER")||locationChoice.toUpperCase().equals("WALK TO TOWER"))
		{
			String x = "";
			// lower city locations V
			if (Player.location.toUpperCase().equals("INN")
			  ||Player.location.toUpperCase().equals("TAVERN")
			  ||Player.location.toUpperCase().equals("STORE")
			  ||Player.location.toUpperCase().equals("EMPTY BUILDING")
			  ||Player.location.toUpperCase().equals("GATES")
			  ||Player.location.toUpperCase().equals("JAIL")
			  ||Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
			{
				x = " up the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the TOWER in the center of town...");
			Location.HamshireTower();
		}
		if (locationChoice.toUpperCase().equals("GRAVEYARD")||locationChoice.toUpperCase().equals("GO TO GRAVEYARD")||locationChoice.toUpperCase().equals("WALK TO GRAVEYARD"))
		{
			String x = "";
			// lower city locations V
			if (Player.location.toUpperCase().equals("INN")
			  ||Player.location.toUpperCase().equals("TAVERN")
			  ||Player.location.toUpperCase().equals("STORE")
			  ||Player.location.toUpperCase().equals("EMPTY BUILDING")
			  ||Player.location.toUpperCase().equals("GATES")
			  ||Player.location.toUpperCase().equals("JAIL")
			  ||Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
			{
				x = " up the massive stairs and";
			}
			System.out.println("Thou walkest"+x+" over to the GRAVEYARD in the corner of town...");
			Location.HamshireGraveyard();
		}
	}
	public static void getHelpNoob()
	{
		System.out.println();
		System.out.println("--HALP FOR GAME--");
		System.out.println("WHAT DO");
		System.out.println("INVENTORY");
		System.out.println("STATS");
		System.out.println("LOCATIONS");
		System.out.println("OPTIONS");
		System.out.println();
		if (Player.savedInGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.savedInGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void guardEncounter(String encounterReason)
	{
		if (encounterReason.equals("CASTLE CLEARANCE YAY"))
		{
			System.out.println();
			System.out.println("\"HEAD RIGHT IN\" the GUARD says to you...");
			Location.HamshireCastleInside();
		}
		if (encounterReason.equals("CASTLE CLEARANCE NAY"))
		{
			System.out.println();
			System.out.println("\"WOAH WOAH HOLD UP THERE\" the GUARD says as he physically stops you..");
			System.out.println("\"Who dost thou thinketh thou are even? Thou can't just");
			System.out.println("waltz upeth to this here CASTLE and walk in! This is the KING");
			System.out.println("we're talking about here!\" he explains...");
			System.out.println("He promptly pushes you away back to the front of the CASTLE.");
			System.out.println("\"PEASANT...\" He mumbles under his breath...");
			System.out.println();
			Location.HamshireCastleOutside();
		}
		if (encounterReason.equals("HAMSHIRE GATES OUTSIDE"))
		{
			System.out.println();
			System.out.println("\"HEAD RIGHT IN\" the GUARD says to you...");
			System.out.println();
			Location.HamshireGates();
		}
		if (encounterReason.equals("HAMSHIRE GATES INSIDE"))
		{
			System.out.println();
			System.out.println("\"HEAD RIGHT IN\" the GUARD says to you...");
			System.out.println();
			Location.HamshireGates();
		}

		//POSSIBLE ENTRANCES TO CASTLE
		//
		//Show him the paper - instant entrance
		//Have an ego over 10 and try and convince him
		//all best hats from clothes = 9 ego max, unless you get some gold elsehow to buy 10 ego hats
		//naked = +1 ego
		//
		if (encounterReason.equals("CASTLE GUARD CONVO"))
		{
			System.out.println("\"WHAT DOTH THOU WANT, PEASANT?\" the GUARD says to you.");
			System.out.println();
			System.out.println("TRY TO GAIN ENTRANCE");
			System.out.println("HEY DONT YOU LOOK FAMILIAR");
			if (Item.search("TAX QUIRY") != null)
			{
				System.out.println("SHOW GUARD PAPER");
			}
			System.out.println("WALK AWAY");
			System.out.println();
			System.out.print("WHAT DO YOU DO: ");
			Scanner scan = new Scanner(System.in);
			String guardChoice = scan.nextLine();
			if (guardChoice.toUpperCase().equals("TRY TO GAIN ENTRANCE")||guardChoice.toUpperCase().equals("TRY"))
			{
				System.out.println();
				System.out.println("Thou tryeth to convince the GUARD to let thou into the CASTLE...");
				if (Player.Ego >= 10)
				{
					String penis1 = "";
					String penis2 = "";
					if (Player.isNaked == true)
					{
						penis1 = ", even though thine are nude";
						penis2 = ", thine PENIS flapping in the wind";
					}
					System.out.println("\"oh MAN. Thou sir, are a hardcore swagilicious fellow.\"");
					System.out.println("\"I usually do not allow people in, but I will make one exception"+penis1+".");
					System.out.println("Thou walk into the castle with an air of alpha-ness"+penis2+".");
					System.out.println();
					Player.castleClearance = true;
					Location.HamshireCastleInside();
				}
				else
				{
					System.out.println("\"HMMM.. I don't liketh thine style\" he says...");
					System.out.println("\"You're just... MISSING something. I can't let you in.\"");
					Location.HamshireCastleOutside();
				}

			}
			if (guardChoice.toUpperCase().equals("HEY DONT YOU LOOK FAMILIAR")|guardChoice.toUpperCase().equals("HEY"))
			{
				System.out.println();
				System.out.println("\"UUH.. UUHHHH\" the GUARD says, looking back and forth...");
				System.out.println("\"I DON'T KNOW WHAT YOU'RE TALKING ABOUT.. B-BAKA~...\"");
				System.out.println("He promptly pushes you back. You clearly embarressed him.");
				Location.HamshireCastleOutside();
			}





			if (guardChoice.toUpperCase().equals("SHOW GUARD PAPER") && Item.search("TAX QUIRY") != null||guardChoice.toUpperCase().equals("SHOW") && Item.search("TAX QUIRY") != null)
			{
				System.out.println();
				System.out.println("Thou showeth the GUARD the paper titled \"TODARIAN TAX QUIRY 001\"...");
				System.out.println("\"OH! OH ITS YOU!\" he says, \"The king's been waiting for thee!\"");
				System.out.println("\"Head right in, sire!\" he explains. Sweet.");
				System.out.println("Thou walketh into the massive CASTLE...");
				System.out.println();
				Player.castleClearance = true;
				Location.HamshireCastleInside();
			}





			if (guardChoice.toUpperCase().equals("SHOW GUARD PAPER") && Item.search("TAX QUIRY") == null||guardChoice.toUpperCase().equals("SHOW") && Item.search("TAX QUIRY") == null)
			{
				System.out.println();
				System.out.println("...What?");
				System.out.println();
				Action.guardEncounter("CASTLE GUARD CONVO");
			}





			if (guardChoice.toUpperCase().equals("LEAVE")||guardChoice.toUpperCase().equals("WALK AWAY")||guardChoice.toUpperCase().equals("WALK"))
			{
				System.out.println();
				System.out.println("\"heh. EHEH. AHEUAHEUAUEH\" the GUARD says as he laughs at your beta-ness.");
				System.out.println();
				Location.HamshireUpperCity();
			}





			else
			{
				System.out.println();
				System.out.println("I think you typed a command wrong. Try again");
				Action.guardEncounter("CASTLE GUARD CONVO");
			}



		}
	}
	public static void whatDo()
	{
		System.out.println();
		System.out.println("CURRENT ACTIONS THOU CAN DOETH FROM THIS LOCATION:");
		if (Player.location.toUpperCase().equals("HAMSHIREVILLETOWNINGTONVILLESHIRETONVILLE"))
		{
			System.out.println("All of the DEFAULT ACTIONS (type DEFAULT ACTIONS)");
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("TAVERN"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("INN"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("STORE"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("EMPTY BUILDING"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("GATES"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("CASTLE OUTSIDE"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("CASTLE INSIDE"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("MARKETPLACE"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("GRAVEYARD"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("TOWER"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("UPPER CITY"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.savedInGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.savedInGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void println() 
	{
		System.out.println();
		
	}
	public static void booleans()
	{
		System.out.println();
		System.out.println("townGate = "+Player.townGate);
		System.out.println("castleClearance = "+Player.castleClearance);
		System.out.println("firstCastleVisit = "+Player.firstCastleVisit);
		System.out.println("courierPaper = "+Player.courierPaper);
		System.out.println("isNaked = "+Player.isNaked);
		System.out.println("foundDweller = "+Player.foundDweller);
		System.out.println("dwellerFled = "+Player.dwellerFled);
		System.out.println("inAGrid = "+Player.inAGrid);
		System.out.println("savedInGrid = "+Player.savedInGrid);
		System.out.println("savedInLocation = "+Player.savedInLocation);
		System.out.println("kingIsIn = "+Player.kingIsIn);
		System.out.println("courierHurtFeelings = "+Player.courierHurtFeelings);
		System.out.println("paperOnGround = "+Player.paperOnGround);
		System.out.println("inMainMenu = "+Player.inMainMenu);
		System.out.println("talkedToKing = "+Player.talkedToKing);
		System.out.println();
		System.out.println("inHamshire = "+Player.inHamshire);
		System.out.println("inStingerville = "+Player.inStingerville);
		System.out.println("inStump = "+Player.inStump);
		System.out.println();
		System.out.println("Switch any? (Yes/No/All)");
		System.out.print("CHOOSETH: ");
		Scanner scan = new Scanner(System.in);
		String switchChoice = scan.nextLine();
		if (switchChoice.toUpperCase().equals("A")||switchChoice.toUpperCase().equals("ALL"))
		{
			Player.townGate = !Player.townGate;
			Player.castleClearance = !Player.castleClearance;
			Player.firstCastleVisit = !Player.firstCastleVisit;
			Player.courierPaper = !Player.courierPaper;
			Player.isNaked = !Player.isNaked;
			Player.foundDweller = !Player.foundDweller;
			Player.dwellerFled = !Player.dwellerFled;
			Player.inAGrid = !Player.inAGrid;
			Player.savedInGrid = !Player.savedInGrid;
			Player.savedInLocation = !Player.savedInLocation;
			Player.kingIsIn = !Player.kingIsIn;
			Player.courierHurtFeelings = !Player.courierHurtFeelings;
			Player.paperOnGround = !Player.paperOnGround;
			Player.inMainMenu = !Player.inMainMenu;
			Player.talkedToKing = !Player.talkedToKing;
			Player.inHamshire = !Player.inHamshire;
			Player.inStingerville = !Player.inStingerville;
			Player.inStump = !Player.inStump;
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		if (switchChoice.toUpperCase().equals("Y")||switchChoice.toUpperCase().equals("YES"))
		{
			System.out.println();
			System.out.println("Which one? (Yes/No)");
			System.out.print("CHOOSETH: ");
			String booleanChoice = scan.nextLine();
			if (booleanChoice.toUpperCase().equals("TOWNGATE"))
			{
				Player.townGate = !Player.townGate;
			}
			if (booleanChoice.toUpperCase().equals("CASTLECLEARANCE"))
			{
				Player.castleClearance = !Player.castleClearance;
			}
			if (booleanChoice.toUpperCase().equals("FIRSTCASTLEVISIT"))
			{
				Player.firstCastleVisit = !Player.firstCastleVisit;
			}
			if (booleanChoice.toUpperCase().equals("COURIERPAPER"))
			{
				Player.courierPaper = !Player.courierPaper;
			}
			if (booleanChoice.toUpperCase().equals("ISNAKED"))
			{
				Player.isNaked = !Player.isNaked;
			}
			if (booleanChoice.toUpperCase().equals("FOUNDDWELLER"))
			{
				Player.foundDweller = !Player.isNaked;
			}
			if (booleanChoice.toUpperCase().equals("DWELLERFLED"))
			{
				Player.dwellerFled = !Player.dwellerFled;
			}
			if (booleanChoice.toUpperCase().equals("INAGRID"))
			{
				Player.inAGrid = !Player.inAGrid;
			}
			if (booleanChoice.toUpperCase().equals("SAVEDINGRID"))
			{
				Player.savedInGrid = !Player.savedInGrid;
			}
			if (booleanChoice.toUpperCase().equals("SAVEDINLOCATION"))
			{
				Player.savedInLocation = !Player.savedInLocation;
			}
			if (booleanChoice.toUpperCase().equals("KINGISIN"))
			{
				Player.kingIsIn = !Player.kingIsIn;
			}
			if (booleanChoice.toUpperCase().equals("COURIERHURTFEELINGS"))
			{
				Player.courierHurtFeelings = !Player.courierHurtFeelings;
			}
			if (booleanChoice.toUpperCase().equals("PAPERONGROUND"))
			{
				Player.paperOnGround = !Player.paperOnGround;
			}
			if (booleanChoice.toUpperCase().equals("INMAINMENU"))
			{
				Player.inMainMenu = !Player.inMainMenu;
			}
			if (booleanChoice.toUpperCase().equals("TALKEDTOKING"))
			{
				Player.talkedToKing = !Player.talkedToKing;
			}
			if (booleanChoice.toUpperCase().equals("INHAMSHIRE"))
			{
				Player.inHamshire = !Player.inHamshire;
			}
			if (booleanChoice.toUpperCase().equals("INSTINGERVILLE"))
			{
				Player.inStingerville = !Player.inStingerville;
			}
			if (booleanChoice.toUpperCase().equals("INSTUMP"))
			{
				Player.inStump = !Player.inStump;
			}
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
			
		}
		if (switchChoice.toUpperCase().equals("N")||switchChoice.toUpperCase().equals("NO"))
		{
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		else
		{
			System.out.println();
			System.out.println("Thou hath typed it in wrongly.");
			System.out.println();
			if (Player.inAGrid == false)
			{
				Action.gotoLocation(Player.location);
			}
			if (Player.inAGrid == true)
			{
				Map.goToGrid(Player.gridLocation);
			}
		}
		
		
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
	public static void removeQuest()
	{
		System.out.println();
		System.out.print("Which one?: ");
		Scanner scan = new Scanner(System.in);
		String questName = scan.nextLine();
		if (questName.toUpperCase().equals("PROLOGUE")||questName.toUpperCase().equals("PROLOGUE: TALK TO THE KING"))
		{
			Quest.removeQuest("PROLOGUE: TALK TO THE KING");
		}
		if (Player.inAGrid == false)
		{
			Action.gotoLocation(Player.location);
		}
		if (Player.inAGrid == true)
		{
			Map.goToGrid(Player.gridLocation);
		}
	}
}
