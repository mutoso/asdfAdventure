import java.util.Scanner;

public class Quest 
{
	static Scanner scan = new Scanner(System.in);
	
	
	//current quests
	static boolean mainQuestPrologue = false;
	static boolean emptyBuildingQuest = false;
	static boolean stumpQuest = false;
	
	
	public static void mainQuestPrologue()
	{
		Scanner scan = new Scanner(System.in);
		if (Player.courierHurtFeelings == false)
		{
			System.out.println();
			System.out.println("Thou walketh toward the COURIER in a full suit of gloriously shining armor.");
			System.out.println("He looks gallantly toward thee, opens his helmet, and gazes upon you with his glorious eyes.");
			System.out.println("\"Welcome to Hamshire, sire! I am but a lowly courier\" Says the COURIER...");
			System.out.println("\"I hath been waiting for thee to deliver thee a message! It is of utmost importance!\"");
			System.out.println("\"The message is as follows: Go see the king. He needs thine help!\"");
			System.out.println("\"The king can be foundeth in the massive CASTLE in the UPPER CITY. Thou can't miss it!\" the COURIER explains...");
			System.out.println("\"Take this piece of paper and SHOW it to the GUARD at the CASTLE. He'll know what to do...\"");
			System.out.println();
			System.out.println("TAKE THE PAPER? (Yes/No)");
			System.out.print("CHOOSETH: ");
			String takeChoice = scan.nextLine();
			if (takeChoice.toUpperCase().equals("YES")||takeChoice.toUpperCase().equals("Y"))
			{
				System.out.println();
				System.out.println("---QUEST ACCEPTED: \"PROLOGUE: TALK TO THE KING\"---");
				Quest.addQuest("PROLOGUE: TALK TO THE KING");
				Quest.mainQuestPrologue = true;
				System.out.println();
				System.out.println("The COURIER promptly hands you the paper.");
				System.out.println("Thou looketh at the paper. It is titled \"TODARIAN TAX QUIRY 001\"... How odd.");
				Item.give("TAX QUIRY", "TODARIAN TAX QUIRY 001", false, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.println("The COURIER then proceeds to lower his helmet, turn around, and run toward the massive CASTLE.");
				System.out.println("\"REMEMBER! Give it to the GUARD at the CASTLE!\" he yells to thou whilst running.");
				System.out.println("What an odd fellow. You could choose to do his quest, or not, if thou wanted.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (takeChoice.toUpperCase().equals("NO")||takeChoice.toUpperCase().equals("N"))
			{
				Player.courierHurtFeelings = true;
				System.out.println();
				System.out.println("The COURIER slowly redacts his arm, holding the paper still.");
				System.out.println("He is clearly crushed. He turns his head down and slowly walks away...");
				System.out.println("He returns to his corner in the town square, waiting to be TALKED to again.");
				System.out.println("Thou spot a single tear run down his face.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
		if (Player.courierHurtFeelings == true)
		{
			System.out.println();
			System.out.println("Thou walketh toward the COURIER again...");
			System.out.println("He looks toward thee with a glimpse of hope, and says");
			System.out.println("\"OH. Tis THOU again... Art thou here to accept my quest yet?\"");
			System.out.println();
			System.out.println("ACCEPT THE QUEST? (Yes/No)");
			System.out.print("CHOOSETH: ");
			String questChoice = scan.nextLine();
			if (questChoice.toUpperCase().equals("YES")||questChoice.toUpperCase().equals("Y"))
			{
				System.out.println();
				System.out.println("---QUEST ACCEPTED: \"PROLOGUE: TALK TO THE KING\"---");
				Quest.addQuest("PROLOGUE: TALK TO THE KING");
				Quest.mainQuestPrologue = true;
				System.out.println();
				System.out.println("\"YES! Thank thee!\" the COURIER says happily...");
				System.out.println("The COURIER promptly hands you the PAPER.");
				System.out.println("Thou looketh at the PAPER. It is titled \"TODARIAN TAX QUIRY 001\"... How odd.");
				Item.give("TAX QUIRY", "TODARIAN TAX QUIRY 001", false, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.println("\"Remember!\" The COURIER says, \"The KING can be found in the CASTLE\"");
				System.out.println("\"in the UPPER CITY! Talk to the GUARD and hand him this PAPER.\"");
				System.out.println("\"He will know what to do after that!\" He says.");
				System.out.println("The COURIER then turns around and proceeds to run toward the CASTLE.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			if (questChoice.toUpperCase().equals("NO")||questChoice.toUpperCase().equals("N"))
			{
				Player.paperOnGround = true;
				System.out.println();
				System.out.println("The COURIER throws the PAPER on the ground, bursts into tears and runs away..!");
				System.out.println("HE JUST WANTED YOU TO TAKE THE QUEST. NOW LOOK WHAT YOU'VE DONE!");
				System.out.println("The PAPER now lies in the center of town, waiting to be PICKED UP");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
	}
	
	//hmm. make it so if youre wearing armor a helmet he cant punch you in the face? mite b cool
	public static void emptyBuildingQuest()
	{
		System.out.println();
		System.out.println("\"AH! REALLY? GOOD!\" He says ecstatically");
		System.out.println("\"I havn't had anyone else offer to help in such a long time!\"");
		System.out.println("\"In fact, I havn't seen another living soul in 3 years! AAHHAHAAHH;_;\" He laughs maniacally..");
		System.out.println("\"So! Down to business. Your first objective is thus:\"");
		System.out.println("\"Deny the quest I am about to give you. That is it.\"");
		System.out.println("\"SO ADVENTURER, DOST THOU ACCEPT MY QUEST?\" He asks...");
		System.out.println();
		System.out.print("ACCEPT THE QUEST?: ");
		String questChoice = scan.nextLine();
		if (questChoice.toUpperCase().equals("NO"))
		{
			
		}
		if (questChoice.toUpperCase().equals("YES"))
		{
			System.out.println();
			System.out.println("The DWELLER looks at you and sighs...");
			System.out.println("\"Thou're such a fool...\" He says, shaking his head..");
			System.out.println("He starts to turn around and walk away, slowly.");
			System.out.println("BUT HE INSTANTLY TURNS AROUND AND PUNCHES YOU SQUARE IN THE FACE");
			System.out.println("Thou black out!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			System.out.println();
			System.out.println("Thou wakest up in the middle of HAMSHIRE, naked, damaged, and significantly less rich.");
			System.out.println();
			Player.dwellerFled = true;
			Player.healthNow = 1;
			Player.isNaked = true;
			Player.Gold = 0;
			try {
				Location.Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println();
			System.out.println("The DWELLER looks at you and sighs...");
			System.out.println("\"Thou're such a fool...\" He says, shaking his head..");
			System.out.println("He starts to turn around and walk away, slowly.");
			System.out.println("BUT HE INSTANTLY TURNS AROUND AND PUNCHES YOU SQUARE IN THE FACE");
			System.out.println("Thou black out!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("...");
			System.out.println();
			System.out.println("Thou wakest up in the middle of HAMSHIRE, naked, damaged, and significantly less rich.");
			System.out.println();
			Player.dwellerFled = true;
			Player.healthNow = 1;
			Player.isNaked = true;
			Player.Gold = 0;
			try {
				Location.Hamshirevilletowningtonvilleshiretonville();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void stumpQuest()
	{
		if (Player.talkedToKing == false)
		{
			Player.talkedToKing = true;
			System.out.println();
			System.out.println("---QUEST COMPLETED: \"PROLOGUE: TALK TO THE KING\"---");
			Quest.removeQuest("PROLOGUE: TALK TO THE KING");
			System.out.println();
			System.out.println("Thou slowly walk up to the KING...");
			System.out.println("He gazes upon thee, and thou subtly see him nod. He stands up and walks toward thou.");
			System.out.println("\"HELLO PUNCH!\" he quickly yells!");
			System.out.println("The KING proceeds to punch thou as hard as he can in the face.");
			int tempHealth = Player.healthNow;
			Player.healthNow -= 100;
			if (Player.healthNow <= 0)
			{
				System.out.println("He punches thou so hard that thine face shatters.");
				Player.death();
			}
			if (Player.healthNow > 0)
			{
				Player.healthNow = tempHealth;
				System.out.println("Thou black out!");
				System.out.print(".");Action.wait(1);
				System.out.print(".");Action.wait(1);
				System.out.print(".");Action.wait(1);
				System.out.print(".");Action.wait(1);
				System.out.print(".");Action.wait(1);
				System.out.println();
				System.out.println();
				System.out.println("Thou waketh up, with the KING hovering over thou...");
				System.out.println("\"AHA! So thou art tough. Maybe thou art the right person for this quest after all..!\" he explains...");
				System.out.println("Thou standeth up, the KING definitely has your attention now.");
				System.out.println("\"BUT, being tough is just a plus! Thine LOYALTY is what is in question.\" he continues...");
				System.out.println("\"The quest in which thou shall embark is of epic magnitude!\"");
				System.out.println("\"In fact, it is even EMPIRE CHANGING. But, Thou must prove thineself loyal first.\"");
				System.out.println("\"Dost thou think thou art willing enough to shed off peasanthood and embark on this quest?\" he asks...");
				System.out.println();
				System.out.println("ACCEPT THE QUEST? (Yes/No)");
				System.out.print("CHOOSETH: ");
				String questChoice = scan.nextLine();
				if (questChoice.toUpperCase().equals("Y")||questChoice.toUpperCase().equals("YES"))
				{
					System.out.println();
					System.out.println("---QUEST ACCEPTED: \"HELP THE CITIZENS OF STUMP\"---");
					Quest.stumpQuest = true;
					Quest.addQuest("HELP THE CITIZENS OF STUMP");
					System.out.println();
					System.out.println("\"Good! Thou accepted my quest before I even explained it to thou!\"");
					System.out.println("\"Qualities like that show me that thou art loyal. Thou art on thine way...\" he says.");
					System.out.println("\"Now then, onto the quest! I am sending thou NORTH, to the town of Stump.\"");
					System.out.println("\"The citizens there are having a problem with the undead. I don't have the\"");
					System.out.println("\"precise details, sadly, but they will fill thou in on all the info upon arriving.\"");
					System.out.println("\"To get there, thou must LEAVE the town through the town GATES.\"");
					System.out.println("\"Then, head due NORTH until thou arrive at Stump. Here, take this MAP,\"");
					System.out.println("\"it shall guide thee upon thine journey to Stump, and to all places hereafter.\"");
					Item.give("Map", "A map to guide thee on thine adventures", false, 1, 0, 50, 0, 0, 0, 0, 0);
					System.out.println("(TYPE \"MAP\" TO USE YOUR MAP, NOOB)");
					System.out.println("");
					Item.give("Peasant Coif", "A cloth coif made for PEASANTS and KNAVES", false, 2, 1, 3, 0, 0, 0, 0, -2);
					System.out.println();
					System.out.println();
					Action.gotoLocation(Player.location);
					
				}
				if (questChoice.toUpperCase().equals("N")||questChoice.toUpperCase().equals("NO"))
				{
					System.out.println();
					System.out.println("\"Hm. Alright. I guess thou aren't prepared enough for a quest like this...\" He says");
					System.out.println();
					Action.gotoLocation(Player.location);
				}
				else
				{
					System.out.println();
					System.out.println("Yeah that wasn't an option. GJ.");
					System.out.println();
					Action.gotoLocation(Player.location);
				}
			}
		}
		if (Player.talkedToKing == true)
		{
			System.out.println();
			System.out.println("\"Ah! Thou again!\" he exclaims, apparently happy to see thou.");
			System.out.println("\"So. Have thou changed thine mind? The offer still stands..!\"");
			System.out.println("\"Dost thou think thou art willing enough to shed off peasanthood and go on this quest?\"");
			System.out.println("\"The citizens of Stump need thine help!\"");
			System.out.println();
			System.out.println("ACCEPT THE QUEST? (Yes/No)");
			System.out.print("CHOOSETH: ");
			String questChoice = scan.nextLine();
			if (questChoice.toUpperCase().equals("Y")||questChoice.toUpperCase().equals("YES"))
			{
				
			}
			if (questChoice.toUpperCase().equals("N")||questChoice.toUpperCase().equals("NO"))
			{
				System.out.println();
				System.out.println("\"Hm. Alright. I guess thou aren't prepared enough for a quest like this...\" He says");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
			else
			{
				System.out.println();
				System.out.println("Yeah that wasn't an option. GJ.");
				System.out.println();
				Action.gotoLocation(Player.location);
			}
		}
	}
	
	

	public static void currentQuests()
	{
		
		if(Player.quest == null)
		{
			for (int x = 0; x < Player.quest.length; x++)
			{
				if(Player.quest[x] == null)
				{
					Player.quest[x] = ""; 
				}
			}
		}
		/*
		if (Quest.mainQuestPrologue == true)
		{
			Quest.addQuest("PROLOGUE: TALK TO THE KING");
		}
		if (Quest.emptyBuildingQuest == true)
		{
			Quest.addQuest("EMPTY BUILDING QUEST");
		}
		if (Quest.emptyBuildingQuest == true)
		{
			Quest.addQuest("CHAPTER 1: HELP THE CITIZENS OF STUMP");
		}
		*/
		
		System.out.println();
		System.out.println("   ____________________   ___________________");
		System.out.println(".-/|                   \\ /                   |\\-.");
		System.out.println("||||-CURRENT QUESTS ON WHICH THOU EMBARKETH- ||||");
		for(int y = 0; y < 10; y++)
		{
			int spacing = 41-(Player.quest[y].length());
			String spaces = "";
			for(int x = 0; x < spacing; x++)
			{
				spaces+=" ";
			}
			if (!Player.quest[y].equals(""))
			{
				System.out.println("||||"+Player.quest[y]+spaces+"||||");
			}
			else
			{
				System.out.println("||||                                         ||||");
			}
		}
		System.out.println("||/====================\\:/====================\\||");
		System.out.println("`---------------------~___~--------------------''");
		System.out.println();
		Action.gotoLocation(Player.location);
	}
	public static void addQuest(String questName)
	{
		if(Player.quest == null)
		{
			for (int x = 0; x < Player.quest.length; x++)
			{
				if(Player.quest[x] == null)
				{
					Player.quest[x] = ""; 
				}
			}
		}
		boolean given = false;
		for (int x = 0; x < Player.quest.length; x++)
		{
			if(Player.quest[x] != null &&given == false)
			{
				Player.quest[x] = questName;
				given = true; 
			}
		}
		if (given == false)
		{
			System.out.println("Quest log Full. DELETE SOME QUESTS.");
		}
	}
	public static void removeQuest(String questName)
	{
		for (int x = 0; x < Player.quest.length; x++)
		{
			if(Player.quest[x].equals(questName))
			{
				Player.quest[x] = "";
			}
		}
	}
	
}
