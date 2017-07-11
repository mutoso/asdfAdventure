import java.util.Random;

public class Enemy 
{
	static int healthMax = 0;
	static int healthNow = 0;
	static int Armor = 0;
	static int attackPower = 0;
	static int dodge = 0;
	static String name = "";
	static String weaponName = "";
	
	Random rand = new Random();
	
	public static void Peasant()
	{
		name = "Peasant";
		weaponName = "fists";
		healthMax = 50;
		healthNow = 50;
		Armor = 10;
		attackPower = 10;
		dodge = 10;
//		String[] lootTable = new String[5];    WORK ON THIS
	}
}
