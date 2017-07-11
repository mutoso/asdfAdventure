public class Item 
{
	//lifesteal.
	//ADD FOOD AND POTIONS
	//and enchantments
	
	
	//String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int ITEMCOST, int STRENGTH, 
	//int INT, int STAM, int DEX, int DUKE, int SLOTX, int SLOTY
	
	
	String itemName = "";
	String itemDescription = "";
	boolean twoHanded;
	int type = 0;//Unequippable, Hat, Head, Necklace, Body, Belt, Pants, Boots, MainHand, OffHand
	int level = 0;
	int value = 0;
	int bonusArmor = 0;
	int bonusStrength = 0;
	int bonusIntellect = 0;
	int bonusStamina = 0;
	int bonusDexterity = 0;
	int bonusEgo = 0;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Armor
	  //--SETS--
		//Peasant Clothing
		  //Armor - 10
		  //Value - 10
		  //Ego	  - -5
	
		//Generic garment
		  //Armor - 
	      //Value -
	 	  //Str   -
	  	  //Int   -
	      //Sta   -
		  //Dex   -
		//Animal skin (OF EVERY KIND)
		  //Armor - 
	      //Value -
	      //Str   -
	      //Int   -
	      //Sta   -
	      //Dex   -
		//Proper clothing
	      //Armor - 
	      //Value -
	      //Str   -
	      //Int   -
	      //Sta   -
	      //Dex   -
		//Iron Armor
       	  //Armor - 
	      //Value -
	      //Str   -
	      //Int   -
	      //Sta   -
	      //Dex   -
		//Steel Armor (upgrades to white steel)
	 	  //Armor - 
		  //Value -
		  //Str   -
		  //Int   -
		  //Sta   -
		  //Dex   -
		//Gold Armor	
		  //Armor - 
    	  //Value -
		  //Str   -
    	  //Int   -
    	  //Sta   -
    	  //Dex   -
		//Titanium Armor
		  //Armor - 
	  	  //Value -
	  	  //Str   -
	  	  //Int   -
	  	  //Sta   -
	  	  //Dex   -
		//Bone Armor	
		  //Armor - 
		  //Value -
	  	  //Str   -
	  	  //Int   -
	  	  //Sta   -
	  	  //Dex   -
		//Glorious Armor
		  //Armor - 
	  	  //Value -
	  	  //Str   -
	  	  //Int   -
	  	  //Sta   -
	  	  //Dex   -
	
	
	
	//Weapons
	  //--TYPES--
		//
	
	//Hats
	
	//Quest items
	
	//Edibles
	
	//MISC
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// TODO 
	public Item()
	{
		itemName = "";
		itemDescription = "";
		twoHanded = false;
		type = 0;
		level = 0;
		value = 0;
		bonusStrength = 0;
		bonusIntellect = 0;
		bonusStamina = 0;
		bonusDexterity = 0;
		bonusEgo = 0;
	}
	
	public Item(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE) 
	{
		itemName = ITEMNAME;
		itemDescription = ITEMDESCRIPTION;
		twoHanded = HANDED;	
		level = LEVEL;
		type = TYPE;
		value = ITEMCOST;
		bonusStrength = STRENGTH;
		bonusIntellect = INT;
		bonusStamina = STAM;
		bonusDexterity = DEX;
		bonusEgo = DUKE;
	}

	
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String Name)
	{
		itemName = Name;
	}
	
	public String getItemDescription()
	{
		return itemDescription;
	}
	
	public void setItemDescription(String Name)
	{
		itemDescription = Name;
	}
	
	public Boolean getHanded()
	{
		return twoHanded;
	}
	
	public void setHanded(Boolean yea)
	{
		twoHanded = yea;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int yea)
	{
		level = yea;
	}
	
	public int getType()
	{
		return type;
	}
	
	public void setType(int yea)
	{
		type = yea;
	}
	
	public int getStrength()
	{
		return bonusStrength;
	}
	
	public void setStrength(int yea)
	{
		bonusStrength = yea;
	}
	
	public int getIntellect()
	{
		return bonusIntellect;
	}
	
	public void setIntellect(int yea)
	{
		bonusIntellect = yea;
	}
	
	public int getDexterity()
	{
		return bonusDexterity;
	}
	
	public void setDexterity(int yea)
	{
		bonusDexterity = yea;
	}
	
	public int getStamana()
	{
		return bonusStamina;
	}
	
	public void setStamana(int yea)
	{
		bonusStamina = yea;
	}
	
	public int getEgo()
	{
		return bonusEgo;
	}
	
	public void setEgo(int yea)
	{
		bonusEgo = yea;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int yea)
	{
		value = yea;
	}
	
	public static void give(Item item)
	{
		int[] yes = Item.searchEmptyInventory();
		Player.Inventory[yes[1]][yes[2]] = item;
	}
	
	//USE THIS ONE
	public static void give(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		int[] yes = Item.searchEmptyInventory();
		Player.Inventory[yes[1]][yes[2]] = item;
	}
	
	public static void givee(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		int[] yes = Item.searchEmptyArmor();
		Player.Armor[yes[1]] = item;
	}
	
	public static void giveh(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		int[] yes = Item.searchEmptyHats();
		Player.Hats[yes[1]] = item;
	}
	
	public static void give(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE, int pos1, int pos2)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		Player.Inventory[pos1][pos2] = item;
	}
	
	public static void givee(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE, int pos)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		Player.Armor[pos] = item;
	}
	
	public static void giveh(String ITEMNAME, String ITEMDESCRIPTION, boolean HANDED, int LEVEL, int TYPE, int ITEMCOST, int STRENGTH, int INT, int STAM, int DEX, int DUKE, int pos)
	{
		Item item = new Item(ITEMNAME, ITEMDESCRIPTION, HANDED, LEVEL, TYPE, ITEMCOST, STRENGTH, INT, STAM, DEX, DUKE);
		Player.Hats[pos] = item;
	}
	
	public static void remove(String itemname)
	{
		int[] yes = Item.search(itemname);
		if(yes == null)
		{
			System.out.println("Item not found");
		}
		else
		{
			if(yes[0] == 0)
			{
				Player.Hats[yes[1]] = null;
			}
			if(yes[0] == 1)
			{
				Player.Armor[yes[1]] = null;
			}
			if(yes[0] == 2)
			{
				Player.Inventory[yes[1]][yes[2]] = null;
			}
		}
	}
	
	public static void inspect(String itemname)
	{
		System.out.println();
		int[] yes = Item.search(itemname);
		if(yes[0] == 0)
		{
			System.out.println(Player.Hats[yes[1]].getItemName());
			System.out.println(Player.Hats[yes[1]].getItemDescription());
			if(Player.Hats[yes[1]].getHanded() == true)
			{
				System.out.println("This item's heft takes two hands to carry");
			}
			if(Player.Hats[yes[1]].getType() != 0)
			{
				if(Player.Hats[yes[1]].getHanded() == false)
				{
					System.out.println("This item's heft takes but a single hand to carry");
				}
			}
			System.out.println("This item requires a level of: " +Player.Hats[yes[1]].getLevel());
			if(Player.Hats[yes[1]].getLevel()>Player.level)
			System.out.println("Thou require a higher level");
			if(Player.Hats[yes[1]].getLevel()<=Player.level)
			System.out.println("Thine level is high enough");
			System.out.println("This item is valued at " +Player.Hats[yes[1]].getValue()+ " gold.");
			if(Player.Hats[yes[1]].getStrength() != 0)
			System.out.println("This item grants " +Player.Hats[yes[1]].getStrength()+" additional strength");
			if(Player.Hats[yes[1]].getIntellect() != 0)
			System.out.println("This item grants " +Player.Hats[yes[1]].getIntellect()+" additional intellect");
			if(Player.Hats[yes[1]].getStamana() != 0)
			System.out.println("This item grants " +Player.Hats[yes[1]].getStamana()+" additional stamana");
			if(Player.Hats[yes[1]].getDexterity() != 0)
			System.out.println("This item grants " +Player.Hats[yes[1]].getDexterity()+" additional dexterity");
			if(Player.Hats[yes[1]].getEgo() != 0)
			System.out.println("This item grants " +Player.Hats[yes[1]].getEgo()+" additional ego");
		}
		if(yes[0] == 1)
		{
			System.out.println(Player.Armor[yes[1]].getItemName());
			System.out.println(Player.Armor[yes[1]].getItemDescription());
			if(Player.Armor[yes[1]].getHanded() == true)
			{
				System.out.println("This item's heft takes two hands to carry");
			}
			if(Player.Armor[yes[1]].getHanded() == false)
			{
				System.out.println("This item's heft takes but a single hand to carry");
			}
			System.out.println("This item requires a level of: " +Player.Armor[yes[1]].getLevel());
			if(Player.Armor[yes[1]].getLevel()>Player.level)
			System.out.println("Thou require a higher level");
			if(Player.Armor[yes[1]].getLevel()<=Player.level)
			System.out.println("Thine level is high enough");
			System.out.println("This item is valued at " +Player.Armor[yes[1]].getValue()+ " gold.");
			if(Player.Armor[yes[1]].getStrength() != 0)
			System.out.println("This item grants " +Player.Armor[yes[1]].getStrength()+" additional strength");
			if(Player.Armor[yes[1]].getIntellect() != 0)
			System.out.println("This item grants " +Player.Armor[yes[1]].getIntellect()+" additional intellect");
			if(Player.Armor[yes[1]].getStamana() != 0)
			System.out.println("This item grants " +Player.Armor[yes[1]].getStamana()+" additional stamana");
			if(Player.Armor[yes[1]].getDexterity() != 0)
			System.out.println("This item grants " +Player.Armor[yes[1]].getDexterity()+" additional dexterity");
			if(Player.Armor[yes[1]].getEgo() != 0)
			System.out.println("This item grants " +Player.Armor[yes[1]].getEgo()+" additional ego");
		}
		if(yes[0] == 2)
		{
			System.out.println(Player.Inventory[yes[1]][yes[2]].getItemName());
			System.out.println(Player.Inventory[yes[1]][yes[2]].getItemDescription());
			if(Player.Inventory[yes[1]][yes[2]].getHanded() == true)
			{
				System.out.println("This item's heft takes two hands to carry");
			}
			if(Player.Inventory[yes[1]][yes[2]].getHanded() == false)
			{
				System.out.println("This item's heft takes but a single hand to carry");
			}
			System.out.println("This item requires a level of: " +Player.Inventory[yes[1]][yes[2]].getLevel());
			if(Player.Inventory[yes[1]][yes[2]].getLevel()>Player.level)
			System.out.println("Thou require a higher level");
			if(Player.Inventory[yes[1]][yes[2]].getLevel()<=Player.level)
			System.out.println("Thine level is high enough");
			System.out.println("This item is valued at " +Player.Inventory[yes[1]][yes[2]].getValue()+ " gold.");
			if(Player.Inventory[yes[1]][yes[2]].getStrength() != 0)
			System.out.println("This item grants " +Player.Inventory[yes[1]][yes[2]].getStrength()+" additional strength");
			if(Player.Inventory[yes[1]][yes[2]].getIntellect() != 0)
			System.out.println("This item grants " +Player.Inventory[yes[1]][yes[2]].getIntellect()+" additional intellect");
			if(Player.Inventory[yes[1]][yes[2]].getStamana() != 0)
			System.out.println("This item grants " +Player.Inventory[yes[1]][yes[2]].getStamana()+" additional stamana");
			if(Player.Inventory[yes[1]][yes[2]].getDexterity() != 0)
			System.out.println("This item grants " +Player.Inventory[yes[1]][yes[2]].getDexterity()+" additional dexterity");
			if(Player.Inventory[yes[1]][yes[2]].getEgo() != 0)
			System.out.println("This item grants " +Player.Inventory[yes[1]][yes[2]].getEgo()+" additional ego");
		}
	}
	
	public static void giveArmor(String itemName)
	{
		//Unequippable, Hat, Head, Necklace, Body, Belt, Pants, Boots, MainHand, OffHand
		if (itemName.equals("PeasantHead"))
		{
			Item.give("Peasant Coif", "An old cloth coif made for PEASANTS and KNAVES", false, 1, 2, 3, 0, 0, 0, 0, -2);
		}
		if (itemName.equals("PeasantNecklace"))
		{
			Item.give("Peasant String Necklace", "A piece of string that PEASANTS and KNAVES call a necklace", false, 1, 3, 1, 0, 0, 0, 0, -1);
		}
		if (itemName.equals("PeasantChest"))
		{
			Item.give("Peasant Tunic", "An old tattered tunic typical for PEASANTS and KNAVES", false, 1, 4, 5, 0, 0, 0, 0, -4);
		}
		if (itemName.equals("PeasantBelt"))
		{
			Item.give("Peasant Belt", "A \"belt\" fashioned out of a piece of rope", false, 1, 5, 3, 0, 0, 0, 0, -1);
		}
		if (itemName.equals("PeasantPants"))
		{
			Item.give("Peasant Pantaloons", "An old tattered cloth pant garment made for PEASANTS and KNAVES", false, 1, 6, 4, 0, 0, 0, 0, -4);
		}
		if (itemName.equals("PeasantBoots"))
		{
			Item.give("Peasant Sandals", "A pair of sandals that PEASANTS and KNAVES do their PEASANT work in", false, 1, 7, 4, 0, 0, 0, 0, -2);
		}
	}
	
	public static void giveWeapon(String itemName)
	{
		
	}
	
	public static void giveHat(String itemName)
	{
		
	}
	
	public static void giveQuestItem(String itemName)
	{
		
	}

	public static void giveEdible(String itemName)
	{
		
	}
	
	public static void giveMisc(String itemName)
	{
		
	}
	
	
	public static int[] search(String Name)
	{
		for(int x=0; x<=2; x++)
		{
			if (Player.Hats[x] != null)
			{
				if (Player.Hats[x].getItemName().equalsIgnoreCase(Name))
				{
					int[] array = new int[3];
					array[0] = 0;
					array[1] = x;
					array[2] = 0;
					return array;
				}
			}
		}
		for(int x=0; x<=7; x++)
		{
			if (Player.Armor[x] != null)
			{
				if (Player.Armor[x].getItemName().equalsIgnoreCase(Name))
				{
					int[] array = new int[3];
					array[0] = 1;
					array[1] = x;
					array[2] = 0;
					return array;
				}
			}
		}
		for(int x = 0; x<=2; x++)
		{
			for(int y=0; y<=7; y++)
			{
				if (Player.Inventory[x][y] != null)
				{
					if (Player.Inventory[x][y].getItemName().equalsIgnoreCase(Name))
					{
						int[] array = new int[3];
						array[0] = 2;
						array[1] = x;
						array[2] = y;
						return array;
					}
				}
			}
		}
		return null;
	}
	public static int[] searchEquips(String Name)
	{
		for(int x=0; x<=2; x++)
		{
			if (Player.Hats[x] != null)
			{
				if (Player.Hats[x].getItemName().equalsIgnoreCase(Name))
				{
					int[] array = new int[3];
					array[0] = 0;
					array[1] = x;
					array[2] = 0;
					return array;
				}
			}
		}
		for(int x=0; x<=7; x++)
		{
			if (Player.Armor[x] != null)
			{
				if (Player.Armor[x].getItemName().equalsIgnoreCase(Name))
				{
					int[] array = new int[3];
					array[0] = 1;
					array[1] = x;
					array[2] = 0;
					return array;
				}
			}
		}
		return null;
	}
	public static int[] searchinv(String Name)
	{
		for(int x = 0; x<=2; x++)
		{
			for(int y=0; y<=7; y++)
			{
				if (Player.Inventory[x][y] != null)
				{
					if (Player.Inventory[x][y].getItemName().equalsIgnoreCase(Name))
					{
						int[] array = new int[3];
						array[0] = 2;
						array[1] = x;
						array[2] = y;
						return array;
					}
				}
			}
		}
		return null;
	}
	public static int[] searchEmptyHats()
	{
		for(int x=0; x<=2; x++)
		{
			if (Player.Hats[x] == null)
			{
					int[] array = new int[3];
					array[0] = 0;
					array[1] = x;
					array[2] = 0;
					return array;
			}
		}
		return null;
	}
	public static int[] searchEmptyArmor()
	{
		for(int x=0; x<=7; x++)
		{
			if (Player.Armor[x] == null)
			{
					int[] array = new int[3];
					array[0] = 1;
					array[1] = x;
					array[2] = 0;
					return array;
				
			}
		}
		return null;
	}
	public static int[] searchEmptyInventory()
		{
			for(int x = 0; x<=2; x++)
			{
				for(int y=0; y<=7; y++)
				{
					if (Player.Inventory[x][y] == null)
					{
							int[] array = new int[3];
							array[0] = 2;
							array[1] = x;
							array[2] = y;
							return array;
						
					}
				}
			}
			return null;
		}
	//Unequipable, Hat, Head, Necklace, Body, Belt, Pants, Boots, MainHand, OffHand
	public static void equip(String Itemname)
	{
		int[] pos = Item.searchinv(Itemname);
		if(pos == null)
		{
			Action.println("Item not found");
		}
		else
		{
			int type = Player.Inventory[pos[1]][pos[2]].getType();
			if(type == 0)
			{
				Action.println("This item cannot be equipped");
				
			}
			if(type == 1)
			{
				int[] pos2 = Item.searchEmptyHats();
				if(pos2 == null)
				{
					Action.println("More than three hats? That's just silly.");
				}
				else
				{
					if(Player.Inventory[pos[1]][pos[2]].getLevel()>Player.level)
					{
						System.out.println("You aren't quite sure how to wear this equipment.");
					}
					if(Player.Inventory[pos[1]][pos[2]].getLevel()<=Player.level)
					{
						if(Player.Hats[pos2[1]] != null)
						{
							Item temp = Player.Hats[pos2[1]];
							Player.Strength -= temp.getStrength();
							Player.Intellect -= temp.getIntellect();
							Player.Stamina -= temp.getStamana();
							Player.Dexterity -= temp.getDexterity();
							Player.Ego -= temp.getEgo();
							Player.Hats[pos2[1]] = Player.Inventory[pos[1]][pos[2]]; 
							Player.Strength += Player.Hats[pos2[1]].getStrength();
							Player.Intellect += Player.Hats[pos2[1]].getIntellect();
							Player.Stamina += Player.Hats[pos2[1]].getStamana();
							Player.Dexterity += Player.Hats[pos2[1]].getDexterity();
							Player.Ego += Player.Hats[pos2[1]].getEgo();
							Player.Inventory[pos[1]][pos[2]] = temp;
						}
						else
						{
							Player.Hats[pos2[1]] = Player.Inventory[pos[1]][pos[2]]; 
							Player.Strength += Player.Hats[pos2[1]].getStrength();
							Player.Intellect += Player.Hats[pos2[1]].getIntellect();
							Player.Stamina += Player.Hats[pos2[1]].getStamana();
							Player.Dexterity += Player.Hats[pos2[1]].getDexterity();
							Player.Ego += Player.Hats[pos2[1]].getEgo();
							Player.Inventory[pos[1]][pos[2]] = null;
						}
					}
				}
			}
			if(type == 2||type == 3||type == 4||type == 5||type == 6||type == 7||type == 8||type == 9)
			{
				if(Player.Armor[type-2] != null)
				{
					if(Player.Armor[type-2].getItemName().equals("Encumbered"))
					{
						Action.println("Your offhand is currently encumbered");
					}
					else
					{
						if(Player.Inventory[pos[1]][pos[2]].getLevel()>Player.level)
						{
							System.out.println("You aren't quite sure how to wear this equipment.");
						}
						if(Player.Inventory[pos[1]][pos[2]].getLevel()<=Player.level)
						{
							if (type == 6)
							{
								Player.isNaked = false;
							}
							Item temp = Player.Armor[type-2];
							Player.Strength -= temp.getStrength();
							Player.Intellect -= temp.getIntellect();
							Player.Stamina -= temp.getStamana();
							Player.Dexterity -= temp.getDexterity();
							Player.Ego -= temp.getEgo();
							Player.Armor[type-2] = Player.Inventory[pos[1]][pos[2]];
							Player.Strength += Player.Armor[type-2].getStrength();
							Player.Intellect += Player.Armor[type-2].getIntellect();
							Player.Stamina +=Player.Armor[type-2].getStamana();
							Player.Dexterity += Player.Armor[type-2].getDexterity();
							Player.Ego += Player.Armor[type-2].getEgo();
							if(temp.getItemName().equals("Encumbered"))
							{
								
							}
							else
							{	
								Player.Inventory[pos[1]][pos[2]] = temp;
								if(type == 8)
								{
									Item.give("Encumbered", "Your offhand has been encumbered by a two handed weapon", false, 0, 9, 0, 0, 0, 0, 0, 0);
									Item.equip("Encumbered");
									if(Player.Armor[type-2].getHanded() != true)
									{
										Player.Armor[7] = null;
										Item.remove("Encumbered");
									}
								}
							}
						}
					}
				}
				else
				{
					if(Player.Inventory[pos[1]][pos[2]].getLevel()>Player.level)
					{
						System.out.println("You aren't quite sure how to wear this equipment.");
					}
					if(Player.Inventory[pos[1]][pos[2]].getLevel()<=Player.level)
					{
						Player.Armor[type-2] = Player.Inventory[pos[1]][pos[2]];
						Player.Strength += Player.Armor[type-2].getStrength();
						Player.Intellect += Player.Armor[type-2].getIntellect();
						Player.Stamina +=Player.Armor[type-2].getStamana();
						Player.Dexterity += Player.Armor[type-2].getDexterity();
						Player.Ego += Player.Armor[type-2].getEgo();
						Player.Inventory[pos[1]][pos[2]] = null;	
						if(type == 8 && Player.Armor[type-2].getHanded())
						{
							Item.give("Encumbered", "Your offhand has been encumbered", false, 0, 9, 0, 0, 0, 0, 0, 0);
							Item.equip("Encumbered");
						}
						if (type == 6)
						{
							Player.isNaked = false;
						}
					}
				}
			}
		}
	}
	
	public static void unEquip(String Itemname)
	{
		int[] pos1 = Item.searchEquips(Itemname);
		int[] pos2 = Item.searchEmptyInventory();
		if(pos1 == null)
		{
			Action.println("Item not found");
		}
		if(pos2 == null)
		{
			Action.println("Inventory full");
		}
		else
		{
			if(pos1[0] == 0)
			{
				Player.Inventory[pos2[1]][pos2[2]] = Player.Hats[pos1[1]];
				Player.Strength -= Player.Hats[pos1[1]].getStrength();
				Player.Intellect -= Player.Hats[pos1[1]].getIntellect();
				Player.Stamina -= Player.Hats[pos1[1]].getStamana();
				Player.Dexterity -= Player.Hats[pos1[1]].getDexterity();
				Player.Ego -= Player.Hats[pos1[1]].getEgo();
				Player.Hats[pos1[1]] = null;
			}
			if(pos1[0] == 1)
			{
				if(Player.Armor[pos1[1]].getItemName().equals("Encumbered"))
				{
					Action.println("Your only course of action is to remove the whole limb.");
					Player.death();
				}
				else
				{
					Player.Inventory[pos2[1]][pos2[2]] = Player.Armor[pos1[1]];
					Player.Strength -= Player.Armor[pos1[1]].getStrength();
					Player.Intellect -= Player.Armor[pos1[1]].getIntellect();
					Player.Stamina -= Player.Armor[pos1[1]].getStamana();
					Player.Dexterity -= Player.Armor[pos1[1]].getDexterity();
					Player.Ego -= Player.Armor[pos1[1]].getEgo();
					Player.Armor[pos1[1]] = null;
					if (pos1[1] == 4)
					{
						Player.isNaked = true;
					}
				}
			}
		}
	}


}
