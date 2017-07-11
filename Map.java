import java.util.Scanner;

public class Map 
{
	//cant travel to
	//0,5	
	//1,4
	//1,6
	//1,7
	//2,3
	//2,5
	//2,8
	//3,5
	//3,6
	//3,7
	//4,4
	//4,7
	//4,8
	//5,7
	//6,3
	//7,2
	//7,3
	//7,4
	//8,1
	//8,2
	//9,0
	//9,1
	//10,0
	//
	//
	//check if the grid your transferring to exists
	//if it does, check if its accessible from your location
	//if it is, actually go to that method
	//add short description of how you got there
	//either
	//a) add 3 short descriptions in the line after "thou art in gridx_x"
	//   that are 3 different strings explaining the basics of where you are
	//or
	//b) have the grid descriptions stay the same and just write
	//   "look around"s for all locations
	
	
	static Map[][] map = new Map[10][10];
	String currentLocation;
	public static void goNorth(String gridName)
	{
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		int xCoord = Integer.parseInt(temp[5]);
		int yCoord = Integer.parseInt(temp[7]);
		String newGrid = "grid"+(xCoord+1)+"_"+(yCoord);
		if(checkIfPossible(newGrid))
		{
			System.out.println();
			System.out.println("Thou walketh NORTH...");
			goToGrid(newGrid);
		}
		else
		{
			System.out.println();
			System.out.println("Thou cannot walketh in that direction!");
			System.out.println("Thou walketh as far as the shore before turning around...");
			goToGrid(gridName);
		}
		
	}
	public static void goNorthEast(String gridName)
	{
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		int xCoord = Integer.parseInt(temp[5]);
		int yCoord = Integer.parseInt(temp[7]);
		String newGrid = "grid"+(xCoord+1)+"_"+(yCoord);
		if(checkIfPossible(newGrid))
		{
			System.out.println();
			System.out.println("Thou walketh NORTH...");
			goToGrid(newGrid);
		}
		else
		{
			System.out.println();
			System.out.println("Thou cannot walketh in that direction!");
			System.out.println("Thou walketh as far as the shore before turning around...");
			goToGrid(gridName);
		}
	}
	public static void goEast(String gridName)
	{
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		int xCoord = Integer.parseInt(temp[5]);
		int yCoord = Integer.parseInt(temp[7]);
		String newGrid = "grid"+(xCoord)+"_"+(yCoord+1);
		if(checkIfPossible(newGrid))
		{
			System.out.println();
			System.out.println("Thou walketh EAST...");
			goToGrid(newGrid);
		}
		else
		{
			System.out.println();
			System.out.println("Thou cannot walketh in that direction!");
			System.out.println("Thou walketh as far as the shore before turning around...");
			goToGrid(gridName);
		}
	}
	public static void goSouthEast(String gridName)
	{
		
	}
	public static void goSouth(String gridName)
	{
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		int xCoord = Integer.parseInt(temp[5]);
		int yCoord = Integer.parseInt(temp[7]);
		String newGrid = "grid"+(xCoord-1)+"_"+(yCoord);
		if(checkIfPossible(newGrid))
		{
			System.out.println();
			System.out.println("Thou walketh SOUTH...");
			goToGrid(newGrid);
		}
		else
		{
			System.out.println();
			System.out.println("Thou cannot walketh in that direction!");
			System.out.println("Thou walketh as far as the shore before turning around...");
			goToGrid(gridName);
		}
	}
	public static void goSouthWest(String gridName)
	{
		
	}
	public static void goWest(String gridName)
	{
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		int xCoord = Integer.parseInt(temp[5]);
		int yCoord = Integer.parseInt(temp[7]);
		String newGrid = "grid"+(xCoord)+"_"+(yCoord-1);
		String reason = "";
		if(checkIfPossible(newGrid))
		{
			System.out.println();
			System.out.println("Thou walketh WEST...");
			goToGrid(newGrid);
		}
		else
		{
			System.out.println();
			System.out.println("Thou cannot walketh in that direction!");
			System.out.println(reason);
			goToGrid(gridName);
		}
	}
	public static void goNorthWest(String gridName)
	{
		
	}
	
	public static void goToGrid(String gridChoice)
	{
	//	String gridChoice = Player.gridLocation;
		if (gridChoice.equals("grid0_0"))
		{
			grid0_0();
		}
		if (gridChoice.equals("grid0_1"))
		{
			grid0_1();
		}
		if (gridChoice.equals("grid0_2"))
		{
			grid0_2();
		}
		if (gridChoice.equals("grid0_3"))
		{
			grid0_3();
		}
		if (gridChoice.equals("grid0_4"))
		{
			grid0_4();
		}

		//TODO
		if (gridChoice.equals("grid1_0"))
		{
			grid1_0();
		}
		if (gridChoice.equals("grid1_1"))
		{
			grid1_1();
		}
		if (gridChoice.equals("grid1_2"))
		{
			grid1_2();
		}
		if (gridChoice.equals("grid1_3"))
		{
			grid1_3();
		}

		//TODO
		if (gridChoice.equals("grid2_0"))
		{
			grid2_0();
		}
		if (gridChoice.equals("grid2_1"))
		{
			grid2_1();
		}
		if (gridChoice.equals("grid2_2"))
		{
			grid2_2();
		}
		if (gridChoice.equals("grid2_3"))
		{
			grid2_3();
		}
		if (gridChoice.equals("grid2_6"))
		{
			grid2_6();
		}
		if (gridChoice.equals("grid2_7"))
		{
			grid2_7();
		}
		
		//TODO
		if (gridChoice.equals("grid3_0"))
		{
			grid3_0();
		}
		if (gridChoice.equals("grid3_1"))
		{
			grid3_1();
		}
		if (gridChoice.equals("grid3_2"))
		{
			grid3_2();
		}
		if (gridChoice.equals("grid3_3"))
		{
			grid3_3();
		}
		if (gridChoice.equals("grid3_4"))
		{
			grid3_4();
		}
	
		//TODO
		if (gridChoice.equals("grid4_0"))
		{
			grid4_0();
		}
		if (gridChoice.equals("grid4_1"))
		{
			grid4_1();
		}
		if (gridChoice.equals("grid4_2"))
		{
			grid4_2();
		}
		if (gridChoice.equals("grid4_3"))
		{
			grid4_3();
		}
		if (gridChoice.equals("grid4_5"))
		{
			grid4_5();
		}
		if (gridChoice.equals("grid4_6"))
		{
			grid4_6();
		}
		if (gridChoice.equals("grid4_7"))
		{
			grid4_7();
		}
		if (gridChoice.equals("grid4_8"))
		{
			grid4_8();
		}
		if (gridChoice.equals("grid4_9"))
		{
			grid4_9();
		}
		
		//TODO
		if (gridChoice.equals("grid5_0"))
		{
			grid5_0();
		}
		if (gridChoice.equals("grid5_1"))
		{
			grid5_1();
		}
		if (gridChoice.equals("grid5_2"))
		{
			grid5_2();
		}
		if (gridChoice.equals("grid5_3"))
		{
			grid5_3();
		}
		if (gridChoice.equals("grid5_4"))
		{
			grid5_4();
		}
		if (gridChoice.equals("grid5_5"))
		{
			grid5_5();
		}
		if (gridChoice.equals("grid5_6"))
		{
			grid5_6();
		}
		if (gridChoice.equals("grid5_8"))
		{
			grid5_8();
		}
		if (gridChoice.equals("grid5_9"))
		{
			grid5_9();
		}
		
		//TODO
		if (gridChoice.equals("grid6_0"))
		{
			grid6_0();
		}
		if (gridChoice.equals("grid6_1"))
		{
			grid6_1();
		}
		if (gridChoice.equals("grid6_2"))
		{
			grid6_2();
		}
		if (gridChoice.equals("grid6_4"))
		{
			grid6_4();
		}
		if (gridChoice.equals("grid6_5"))
		{
			grid6_5();
		}
		if (gridChoice.equals("grid6_6"))
		{
			grid6_6();
		}
		if (gridChoice.equals("grid6_7"))
		{
			grid6_7();
		}
		if (gridChoice.equals("grid6_8"))
		{
			grid6_8();
		}
		if (gridChoice.equals("grid6_9"))
		{
			grid6_9();
		}
		
		//TODO
		if (gridChoice.equals("grid7_0"))
		{
			grid7_0();
		}
		if (gridChoice.equals("grid7_1"))
		{
			grid7_1();
		}
		if (gridChoice.equals("grid7_5"))
		{
			grid7_5();
		}
		if (gridChoice.equals("grid7_6"))
		{
			grid7_6();
		}
		if (gridChoice.equals("grid7_7"))
		{
			grid7_7();
		}
		if (gridChoice.equals("grid7_8"))
		{
			grid7_8();
		}
		if (gridChoice.equals("grid7_9"))
		{
			grid7_9();
		}
		
		//TODO
		if (gridChoice.equals("grid8_0"))
		{
			grid8_0();
		}
		if (gridChoice.equals("grid8_3"))
		{
			grid8_3();
		}
		if (gridChoice.equals("grid8_4"))
		{
			grid8_4();
		}
		if (gridChoice.equals("grid8_5"))
		{
			grid8_5();
		}
		if (gridChoice.equals("grid8_6"))
		{
			grid8_6();
		}
		if (gridChoice.equals("grid8_7"))
		{
			grid8_7();
		}
		if (gridChoice.equals("grid8_8"))
		{
			grid8_8();
		}
		if (gridChoice.equals("grid8_9"))
		{
			grid8_9();
		}
		
		//TODO
		if (gridChoice.equals("grid9_2"))
		{
			grid9_2();
		}
		if (gridChoice.equals("grid9_3"))
		{
			grid9_3();
		}
		if (gridChoice.equals("grid9_4"))
		{
			grid9_4();
		}
		if (gridChoice.equals("grid9_5"))
		{
			grid9_5();
		}
		if (gridChoice.equals("grid9_6"))
		{
			grid9_6();
		}
		if (gridChoice.equals("grid9_7"))
		{
			grid9_7();
		}
		if (gridChoice.equals("grid9_8"))
		{
			grid9_8();
		}
		if (gridChoice.equals("grid9_9"))
		{
			grid9_9();
		}
		
		//TODO
		if (gridChoice.equals("grid10_1"))
		{
			grid10_1();
		}
		if (gridChoice.equals("grid10_2"))
		{
			grid10_2();
		}
		if (gridChoice.equals("grid10_3"))
		{
			grid10_3();
		}
		if (gridChoice.equals("grid10_4"))
		{
			grid10_4();
		}
		if (gridChoice.equals("grid10_5"))
		{
			grid10_5();
		}
		if (gridChoice.equals("grid10_6"))
		{
			grid10_6();
		}
		if (gridChoice.equals("grid10_7"))
		{
			grid10_7();
		}
		if (gridChoice.equals("grid10_8"))
		{
			grid10_8();
		}
		if (gridChoice.equals("grid10_9"))
		{
			grid10_9();
		}
	}
	public static void gridChange(String choice, String gridName)
	{
		if (choice.toUpperCase().equals("GO NORTH")||choice.toUpperCase().equals("NORTH")||choice.toUpperCase().equals("N"))
		{
			goNorth(gridName);
		}
		if (choice.toUpperCase().equals("GO SOUTH")||choice.toUpperCase().equals("SOUTH")||choice.toUpperCase().equals("S"))
		{
			goSouth(gridName);
		}
		if (choice.toUpperCase().equals("GO EAST")||choice.toUpperCase().equals("EAST")||choice.toUpperCase().equals("E"))
		{
			goEast(gridName);
		}
		if (choice.toUpperCase().equals("GO WEST")||choice.toUpperCase().equals("WEST")||choice.toUpperCase().equals("W"))
		{
			goWest(gridName);
		}
	}
	public static boolean checkIfPossible(String gridName) 
	{
		if(gridName.equals("grid0_5"))
		{
			return false;
		}
		if(gridName.equals("grid1_4"))
		{
			return false;
		}
		if(gridName.equals("grid1_6"))
		{
			return false;
		}
		if(gridName.equals("grid2_3"))
		{
			return false;
		}
		if(gridName.equals("grid2_5"))
		{
			return false;
		}
		if(gridName.equals("grid2_8"))
		{
			return false;
		}
		if(gridName.equals("grid3_5"))
		{
			return false;
		}
		if(gridName.equals("grid3_6"))
		{
			return false;
		}
		if(gridName.equals("grid3_7"))
		{
			return false;
		}
		if(gridName.equals("grid4_4"))
		{
			return false;
		}
		if(gridName.equals("grid4_7"))
		{
			return false;
		}
		if(gridName.equals("grid4_8"))
		{
			return false;
		}
		if(gridName.equals("grid5_7"))
		{
			return false;
		}
		if(gridName.equals("grid6_3"))
		{
			return false;
		}
		if(gridName.equals("grid7_2"))
		{
			return false;
		}
		if(gridName.equals("grid7_3"))
		{
			return false;
		}
		if(gridName.equals("grid7_4"))
		{
			return false;
		}
		if(gridName.equals("grid8_1"))
		{
			return false;
		}
		if(gridName.equals("grid8_2"))
		{
			return false;
		}
		if(gridName.equals("grid9_0"))
		{
			return false;
		}
		if(gridName.equals("grid9_1"))
		{
			return false;
		}
		if(gridName.equals("grid10_0"))
		{
			return false;
		}
		return true;
	}
	
	// TODO 
	public static void grid0_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		String description1 = "";
		String description2 = "";
		String description3 = "";
		System.out.println(description1+description2+description3);
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid0_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.println();
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid0_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid0_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid0_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid1_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid1_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid1_2()//STINGERVILLE
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.println("Thou standeth outside the gigantic town of Stingerville.");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
		if (choice.toUpperCase().equals("ENTER")||choice.toUpperCase().equals("ENTER TOWN")||choice.toUpperCase().equals("GO IN TOWN")||choice.toUpperCase().equals("ENTER STINGERVILLE")||choice.toUpperCase().equals("GO IN"))
		{
			Location.StingervilleGates();
		}
	}
	public static void grid1_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}

	// TODO
	public static void grid2_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid2_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid2_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid2_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid2_6()//ISLAND
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
		if (choice.toUpperCase().equals("GO TO LAND"))
		{
			grid5_6();
		}
	}
	public static void grid2_7()//ISLAND
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}

	// TODO
	public static void grid3_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid3_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid3_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid3_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid3_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid4_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_5()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid4_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid5_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_5()//HAMSHIRE
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.println("Thou standeth outside the gigantic town of Hamshire.");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
		if (choice.toUpperCase().equals("ENTER")||choice.toUpperCase().equals("ENTER TOWN")||choice.toUpperCase().equals("GO IN TOWN")||choice.toUpperCase().equals("ENTER HAMSHIRE")||choice.toUpperCase().equals("GO IN"))
		{
			Action.guardEncounter("HAMSHIRE GATES OUTSIDE");
		}
		
	}
	public static void grid5_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
		if (choice.toUpperCase().equals("GO TO ISLAND"))
		{
			grid2_6();
		}
	}
	public static void grid5_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid5_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid6_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_5()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid6_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid7_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_5()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid7_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid8_0()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_5()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid8_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid9_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_5()//STUMP
	{
		Player.inAGrid = true;
		Player.inStump = false;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.println("Thou standeth outside the town of Stump.");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid9_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	
	// TODO
	public static void grid10_1()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_2()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_3()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_4()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_5()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_6()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_7()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_8()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_9()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}
	public static void grid10_10()
	{
		Player.inAGrid = true;
		System.out.println();
		String gridName = new Object(){}.getClass().getEnclosingMethod().getName();
		Player.gridLocation = gridName;
		String[] temp;
		String delimiter = "";
		temp = gridName.split(delimiter);
		System.out.println("Thou art at grid("+temp[5]+","+temp[7]+").");
		System.out.print("WHAT DO YOU DO: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		gridChange(choice, gridName);
		Action.defaultActions(choice);
	}	
}
