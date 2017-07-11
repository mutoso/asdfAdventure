import java.util.Random;
import java.util.Scanner;

public class Fight 
{
	static String critMessage = "";
	static boolean startedFight = false;
	public static void borders(String fightState)
	{
		if (fightState.equals("entering"))
		{
			System.out.println("                 /\\");
			System.out.println("                /  |");
			System.out.println("  *            /  /________________________________________________");
			System.out.println(" (O)77777777777)  7                                                `~~--__");
			System.out.println("8OO>>>>>>>>>>>>] <=============ENTERING COMBAT===============>          __---");
			System.out.println(" (O)LLLLLLLLLLL)  L________________________________________________.--~~");
			System.out.println("  *            \\  \\");
			System.out.println("                \\  |");
			System.out.println("                 \\/");
		}
		if (fightState.equals("exiting"))
		{
			System.out.println("                 /\\");
			System.out.println("                /  |");
			System.out.println("  *            /  /________________________________________________");
			System.out.println(" (O)77777777777)  7                                                `~~--__");
			System.out.println("8OO>>>>>>>>>>>>] <=============EXITING COMBAT===============>          __---");
			System.out.println(" (O)LLLLLLLLLLL)  L________________________________________________.--~~");
			System.out.println("  *            \\  \\");
			System.out.println("                \\  |");
			System.out.println("                 \\/");
		}
		
	}
	public static void doFight() throws InterruptedException
	{
		if (Fight.startedFight == false)
		{
			Fight.startedFight = true;
			System.out.println();
			borders("entering");
			System.out.println();
			System.out.println("		Thou art fighting a "+Enemy.name+"!");
		}
		while(Player.healthNow > 0 && Enemy.healthNow > 0)
		{
			System.out.println();
			System.out.println("	ATTACK			"+Enemy.name.toUpperCase()+" health: "+Enemy.healthNow+"/"+Enemy.healthMax);
			System.out.println("	MAGIC");
			System.out.println("	ITEMS			Thine health: "+Player.healthNow+"/"+Player.healthMax);
			System.out.println("	INSPECT ENEMY		Thine mana: "+Player.manaNow+"/"+Player.manaMax);
			System.out.println("	FLEE			Thine energy: "+Player.energyNow+"/"+Player.energyMax);
			System.out.println();
			System.out.print("		CHOOSETH: ");
			Scanner scan = new Scanner(System.in);
			String fightChoice = scan.nextLine();
			if (fightChoice.toUpperCase().equals("ATTACK")||fightChoice.toUpperCase().equals("A"))
			{
				
				
				//YOUR TURN
				System.out.println();
				System.out.print("		Thou swingeth thine weaponName at the "+Enemy.name.toUpperCase()+".");Thread.sleep(1000);
				System.out.print(".");Thread.sleep(1000);
				System.out.println(".");Thread.sleep(1000);
				Random rand = new Random();
				int enemyDodge = rand.nextInt(99)+1;
				if (enemyDodge <= Enemy.dodge)
				{
					System.out.println("		The "+Enemy.name.toUpperCase()+" dodgeth thine attack!");
				}
				else
				{
					int yourHit = Player.generateHit();
					Enemy.healthNow -= yourHit;
					if (Enemy.healthNow <= 0)
					{
						System.out.println("		Thou hath struck down the "+Enemy.name.toUpperCase()+"!");
						borders("exiting");
						System.out.println();
						Action.gotoLocation(Player.location);
					}
					else
					{
						System.out.println("		Thou striketh the "+Enemy.name.toUpperCase()+" for "+yourHit+" damage!");
						if (critMessage.equals("Thou striketh a critical hit!"))
						{
							System.out.println("		"+critMessage);
						}
						System.out.println("		The "+Enemy.name.toUpperCase()+" now has "+Enemy.healthNow+" health.");
					}
				}
				
				
				//ENEMY TURN
				//enemy hit being generated here
				//enemy hit literally equals the rand number generated plus its current attack power (MAKE THIS BETTER)
				String critMessage = "";
				boolean isCrit = false;
				int baseHit = 0;
				int critHit = 0;
				int actualHit = 0;
				baseHit = rand.nextInt(10)+1;
				if (baseHit == 10)
				{
					critMessage = "Thou striketh a critical hit!";
					critHit = baseHit*2;
					isCrit = true;
				}
				if (isCrit == true)
				{
					critHit += Enemy.attackPower;
					Player.healthNow -= critHit;
					actualHit = critHit;
				}
				if (isCrit == false)
				{
					baseHit += Enemy.attackPower;
					Player.healthNow -= baseHit;
					actualHit = baseHit;
				}
				System.out.println();
				System.out.print("		The "+Enemy.name.toUpperCase()+" swingeth thine "+Enemy.weaponName+" at thou.");Thread.sleep(1000);
				System.out.print(".");Thread.sleep(1000);
				System.out.println(".");Thread.sleep(1000);
				int thineDodge = rand.nextInt(99)+1;
				if (thineDodge <= Player.Dexterity)
				{
					System.out.println("		Thou dodgeth the "+Enemy.name.toUpperCase()+"'S attack!");
				}
				else
				{
					if (Player.healthNow <= 0)
					{
						System.out.println("Thou hath fallen in battle!");
						Player.death();
					}
					else
					{
						System.out.println("		The "+Enemy.name.toUpperCase()+" striketh thou for "+actualHit+" damage!");
						if (critMessage.equals("The "+Enemy.name.toUpperCase()+" strikeths a critical hit!"))
						{
							System.out.println("		"+critMessage);
						}
						System.out.println("		Thou hath "+Player.healthNow+" health.");
						Fight.doFight();
					}
				}
			}
			if (fightChoice.toUpperCase().equals("MAGIC")||fightChoice.toUpperCase().equals("M"))
			{
				//later
			}
			if (fightChoice.toUpperCase().equals("ITEMS")||fightChoice.toUpperCase().equals("I"))
			{
				
			}
			if (fightChoice.toUpperCase().equals("INSPECT ENEMY")||fightChoice.toUpperCase().equals("INSPECT")||fightChoice.toUpperCase().equals("IE"))
			{
				Text.enemyInspection(Enemy.name);
				Fight.doFight();
			}
			if (fightChoice.toUpperCase().equals("FLEE")||fightChoice.toUpperCase().equals("F"))
			{
				System.out.println();
				System.out.println("		Thou promptly turn thine head and run away.");
				System.out.println();
				borders("exiting");
				System.out.println();
				Action.gotoLocation(Player.location);
			}	
			else
			{
				System.out.println();
				System.out.println("		Thine command is not recognized!");
				System.out.println();
			}
		}
	}
	/*public static void yourTurn()
	{
		System.out.print("Enter your hit: ");
		Scanner scan = new Scanner(System.in);
		int yourHit = scan.nextInt();
		Fight.enemyHealthNow -= yourHit;
		if (Fight.enemyHealthNow <= 0)
		{
			break;
		}
		else
		{
			System.out.println("The enemy now has "+Fight.enemyHealthNow+" health.");
		}
	}
	public static void hisTurn()
	{
		Random rand = new Random();
		int enemyHit = rand.nextInt(10)+1;
		System.out.println("The enemy strikes thou for "+enemyHit);
		Player.healthNow -= enemyHit;
		if (Player.healthNow <= 0)
		{
			break;
		}
		else
		{
			yourTurn();
		}
	}	*/
}
