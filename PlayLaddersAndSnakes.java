import java.util.Scanner;

public class PlayLaddersAndSnakes {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void playerSetup() {
		
		System.out.print("Enter the # of players for your game – Number must be between 2 and 4 inclusively: \n");
		
		boolean cont = true;
		int attempts = 0;
		do {
			int y=keyboard.nextInt();
			if (y==2 || y==3 || y==4) {
				LaddersAndSnakes.setPlayerCount(y);
				cont=false;
			}else {
				attempts++;
				if(attempts<4) {
					System.out.print("1Bad Attempt "+ attempts + "- Invalid # of players. Please enter a # between 2 and 4 inclusively: \n");
				}else if(attempts==4) {
					System.out.print("Bad Attempt "+ attempts + "! You have exhausted all your chances. Program will terminate!  \n");
					System.exit(0);
				}
			}
		}while(cont);
		
	}
	
	public static void main (String[] arg) {
		
		playerSetup();
		LaddersAndSnakes.constructRestraints();
	}

}
