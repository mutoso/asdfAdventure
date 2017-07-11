public class Text 
{
	public static void cityLookArounds()
	{
		if (Player.location.equals("Hamshirevilletowningtonvilleshiretonville"))
		{
			String townGateState = "";
			if (Player.townGate == true)
			{
				townGateState = "open";
			}
			if (Player.townGate == false)
			{
				townGateState = "closed";
			}
			System.out.println();
			System.out.println("Thou art standing in the center of Hamshirevilletowningvilleshiretonville currently.");
			System.out.println("As thou gaze around the gigantic flat town square in the center of Hamshire,");
			System.out.println("thou spoteth a big fountain, along with a bridge above thee spanning across");
			System.out.println("the upper levels of the city. One could really ADMIRE a town like this.");
			System.out.println("In thine immediate area thou spoteth a variety of shops and buildings such");
			System.out.println("as a TAVERN, an INN, a GENERAL STORE, and an EMPTY BUILDING, all of which look enterable.");
			System.out.println("Thou also spoteth the YE OLDE HAT STORE, one of the Empire's most proud exports.");
			System.out.println("Looking around some more, thou spoteth the town GATES through which the");
			System.out.println("cruel wilderness awaits. A single GUARD is stationed at the gates, protecting the city.");
			System.out.println("The city GATES are currently "+townGateState+".");
			System.out.println("Farther down the town thou spot stairs leading to the UPPER CITY, where");
			System.out.println("Thou spoteth the gigantic CASTLE gloriously towering over the city.");
			if (Quest.mainQuestPrologue == false)
			{
				System.out.println("As thou look around, thou spoteth the COURIER standing in the center of town.");
				System.out.println("He is staring you intently.. Maybe you should TALK to him..!");
			}
			if (Quest.mainQuestPrologue == true)
			{
				System.out.println("As thou look around, thou spoteth not another living soul in sight.");
				System.out.println("The town itself is gigantic, but it looks as if no one is currently inhabiting it.");	
			}
			if (Player.paperOnGround == true)
			{
				System.out.println("Thou also spoteth a PAPER on the ground in the middle of town...");
				System.out.println("Maybe thou should PICK it UP?");
			}
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (Player.location.toUpperCase().equals("TAVERN"))
		{
			System.out.println();
			System.out.println("Thou art standing in the TAVERN currently.");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("INN"))
		{
			System.out.println();
			System.out.println("Thou art standing in the INN currently.");
			System.out.println("There is an INNKEEPER in here whom you can TALK to.");
			System.out.println("There is a CHEST in the corner, guarded by the INNKEEPER.");
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("STORE"))
		{
			System.out.println();
			System.out.println("Thou art standing in the STORE currently...");
			System.out.println("Thou spoteth a SHOPKEEPER standing at the counter.");
			System.out.println("He is staring at thou with intent, WANTING TO SELL YOU GOODS.");
			System.out.println("Thou spoteth an array of weapons, armor, and various goods");
			System.out.println("covering all the walls of the STORE. Thou also spoeth");
			System.out.println("a CHEST and a LEVER behind the counter, guarded by the SHOPKEEPER.");
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("EMPTY BUILDING"))
		{
			System.out.println();
			System.out.println("Thou art standing in the middle of a gigantic building.");
			System.out.println("The building is completly empty. Thou art astounded about how empty it is.");
			System.out.println("The back of the building is completly unlit; it is a dark void of blackness.");
			if (Player.dwellerFled == false)
			{
				System.out.println("Within the void thou spoteth a faint glimpse of two eyes, peering at you");
				System.out.println("from the corner of the room. Thou thinketh there might be another person in here...");
				System.out.println("Maybe thou should CALL OUT into the blackness to see if anyones there..?");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (Player.dwellerFled == true)
			{
				System.out.println("Other than that, the room is completly empty. No living soul anywhere to be found.");
				System.out.println("The DWELLER is nowhere to be found... He might have fled.");
				Action.gotoLocation(Player.location);
			}
		}
		if (Player.location.toUpperCase().equals("GATES"))
		{
			String gateOption = "";
			if (Player.townGate == true)
			{
				gateOption = ", or LEAVE HAMSHIRE if thou want";
			}
			System.out.println();
			System.out.println("Thou art standing in front of the massive GATES currently.");
			if (Player.townGate == true)
			{
				System.out.println("The gates are currently open, thou can exit the city.");
			}
			if (Player.townGate == false)
			{
				System.out.println("The gates are currently closed, thou can not exit the city.");
			}
			System.out.println("There is a single guard stationed in front of the gate.");
			System.out.println("Thou can TALK to the guard stationed at the gate"+gateOption+".");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (Player.location.toUpperCase().equals("UPPER CITY"))
		{
			System.out.println();
			System.out.println("Thou art standing in the Upper City of Hamshire currently.");
			System.out.println("Thou art next to the massive CASTLE, which takes up a majority of the UPPER CITY.");
			System.out.println();
			System.out.println("// DESCRIBE THE CASTLE HERE");
			System.out.println();
			System.out.println("Thou spoeth a variety of different BUILDINGS surrounding you; thou also standeth");
			System.out.println("next to the gigantic MARKETPLACE which takes up a chunk of the UPPER CITY.");
			System.out.println("One of the BUILDINGS recognizible is the TOWER, looming over the mildly sized");
			System.out.println("town GRAVEYARD directly below it. Thou spoteth the town JAIL across the street");
			System.out.println("from that, and also an EMPTY BUILDING in the corner of the town.");
			System.out.println("Around the whole town thou spoteth a variety of HOUSES, all completly empty.");
			System.out.println("As thou look around, thou spoteth not another living soul in sight.");
			System.out.println("The town itself is gigantic, but it looks as if no one is currently inhabiting it.");
			System.out.println();
			Action.gotoLocation(Player.location);
		}
		if (Player.location.toUpperCase().equals("CASTLE OUTSIDE"))
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		if (Player.location.toUpperCase().equals("CASTLE INSIDE"))
		{
			System.out.println();
			System.out.println("Thou art standing in the KING's court inside of CASTLE HAMSHIRE currently");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		if (Player.location.toUpperCase().equals("MARKETPLACE"))
		{
			
		}
		if (Player.location.toUpperCase().equals("TOWER"))
		{
			
		}
		if (Player.location.toUpperCase().equals("GRAVERYARD"))
		{
			
		}
		if (Player.location.toUpperCase().equals("JAIL"))
		{
			
		}
	}
	public static void gridLookArounds()
	{
		
	}
	public static void enemyInspection(String enemyName)
	{
		if (enemyName.equals("Peasant"))
		{
			System.out.println();
			System.out.println("		Thou inspecteth the "+enemyName.toUpperCase()+"...");
			System.out.println();
		}
	}
	
	public static void conversations(String conversation)
	{
		
	}
}
