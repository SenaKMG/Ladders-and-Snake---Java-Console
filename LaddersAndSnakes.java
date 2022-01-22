import java.util.Scanner;

public class LaddersAndSnakes {
	
	static Scanner keyboard = new Scanner(System.in);
	
	private String[][] Grid = new String[10][10];
	public static int[] Restraints = new int[101];
	private static int playerCount;
	public static Players[] Group;
	
	public static int getPlayerCount() {
		return playerCount;
	}
	
	public static void setPlayerCount(int x) {
		playerCount = x;
		Group = new Players[x];
	}
	
	public static void constructRestraints() {
		for(int i=1; i<=Restraints.length; i++) {
			Restraints[i]=0;
		}
		Restraints[1]=37;
		Restraints[4]=10;
		Restraints[9]=22;
		Restraints[16]=-12;
		Restraints[21]=21;
		Restraints[28]=56;
		Restraints[36]=8;
		Restraints[48]=-18;
		Restraints[51]=16;
		Restraints[62]=-43;
		Restraints[63]=-3;
		Restraints[71]=20;
		Restraints[80]=20;
		Restraints[93]=-25;
		Restraints[95]=-71;
		Restraints[97]=-21;
		Restraints[98]=-20;
	}
	
	public static int getRestraint(int x) {
		int y = Restraints[x];
		return y;
	}
	
	public static int flipDice() {
		int x = (int) Math.round(Math.random()*6+0.5);
		return x;
	}
	
	public static int promptFlipDice() {
		boolean cont=true;
		
		do {
			System.out.print("Press F to flip dice: ");
			String x = keyboard.next();
			if(x.equals("f") || x.equals("F")) {
				cont=false;
			}else {
				System.out.print("Invalid character! Input F to flip dice: ");
			}
		}while(cont);
		
		return flipDice();
		
	}
	
	public static boolean someoneWon(){
		int x=0;
		for(int i=0; i<playerCount;i++) {
			
			if(Group[i].getPosition()==100) {
				x++;
			}else {
			}
		}
		
		return (x!=0);
	}
	
	
	
	public static void play() {
		do {
			
			
		}while(!someoneWon());
		
	}
	

}
