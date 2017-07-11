import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Player 
{
	static String name = "";
	static String race = "";
	static String Class = "";
	static int saveSlot = 0;
	static String location = "";
	static String gridLocation = "";
	
	//THIS IS ALL SET IN rollStats()!
	static int healthMax = 0;
	static int healthNow = 0;
	static int manaMax = 0;
	static int manaNow = 0;
	static int energyMax = 0;
	static int energyNow = 0;
	
	//STATS (also set in rollStats())
	static int Strength = 0;//Melee Skills and weapon damage
							//double hit - hit 2 rounds in a row
	static int Intellect = 0;//Magic Skills and damage and max mana
	static int Stamina = 0;//Health
	static int Dexterity = 0;//Crit chance and dodge possibility and max energy
	static int Ego = 0;//How likely people are to believe you
	static int bonusArmor = 0;

	//MISC
	static int Gold = 0;
	static int level = 0;
	static String[] quest = { "", "", "", "", "", "", "", "", "", ""};
	static String mode = "";
	
	//BOOLEANS
	static boolean townGate = true; //true = open, false = closed
	static boolean castleClearance = false;
	static boolean firstCastleVisit = true;
	static boolean courierPaper = false;
	static boolean isNaked = false;
	static boolean foundDweller = false;
	static boolean dwellerFled = false;
	static boolean inAGrid = false;
	static boolean savedInGrid = false;
	static boolean savedInLocation = false;
	static boolean kingIsIn = true;
	static boolean courierHurtFeelings = false;
	static boolean paperOnGround = false;
	static boolean inMainMenu = false;
	static boolean talkedToKing = false;
	
	static boolean inHamshire = false;
	static boolean inStingerville = false;
	static boolean inStump = false;
	
	//OPTIONS
	static boolean scrollingQuestText = true;
	static int mapWidth = 1016;
	static int mapHeight = 1038;
	static int mapSpwanX = 0;
	static int mapSpwanY = 0;
	
	//INVENTORY AND ARMOR SHIT
	static Item[] Armor = new Item[8];
	//Armor = Head, Necklace, Body, Belt, Pants, Boots, MainHand, OffHand
	static Item[] Hats = new Item[3];
	//Hats = hat1, hat2, hat3
	static Item[][] Inventory = new Item[3][8];
	
	//protip- belts help your pants stay up (move pants to inventory)

	
	
	
	public static int generateHit() //MAKE THIS BETTER
	{
		int baseDamage = level * 10;
		Random rand = new Random();
		int randomness = rand.nextInt(5)+1;
		if (randomness == 5)
		{
			Fight.critMessage = "Thou striketh a critical hit!";
		}
		int additionalDamage = Strength * randomness;
		int yourHit = baseDamage + additionalDamage;
		return yourHit;
	}
	public static String enterName()
	{
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name;
	}
	public static String chooseRace()
	{
		Scanner scan = new Scanner(System.in);
		String race = scan.nextLine();
		if (race.toUpperCase().equals("HUMAN"))
		{
			race = "Human";
		} 
		else if (race.toUpperCase().equals("ELF"))
		{
			race = "Elf";
		} 
		else if (race.toUpperCase().equals("ORC"))
		{
			race = "Orc";
		} 
		else 
		{
			System.out.print("NOT A VALID RACE. CHOOSETH AGAIN: ");
			race = chooseRace();
		}
		return race;
	}
	public static String chooseClass()
	{
		Scanner scan = new Scanner(System.in);
		String Class = scan.nextLine();
		if (Class.toUpperCase().equals("WARRIOR"))
		{
			Class = "Warrior";
		} 
		else if (Class.toUpperCase().equals("MAGE"))
		{
			Class = "Mage";
		} 
		else if (Class.toUpperCase().equals("ROGUE"))
		{
			Class = "Rogue";
		} 
		else 
		{
			System.out.print("NOT A VALID CLASS. CHOOSETH AGAIN: ");
			Class = chooseClass();
		}
		return Class;
	}
	public static void death()
	{
		System.out.println();
		System.out.println("Thou hath died!");
		Path path = FileSystems.getDefault().getPath("Saves", "Save"+Player.saveSlot+".txt");
		File save = path.toFile();
		try {
			System.out.println(save.getCanonicalPath());
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		try 
		{
			@SuppressWarnings("unused")
			Process process = Runtime.getRuntime().exec("cmd.exe /C del \""+save.getCanonicalPath()+"\"");
			System.out.println("Thine save has been sent to the void.");
			Action.wait(3);
			System.exit(0);
		}
		catch (Exception e) 
	 	{
			e.printStackTrace(System.err);
		}
	}
	public void hpSet(int h) 
	{
		healthNow = h;
	}
	public void hpMod(int h) 
	{
		healthNow += h;
	}
	public static void checkShit()
	{
		if (Player.race.toUpperCase().equals("HUMAN")||Player.race.toUpperCase().equals("ORC")||Player.race.toUpperCase().equals("ELF"))
		{
			if (Player.Class.toUpperCase().equals("WARRIOR")||Player.Class.toUpperCase().equals("ROGUE")||Player.Class.toUpperCase().equals("MAGE"))
			{
				Player.setStats();
				System.out.println("HAVE FUN ROAMING THE EMPIRE, "+Player.name.toUpperCase()+"!:-DDD");
				System.out.println();
				try {
					Location.Hamshirevilletowningtonvilleshiretonville();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Invalid class. Try again.");
				RPGmain.characterCreation();
			}
		}
		else
		{
			System.out.println("Invalid race. Try again.");
			RPGmain.characterCreation();
		}
	}
	public static void setStats()
	{
		Random rand = new Random();
		int randStrength = rand.nextInt(11);
		int randIntellect = rand.nextInt(11);
		int randStamina = rand.nextInt(11);
		int randDexterity = rand.nextInt(11);
		if (randStrength == 0)
		{
			randStrength++;
		}
		if (randIntellect == 0)
		{
			randIntellect++;
		}
		if (randStamina == 0)
		{
			randStamina++;
		}
		if (randDexterity == 0)
		{
			randDexterity++;
		}
		Strength = randStrength;
		Intellect = randIntellect;
		Stamina = randStamina;
		Dexterity = randDexterity;
		Ego = 0;
		if (race.toUpperCase().equals("HUMAN"));
		{
			healthMax = 100;
			healthNow = 100;
			manaMax = 100;
			manaNow = 100;
			energyMax = 125;
			energyNow = 125;
		}
		if (race.toUpperCase().equals("ELF"));
		{
			healthMax = 75;
			healthNow = 75;
			manaMax = 125;
			manaNow = 125;
			energyMax = 125;
			energyNow = 125;
		}
		if (race.toUpperCase().equals("ORC"));
		{
			healthMax = 150;
			healthNow = 150;
			manaMax = 75;
			manaNow = 75;
			energyMax = 100;
			energyNow = 100;
		}
	}
	public static void rollStats()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randStrength = rand.nextInt(11);
		int randIntellect = rand.nextInt(11);
		int randStamina = rand.nextInt(11);
		int randDexterity = rand.nextInt(11);
		if (randStrength == 0)
		{
			randStrength++;
		}
		if (randIntellect == 0)
		{
			randIntellect++;
		}
		if (randStamina == 0)
		{
			randStamina++;
		}
		if (randDexterity == 0)
		{
			randDexterity++;
		}
		System.out.println();
		System.out.println("Strength: "+randStrength);
		System.out.println("Intellect: "+randIntellect);
		System.out.println("Stamina: "+randStamina);
		System.out.println("Dexterity: "+randDexterity);
		System.out.println();
		System.out.println("(R)EROLL or (C)ONTINUE?");
		System.out.print("CHOOSETH: ");
		String choice = scan.nextLine();
		if (choice.toUpperCase().equals("REROLL") || choice.toUpperCase().equals("R"))
		{
			rollStats();
		}
		else if (choice.toUpperCase().equals("CONTINUE") || choice.toUpperCase().equals("C"))
		{
			Strength = randStrength;
			Intellect = randIntellect;
			Stamina = randStamina;
			Dexterity = randDexterity;
			Ego = 0;
			if (race.toUpperCase().equals("HUMAN"));
			{
				healthMax = 100;
				healthNow = 100;
				manaMax = 100;
				manaNow = 100;
				energyMax = 125;
				energyNow = 125;
			}
			if (race.toUpperCase().equals("ELF"));
			{
				healthMax = 75;
				healthNow = 75;
				manaMax = 125;
				manaNow = 125;
				energyMax = 125;
				energyNow = 125;
			}
			if (race.toUpperCase().equals("ORC"));
			{
				healthMax = 150;
				healthNow = 150;
				manaMax = 75;
				manaNow = 75;
				energyMax = 100;
				energyNow = 100;
			}
			System.out.println();
		}
		else
		{
			System.out.println("NOT A VALID CHOICE ALSO IM CLOSING YOUR PROGRAM");
			System.exit(0);
		}
		
	}
	public static void levelUp()
	{
		Player.level++;
		System.out.println("You level up! You are now level "+Player.level);
		if (race.toUpperCase().equals("HUMAN"));
		{
			healthMax = 100+(Player.level*10);
			healthNow = 100+(Player.level*10);
			manaMax = 100+(Player.level*10);
			manaNow = 100+(Player.level*10);
			energyMax = 125+(Player.level*10);
			energyNow = 125+(Player.level*10);
		}
		if (race.toUpperCase().equals("ELF"));
		{
			healthMax = 75+(Player.level*15);
			healthNow = 75+(Player.level*15);
			manaMax = 125+(Player.level*25);
			manaNow = 125+(Player.level*25);
			energyMax = 125+(Player.level*10);
			energyNow = 125+(Player.level*10);
		}
		if (race.toUpperCase().equals("ORC"));
		{
			healthMax = 150+(Player.level*10);
			healthNow = 150+(Player.level*10);
			manaMax = 75+(Player.level*10);;
			manaNow = 75+(Player.level*10);;
			energyMax = 100+(Player.level*15);;
			energyNow = 100+(Player.level*15);;
		}
		System.out.println();
		System.out.println("Assign your stats!");
		int statPoints = 0;
		if (Ego >= 0)
		{
			statPoints = 3;
		}
		if (Ego >= 10)
		{
			statPoints = 4;
		}
		if (Ego >= 20)
		{
			statPoints = 5;
		}
		if (Ego >= 30)
		{
			statPoints = 6;
		}
		if (Ego >= 40)
		{
			statPoints = 7;
		}
		if (Ego >= 50)
		{
			statPoints = 8;
		}
		statAssignment(statPoints);
	}
	public static void statAssignment(int statPoints)
	{
		while (statPoints > 0)
		{
			System.out.println("Current stat points: "+statPoints);
			System.out.println();
			System.out.println("Current (Str)ength: "+Strength);
			System.out.println("Current (Int)ellect: "+Intellect);
			System.out.println("Current (Sta)mina: "+Stamina);
			System.out.println("Current (Dex)terity: "+Dexterity);
			System.out.println("Current Ego: "+Ego);
			System.out.println();
			System.out.print("INCREASE WHICH STAT: ");
			Scanner scan = new Scanner(System.in);
			String statChoice = scan.nextLine();
			if (statChoice.toUpperCase().equals("STRENGTH")||statChoice.toUpperCase().equals("STR"))
			{
				System.out.print("INCREASE BY HOW MUCH: ");
				int increaseChoice = scan.nextInt();
				if (increaseChoice > statPoints)
				{
					System.out.println("Thou haveth not that many stat points!");
					System.out.println("Try again!");
					System.out.println();
					statAssignment(statPoints);
				}
				if (increaseChoice <= statPoints)
				{
					statPoints -= increaseChoice;
					if(statPoints > 0)
					{
						Strength += increaseChoice;
						System.out.println("Strength increased by "+increaseChoice+"!");
						System.out.println("You have points left over. ASSIGN SOME MOAR.");
						System.out.println();
						statAssignment(statPoints);
					}
					if(statPoints == 0)
					{
						Strength += increaseChoice;
						System.out.println("Strength increased by "+increaseChoice+"!");
						System.out.println("Returning to game...");
						System.out.println();
						Action.gotoLocation(Player.location);
					}
				}
			}
			if (statChoice.toUpperCase().equals("INTELLECT")||statChoice.toUpperCase().equals("INT"))
			{
				System.out.print("INCREASE BY HOW MUCH: ");
				int increaseChoice = scan.nextInt();
				if (increaseChoice > statPoints)
				{
					System.out.println("Thou haveth not that many stat points!");
					System.out.println("Try again!");
					System.out.println();
					statAssignment(statPoints);
				}
				if (increaseChoice <= statPoints)
				{
					statPoints -= increaseChoice;
					if(statPoints > 0)
					{
						Intellect += increaseChoice;
						System.out.println("Intellect increased by "+increaseChoice+"!");
						System.out.println("You have points left over. ASSIGN SOME MOAR.");
						System.out.println();
						statAssignment(statPoints);
					}
					if(statPoints == 0)
					{
						Intellect += increaseChoice;
						System.out.println("Intellect increased by "+increaseChoice+"!");
						System.out.println("Returning to game...");
						System.out.println();
						Action.gotoLocation(Player.location);
					}
				}
			}
			if (statChoice.toUpperCase().equals("STAMINA")||statChoice.toUpperCase().equals("STA"))
			{
				System.out.print("INCREASE BY HOW MUCH: ");
				int increaseChoice = scan.nextInt();
				if (increaseChoice > statPoints)
				{
					System.out.println("Thou haveth not that many stat points!");
					System.out.println("Try again!");
					System.out.println();
					statAssignment(statPoints);
				}
				if (increaseChoice <= statPoints)
				{
					if(statPoints > 0)
					{
						statPoints -= increaseChoice;
						Stamina += increaseChoice;
						System.out.println("Stamina increased by "+increaseChoice+"!");
						System.out.println("You have points left over. ASSIGN SOME MOAR.");
						System.out.println();
						statAssignment(statPoints);
					}
					if(statPoints == 0)
					{
						Stamina += increaseChoice;
						System.out.println("Stamina increased by "+increaseChoice+"!");
						System.out.println("Returning to game...");
						System.out.println();
						Action.gotoLocation(Player.location);
					}
				}
			}
			if (statChoice.toUpperCase().equals("DEXTERITY")||statChoice.toUpperCase().equals("DEX"))
			{
				System.out.print("INCREASE BY HOW MUCH: ");
				int increaseChoice = scan.nextInt();
				if (increaseChoice > statPoints)
				{
					System.out.println("Thou haveth not that many stat points!");
					System.out.println("Try again!");
					System.out.println();
					statAssignment(statPoints);
				}
				if (increaseChoice <= statPoints)
				{
					statPoints -= increaseChoice;
					if(statPoints > 0)
					{
						Dexterity += increaseChoice;
						System.out.println("Dexterity increased by "+increaseChoice+"!");
						System.out.println("You have points left over. ASSIGN SOME MOAR.");
						System.out.println();
						statAssignment(statPoints);
					}
					if(statPoints == 0)
					{
						Dexterity += increaseChoice;
						System.out.println("Dexterity increased by "+increaseChoice+"!");
						System.out.println("Returning to game...");
						System.out.println();
						Action.gotoLocation(Player.location);
					}
				}
			}
			if (statChoice.toUpperCase().equals("EGO"))
			{
				System.out.println();
				System.out.println("AHAHAHA Thou can't increase that, SILLY!");
				System.out.println("TRY AGAIN");
				System.out.println();
				statAssignment(statPoints);
			}
			if (statChoice.toUpperCase().equals("NONE"))
			{
				System.out.println();
				System.out.println("WOW THOU ARE HARDCORETH.");
				System.out.println("Returning to game...");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			else
			{
				System.out.println();
				System.out.println("That is not a stat! TRY AGAIN.");
				System.out.println();
				statAssignment(statPoints);
			}
		}
	}
}
