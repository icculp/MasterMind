import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String []args) {
		// Setup objects
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Mastermind! Your goal is to guess the code that I have created.\n" +
				   "The code is exactly 4 colors long. The colors can repeat. Your options are:\n" +
				   "b = blue\nr = red\no = orange\ny = yellow\ng = green\np = purple\n" +
				   "You've got 10 tries... Good luck!");
		while (true) {
			startGame(random, in);
			System.out.println("Would you like to play again? (y/n)");
			String response = in.next();
			while (!"yYnN".contains(response)) {
				System.out.println("Sorry, I don't understand.. Do you wish to play again? (y/n)");
				response = in.next();
			}
			if ("nN".contains(response)) {
				System.out.println("Bye, Felicia!");
				break;
			}
			System.out.println("I have another code... Ready? Let's go!");
		}
		
		in.close();
	}
	
	private static void startGame(Random random, Scanner in) {
		
		// Create code
		char[] colors = {'r', 'o', 'y', 'g', 'b', 'p'};
		char[] code = {colors[random.nextInt(5)], colors[random.nextInt(5)],
			       colors[random.nextInt(5)], colors[random.nextInt(5)]};
		
		// Game loop
		int samePlace = 0;
		for (int chances = 10; chances > 0; chances--) {
			int sameColor = 0;
			samePlace = 0;
			int n;
			char[] input = in.next().toCharArray();
			char[] tempInput = input.clone();
			char[] tempCode = code.clone();
			
			// If invalid input, try again
			if (input.length != 4) {
				System.out.println("Input 4 letters");
				chances++;
				continue;
			}
			
			// Checks for right position
			for (n = 0; n < 4; n++) {
				if (input[n] == code[n]) {
					samePlace++;
					tempCode[n] = '\0';
					tempInput[n] = '\0';
				}
			}
			
			// Checks for right color
			for (n = 0; n < 4; n++) {
				for (int m = 0; m < 4; m++) {
					if (tempInput[n] != '\0' && tempCode[m] != '\0' && tempInput[n] == tempCode[m]) {
						sameColor++;
						tempCode[m] = '\0';
						tempInput[n] = '\0';
					}
				}
			}
			
			// Print result
			if (samePlace != 4) {
				System.out.printf("Positions: %d, Colors: %d, Tries left: %d\n", samePlace, sameColor, chances - 1);
			} else {
				break;
			}
		}
		if (samePlace != 4) {
			System.out.println("[TF2 Announcer Voice] You failed!\nThe real code was: " + code[0] + code[1] + code[2] + code[3]);
		} else {
			System.out.println("Hooray!");
		}
	}
}
