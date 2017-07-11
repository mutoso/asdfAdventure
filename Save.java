import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class Save 
{
	//SAVES = NAME, RACE, CLASS, LEVEL, SAVE SLOT, PLAYER LOCATION, HEALTH (2 ints), MANA (2 ints), ENERGY (2 ints)
	//		  STATS (STRENGTH, INTELLECT, STAMINA, DEXTERITY, EGO)
	public static void pickSlot()
	{
		String saveState = "Empty";
		String race = "Empty";
		String Class = "Empty";
		
		Scanner scan = new Scanner(System.in);
		Path path = FileSystems.getDefault().getPath("Saves", "Save1.txt");
		File save1 = path.toFile();//SAVE 1
		if (save1.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save1);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			saveState = scn.nextLine();
			race = scn.nextLine();
			Class = scn.nextLine();
			int level = scn.nextInt();
			
			System.out.println("SAVE SLOT 1: "+saveState.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 1: EMPTY");
		}
		Path path2 = FileSystems.getDefault().getPath("Saves", "Save2.txt");
		File save2 = path2.toFile();//SAVE 2
		if (save2.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			saveState = scn.nextLine();
			race = scn.nextLine();
			Class = scn.nextLine();
			int level = scn.nextInt();
			System.out.println("SAVE SLOT 2: "+saveState.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 2: EMPTY");
		}
		Path path3 = FileSystems.getDefault().getPath("Saves", "Save3.txt");
		File save3 = path3.toFile();//SAVE 3
		if (save3.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save3);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			saveState = scn.nextLine();
			race = scn.nextLine();
			Class = scn.nextLine();
			int level = scn.nextInt();
			System.out.println("SAVE SLOT 3: "+saveState.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 3: EMPTY");
		}
		Path path4 = FileSystems.getDefault().getPath("Saves", "Save4.txt");
		File save4 = path4.toFile();//SAVE 4
		if (save4.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save4);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			saveState = scn.nextLine();
			race = scn.nextLine();
			Class = scn.nextLine();
			int level = scn.nextInt();
			System.out.println("SAVE SLOT 4: "+saveState.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 4: EMPTY");
		}
		Path path5 = FileSystems.getDefault().getPath("Saves", "Save5.txt");
		File save5 = path5.toFile();//SAVE 5
		if (save5.exists()==true)
		{
			Scanner scn = null;
			try {
				scn = new Scanner(save5);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			saveState = scn.nextLine();
			race = scn.nextLine();
			Class = scn.nextLine();
			int level = scn.nextInt();
			System.out.println("SAVE SLOT 5: "+saveState.toUpperCase()+" (LEVEL "+level+" "+race+" "+Class+")");
		}
		else 
		{
			System.out.println("SAVE SLOT 5: EMPTY");
		}
		
		
		
		
		System.out.println();
		System.out.print("CHOOSE THINE SLOT: ");
		String choice = scan.nextLine();
		if (choice.toUpperCase().equals("SAVE SLOT 1") || choice.toUpperCase().equals("SLOT 1") || choice.toUpperCase().equals("1"))
		{
			Player.saveSlot = 1;
		}
		else if (choice.toUpperCase().equals("SAVE SLOT 2") || choice.toUpperCase().equals("SLOT 2") || choice.toUpperCase().equals("2"))
		{
			Player.saveSlot = 2;
		}
		else if (choice.toUpperCase().equals("SAVE SLOT 3") || choice.toUpperCase().equals("SLOT 3") || choice.toUpperCase().equals("3"))
		{
			Player.saveSlot = 3;
		}
		else if (choice.toUpperCase().equals("SAVE SLOT 4") || choice.toUpperCase().equals("SLOT 4") || choice.toUpperCase().equals("4"))
		{
			Player.saveSlot = 4;
		}
		else if (choice.toUpperCase().equals("SAVE SLOT 5") || choice.toUpperCase().equals("SLOT 5") || choice.toUpperCase().equals("5"))
		{
			Player.saveSlot = 5;
		}
		else
		{
			System.out.print("THATS NOT A VALID SLOT ALSO IM CLOSING THE PROGRAM FOR YOU THANKS BYE");
			System.exit(0);
		}
		
	}
	
	public static void slot(boolean autoSave)
	{
		
		File Get = new File(".\\Saves\\");
		
			if (!Get.exists())
			{
				Get.mkdir();
			}
			
				Path path = FileSystems.getDefault().getPath("Saves", "Save"+Player.saveSlot+".txt");
				File save = path.toFile();
				try {
					save.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				FileOutputStream out = null;
				try {
					out = new FileOutputStream(save);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				PrintStream out1 = new PrintStream(out);
				out1.println(Player.name);
				out1.println(Player.race);
				out1.println(Player.Class);
				out1.println(Player.level);
				out1.println(Player.saveSlot);
				out1.println(Player.location);
				out1.println(Player.gridLocation);
				
				out1.println(Player.healthMax);
				out1.println(Player.healthNow);
				out1.println(Player.manaMax);
				out1.println(Player.manaNow);
				out1.println(Player.energyMax);
				out1.println(Player.energyNow);
				
				out1.println(Player.Strength);
				out1.println(Player.Intellect);
				out1.println(Player.Stamina);
				out1.println(Player.Dexterity);
				out1.println(Player.Ego);
				
				out1.println(Player.townGate);
				out1.println(Player.castleClearance);
				out1.println(Player.firstCastleVisit);
				out1.println(Player.isNaked);
				out1.println(Player.foundDweller);
				out1.println(Player.dwellerFled);
				out1.println(Player.inAGrid);
				out1.println(Player.savedInGrid);
				out1.println(Player.savedInLocation);
				out1.println(Player.kingIsIn);
				out1.println(Player.courierHurtFeelings);
				out1.println(Player.paperOnGround);
				out1.println(Player.inMainMenu);
				
				out1.println(Player.scrollingQuestText);
				out1.println(Player.mapHeight);
				out1.println(Player.mapWidth);
				out1.println(Player.mapSpwanX);
				out1.println(Player.mapSpwanY);
				
				int counter = 0;
				for (int x=0; x<Player.Hats.length; x++)
				{
					{
						if(Player.Hats[x] != null)
						{
							counter++;
						}
					}
				}
				out1.println(counter);
				int counter1 = 0;
				for (int x=0; x<Player.Armor.length; x++)
				{
					{
						if(Player.Armor[x] != null)
						{
							counter1++;
						}
					}
				}
				out1.println(counter1);
				int counter2 = 0;
				for(int x = 0; x<=2; x++)
				{
					for(int y=0; y<=7; y++)
					{
						if(Player.Inventory[x][y] != null)
						{
							counter2++;
						}
					}
				}
				out1.println(counter2);
				for(int x=0; x<Player.Hats.length; x++)
				{
					if(Player.Hats[x] != null)
					{
						out1.println(x);
						out1.println(Player.Hats[x].getItemName());
						out1.println(Player.Hats[x].getItemDescription());
						out1.println(Player.Hats[x].getHanded());
						out1.println(Player.Hats[x].getLevel());
						out1.println(Player.Hats[x].getType());
						out1.println(Player.Hats[x].getValue());
						out1.println(Player.Hats[x].getStrength());
						out1.println(Player.Hats[x].getIntellect());
						out1.println(Player.Hats[x].getStamana());
						out1.println(Player.Hats[x].getDexterity());
						out1.println(Player.Hats[x].getEgo());
					}
					
				}
				for(int x=0; x<Player.Armor.length; x++)
				{
					if(Player.Armor[x] != null)
					{
						out1.println(x);
						out1.println(Player.Armor[x].getItemName());
						out1.println(Player.Armor[x].getItemDescription());
						out1.println(Player.Armor[x].getHanded());
						out1.println(Player.Armor[x].getLevel());
						out1.println(Player.Armor[x].getType());
						out1.println(Player.Armor[x].getValue());
						out1.println(Player.Armor[x].getStrength());
						out1.println(Player.Armor[x].getIntellect());
						out1.println(Player.Armor[x].getStamana());
						out1.println(Player.Armor[x].getDexterity());
						out1.println(Player.Armor[x].getEgo());
					}
				}
				for(int x = 0; x<=2; x++)
				{
					for(int y=0; y<=7; y++)
					{
						if(Player.Inventory[x][y] != null)
						{
							
							out1.println(x);
							out1.println(y);
							out1.println(Player.Inventory[x][y].getItemName());
							out1.println(Player.Inventory[x][y].getItemDescription());
							out1.println(Player.Inventory[x][y].getHanded());
							out1.println(Player.Inventory[x][y].getLevel());
							out1.println(Player.Inventory[x][y].getType());
							out1.println(Player.Inventory[x][y].getValue());
							out1.println(Player.Inventory[x][y].getStrength());
							out1.println(Player.Inventory[x][y].getIntellect());
							out1.println(Player.Inventory[x][y].getStamana());
							out1.println(Player.Inventory[x][y].getDexterity());
							out1.println(Player.Inventory[x][y].getEgo());
						}
					}
				}
				//SAVES = NAME, RACE, CLASS, LEVEL, SAVE SLOT, PLAYER LOCATION, HEALTH (2 ints), MANA (2 ints), ENERGY (2 ints)
				//		  STATS (STRENGTH, INTELLECT, STAMINA, DEXTERITY, EGO)
				if (autoSave == true)
				{
					System.out.println("Autosaving to Slot "+Player.saveSlot+"...");
					System.out.println("Save successful!");
					System.out.println();
				}
				if (autoSave == false)
				{
					System.out.println("Saving to Slot "+Player.saveSlot+"...");
					System.out.println("Save successful!");
					System.out.println();
				}
				
	}
}
