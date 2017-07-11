import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
public class Load 
{
	public static void slot(int slot)
	{
		//SAVES = NAME, RACE, CLASS, LEVEL, SAVE SLOT, PLAYER LOCATION, HEALTH (2 ints), MANA (2 ints), ENERGY (2 ints)
		//		  STATS (STRENGTH, INTELLECT, STAMINA, DEXTERITY, EGO)
				Path path = FileSystems.getDefault().getPath("Saves", "Save"+slot+".txt");
				File save = path.toFile();
				Scanner scn = null;
				try {
					scn = new Scanner(save);
				} catch (FileNotFoundException e) 
				{
					System.out.println("Attempted to access invalid save"); 
					RPGmain.gameStart();
				}
				


				Player.name = scn.nextLine();
				Player.race = scn.nextLine();
				Player.Class = scn.nextLine();
				Player.level = Integer.parseInt(scn.nextLine());
				Player.saveSlot = Integer.parseInt(scn.nextLine());
				Player.location = scn.nextLine();
				Player.gridLocation = scn.nextLine();
				
				Player.healthMax = Integer.parseInt(scn.nextLine());
				Player.healthNow = Integer.parseInt(scn.nextLine());
				Player.manaMax = Integer.parseInt(scn.nextLine());
				Player.manaNow = Integer.parseInt(scn.nextLine());
				Player.energyMax = Integer.parseInt(scn.nextLine());
				Player.energyNow = Integer.parseInt(scn.nextLine());
				
				Player.Strength = Integer.parseInt(scn.nextLine());
				Player.Intellect = Integer.parseInt(scn.nextLine());
				Player.Stamina = Integer.parseInt(scn.nextLine());
				Player.Dexterity = Integer.parseInt(scn.nextLine());
				Player.Ego = Integer.parseInt(scn.nextLine());
				
				Player.townGate = Boolean.parseBoolean(scn.nextLine());
				Player.castleClearance = Boolean.parseBoolean(scn.nextLine());
				Player.firstCastleVisit = Boolean.parseBoolean(scn.nextLine());
				Player.isNaked = Boolean.parseBoolean(scn.nextLine());
				Player.foundDweller = Boolean.parseBoolean(scn.nextLine());
				Player.dwellerFled = Boolean.parseBoolean(scn.nextLine());
				Player.inAGrid = Boolean.parseBoolean(scn.nextLine());
				Player.savedInGrid = Boolean.parseBoolean(scn.nextLine());
				Player.savedInLocation = Boolean.parseBoolean(scn.nextLine());
				Player.kingIsIn = Boolean.parseBoolean(scn.nextLine());
				Player.courierHurtFeelings = Boolean.parseBoolean(scn.nextLine());
				Player.paperOnGround = Boolean.parseBoolean(scn.nextLine());
				Player.inMainMenu = Boolean.parseBoolean(scn.nextLine());
				
				Player.scrollingQuestText = Boolean.parseBoolean(scn.nextLine());
				Player.mapHeight = Integer.parseInt(scn.nextLine());
				Player.mapWidth = Integer.parseInt(scn.nextLine());
				Player.mapSpwanX = Integer.parseInt(scn.nextLine());
				Player.mapSpwanY = Integer.parseInt(scn.nextLine());
				
				
				
				int counter = Integer.parseInt(scn.nextLine());
				int counter1 = Integer.parseInt(scn.nextLine());
				int counter2 = Integer.parseInt(scn.nextLine());
				for (int x = 0; x<counter; x++)
				{
					int pos = Integer.parseInt(scn.nextLine());
					String name = scn.nextLine();
					String desc = scn.nextLine();
					boolean handed = Boolean.parseBoolean(scn.nextLine());
					int level = Integer.parseInt(scn.nextLine());
					int type = Integer.parseInt(scn.nextLine());
					int itemcost = Integer.parseInt(scn.nextLine());
					int strength = Integer.parseInt(scn.nextLine());
					int intel = Integer.parseInt(scn.nextLine());
					int stam = Integer.parseInt(scn.nextLine());
					int dex = Integer.parseInt(scn.nextLine());
					int ego = Integer.parseInt(scn.nextLine());
					Item.giveh(name, desc, handed, type, level,  itemcost, strength, intel, stam, dex, ego, pos);
				}
				for (int x = 0; x<counter1; x++)
				{
					int pos = Integer.parseInt(scn.nextLine());
					String name = scn.nextLine();
					String desc = scn.nextLine();
					boolean handed = Boolean.parseBoolean(scn.nextLine());
					int level = Integer.parseInt(scn.nextLine());
					int type = Integer.parseInt(scn.nextLine());
					int itemcost = Integer.parseInt(scn.nextLine());
					int strength = Integer.parseInt(scn.nextLine());
					int intel = Integer.parseInt(scn.nextLine());
					int stam = Integer.parseInt(scn.nextLine());
					int dex = Integer.parseInt(scn.nextLine());
					int ego = Integer.parseInt(scn.nextLine());;
					Item.givee(name, desc, handed, type, level,  itemcost, strength, intel, stam, dex, ego, pos);
				}
				for (int x = 0; x<counter2; x++)
				{
					int pos = Integer.parseInt(scn.nextLine());
					int pos1 = Integer.parseInt(scn.nextLine());
					String name = scn.nextLine();
					String desc = scn.nextLine();
					boolean handed = Boolean.parseBoolean(scn.nextLine());
					int level = Integer.parseInt(scn.nextLine());
					int type = Integer.parseInt(scn.nextLine());
					int itemcost = Integer.parseInt(scn.nextLine());
					int strength = Integer.parseInt(scn.nextLine());
					int intel = Integer.parseInt(scn.nextLine());
					int stam = Integer.parseInt(scn.nextLine());
					int dex = Integer.parseInt(scn.nextLine());
					int ego = Integer.parseInt(scn.nextLine());
					Item.give(name, desc, handed, type, level, itemcost, strength, intel, stam, dex, ego, pos, pos1);
				}
				System.out.println("Loaded sucessfully!");
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
	public static void pickSlot()
	{
		Scanner scan = new Scanner(System.in);
		Path path1 = FileSystems.getDefault().getPath("Saves", "Save1.txt");
		File save1 = path1.toFile();
		if (save1.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save1);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String name = scn.nextLine();
			String race = scn.nextLine();
			String Class = scn.nextLine();
			int level = Integer.parseInt(scn.nextLine());
			
			System.out.println("SAVE SLOT 1: "+name.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 1: EMPTY");
		}
		
		
		
		
		Path path2 = FileSystems.getDefault().getPath("Saves", "Save2.txt");
		File save2 = path2.toFile();
		if (save2.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String name = scn.nextLine();
			String race = scn.nextLine();
			String Class = scn.nextLine();
			int level = Integer.parseInt(scn.nextLine());
			
			System.out.println("SAVE SLOT 2: "+name.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 2: EMPTY");
		}
		
		
		
		
		Path path3 = FileSystems.getDefault().getPath("Saves", "Save3.txt");
		File save3 = path3.toFile();
		if (save3.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save3);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String name = scn.nextLine();
			String race = scn.nextLine();
			String Class = scn.nextLine();
			int level = Integer.parseInt(scn.nextLine());
			
			System.out.println("SAVE SLOT 3: "+name.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 3: EMPTY");
		}
		
		
		
		
		Path path4 = FileSystems.getDefault().getPath("Saves", "Save4.txt");
		File save4 = path4.toFile();
		if (save4.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save4);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String name = scn.nextLine();
			String race = scn.nextLine();
			String Class = scn.nextLine();
			int level = Integer.parseInt(scn.nextLine());
			
			System.out.println("SAVE SLOT 4: "+name.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 4: EMPTY");
		}
		
		
		
		
		Path path5 = FileSystems.getDefault().getPath("Saves", "Save5.txt");
		File save5 = path5.toFile();
		if (save5.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save5);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String name = scn.nextLine();
			String race = scn.nextLine();
			String Class = scn.nextLine();
			int level = Integer.parseInt(scn.nextLine());
			
			System.out.println("SAVE SLOT 5: "+name.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 5: EMPTY");
		}
		
		System.out.print("CHOOSE THINE SLOT: ");
		int choice = scan.nextInt();
		
		slot(choice);
	}
}
