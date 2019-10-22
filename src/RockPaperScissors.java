import java.util.Scanner;

public class RockPaperScissors {
	
	private static int currChoice;
	private static int compChoice;
	private static boolean start = true;
	private static int score;
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! Welcome to Rock, Paper, Scissors!");
		System.out.print("Enter your name: ");
		input.nextLine();
		
		System.out.println("Lets Play!");
		
		while(start) {
			System.out.println("Choose either 1 for Rock, 2 for Paper, or 3 for Scissors!");
			currChoice = input.nextInt();
			
			compChoice = (int)(Math.random() * ((3 - 1) + 1)) + 1;
			
			if(compChoice == 1) {
				if(currChoice == 1) {
					System.out.println("Comp chose Rock! It's a tie!");
					continue;
				} else if(currChoice == 2) {
					System.out.println("Comp chose Rock! Paper beats Rock! You win!.");
					score++;
					continue;
				} else if(currChoice == 3) {
					System.out.println("Comp chose Rock! Rock beats Scissors! You lose!");
					break;
				}
			} else if(compChoice == 2) {
				if(currChoice == 1) {
					System.out.println("Comp chose Paper! Paper beats rock! You win!");
					score++;
					continue;
				} else if(currChoice == 2) {
					System.out.println("Comp chose Paper! It's a tie!");
					continue;
				} else if(currChoice == 3) {
					System.out.println("Comp chose Paper! Scissors beat paper! You lose!");
					break;
				}
			} else if(compChoice == 3) {
				if(currChoice == 1) {
					System.out.println("Comp chose Scissors! Rock beats Scissors! You win!");
					score++;
					continue;
				} else if(currChoice == 2) {
					System.out.println("Comp chose Scissors! Scissors beat Paper! You lose!");
					break;
				} else if(currChoice == 3) {
					System.out.println("Comp chose Scissors! It's a tie!");
					continue;
				}
			}
			input.close();
		}
		System.out.println("Your score: " + score);
	}

}
