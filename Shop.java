
public class Shop 
{
	static String Shopname = ""; 
	static String Shoptype = "";
	Item[] Inventory = null;
	public Shop(String type)
	{
		Shoptype = type;
		if(Shoptype.equalsIgnoreCase("Magic"))
		{
			Item wand = new Item("Magic Wand", "A wand, wise and old", false, 2, 8, 10, 0, 20, 0, 0, 20);
			Item bow = new Item("Crystal Bow", "A bow, enchanted by the elves", true, 2, 8, 10, 0, 0, 0, 20, 20);
			Item[] item = {wand, bow};
			this.setInventory(item);
		}
	}
	public void setInventory(Item[] item)
	{
		Inventory = item;
	}
	public void getInventory()
	{
		for(int x = 0; x<Inventory.length; x++)
		{
			System.out.println(Inventory[x].getItemName()+": "+Inventory[x].getValue()+" Gold");
		}
	}
	public void inspect(String Name)
	{
		if(search(Name) != 1337)
		{
			System.out.println(Inventory[search(Name)].getItemName());
			System.out.println(Inventory[search(Name)].getItemDescription());
			if(Inventory[search(Name)].getHanded() == true)
			{
				System.out.println("This item's heft takes two hands to carry");
			}
			if(Inventory[search(Name)].getHanded() == false)
			{
				System.out.println("This item's heft takes but a single hand to carry");
			}
			System.out.println("This item is valued at " +Inventory[search(Name)].getValue());
			if(Inventory[search(Name)].getStrength() != 0)
				System.out.println("This item grants " +Inventory[search(Name)].getStrength()+" additional strength");
			if(Inventory[search(Name)].getIntellect() != 0)
				System.out.println("This item grants " +Inventory[search(Name)].getIntellect()+" additional intellect");
			if(Inventory[search(Name)].getStamana() != 0)
				System.out.println("This item grants " +Inventory[search(Name)].getStamana()+" additional stamana");
			if(Inventory[search(Name)].getDexterity() != 0)
				System.out.println("This item grants " +Inventory[search(Name)].getDexterity()+" additional dexterity");
			if(Inventory[search(Name)].getEgo() != 0)
				System.out.println("This item grants " +Inventory[search(Name)].getEgo()+" additional ego");
		}
		else
		{
			System.out.println("Item not found");
		}
	}
	public int search(String Name)
	{
		for(int x = 0; x<this.Inventory.length; x++)
		{
			if(this.Inventory[x].getItemName().equalsIgnoreCase(Name))
			{
				return x;
			}
		}
		return 1337;
	}
	public void purchase(String Name)
	{
		if(Inventory[search(Name)].getValue()<Player.Gold)
		{
			Player.Gold -= Inventory[search(Name)].getValue();
			Item.give(Inventory[search(Name)]);
			System.out.println("You recieve your item");
		}
		else
		{
			System.out.println("More gold is required");
		}
	}
}

