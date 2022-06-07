package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
		Scanner scanStr = new Scanner(System.in);

	    System.out.println("------------------------------------------------");
	    System.out.println("\t \t Welcome to the Snowman game!");
	    System.out.println("------------------------------------------------");

	    System.out.println("\n");

	    // put rules here
		System.out.println("In order to play this game, you need to guess a word by entering letters or guessing the word.");
		System.out.println("If you guess a letter or word wrong, you lose a try.");
		System.out.println("After every try, a different part of the snowman is built.");
		System.out.println("You have 6 tries before the snowman is completely built and you lose the game.");
	    System.out.println("\t __\n" +
				"   _|==|_  \n" +
				"    ('')___/\n" +
				">--(`^^')\n" +
				"  (`^'^'`)\n" +
				"  `======'");

	    System.out.println("\nChoose one of the following categories: \nvegetables (1) \nfruits (2) \ntaylor swift related names (3) \ninstruments (4) \nthings with wheels (5) \n");
		String category = scanStr.nextLine();

		int length = 0;
		String word = "";

		if (category.equalsIgnoreCase("1")){
			vegetables test1 = new vegetables();
			length = test1.getVeg().length();
			word = test1.getVeg();
		}

		else if (category.equalsIgnoreCase("2")) {
			fruits test2 = new fruits();
			length = test2.getFruit().length();
			word = test2.getFruit();
		}

		else if (category.equalsIgnoreCase("3")) {
			ts test3 = new ts();
			length = test3.getTay().length();
			word = test3.getTay();
		}

		else if (category.equalsIgnoreCase("4")) {
			instruments test4 = new instruments();
			length = test4.getInst().length();
			word = test4.getInst();
		}

		else if (category.equalsIgnoreCase("5")) {
			wheels test5 = new wheels();
			length = test5.getWheel().length();
			word = test5.getWheel();
		}

		else {
			System.out.println("Category Does Not Exist!");
			System.exit(0);

		}

		//System.out.println(word);
		System.out.println("\n\n");

		ArrayList<String> updatedGuess = new ArrayList<String>();;

		for (int i = 0; i<length; i++) {
			if (word.substring(i,i+1).equals(" ")) {
				updatedGuess.add(" ");
			}
			else {
				updatedGuess.add("_");
			}
		}

		String updatedGuesses = "";

		for (int i = 0; i < updatedGuess.size();i++)
		{
			updatedGuesses += (updatedGuess.get(i));
		}

		System.out.println(updatedGuesses);

		System.out.println();
		int tries = 6;
		boolean	guessed = false;
		boolean playing = true;
		String again = "";

		while (playing == true) {
			System.out.print("Please enter your guess: ");
			String guess = scanStr.nextLine();


			if (guess.length() == 1) {
				if (word.indexOf(guess) >= 0) {
					//updatedGuess.add(word.indexOf(guess), guess);
					for (int i = 0; i < updatedGuess.size(); i++) {
						if (word.substring(i,i+1).equalsIgnoreCase(guess)) {
							updatedGuess.set(i, guess);
							updatedGuesses = updatedGuesses.substring(0, i) + guess + updatedGuesses.substring(i+1);
						}
					}

					if (updatedGuesses.equalsIgnoreCase(word)) {
						guessed = true;
					}
				}
				else {
					tries--;
				}
			}
			else {
				if (word.indexOf(guess) >= 0) {
					//updatedGuesses = updatedGuesses.substring(0, word.indexOf(guess)) + guess + updatedGuesses.substring(word.indexOf(guess) + guess.length());
					if (word.length() < guess.length()) {
						System.exit(1);
					}
					for (int i = 0; i < word.length()-guess.length()+1; i++) {
						if (word.substring(i,i+guess.length()).equalsIgnoreCase(guess)) {
							updatedGuesses = updatedGuesses.substring(0, i) + guess + updatedGuesses.substring(i+guess.length());
						}
					}
					for (int i = 0; i < updatedGuess.size(); i++) {
						updatedGuess.set(i, updatedGuesses.substring(i, i + 1));
					}
					if (updatedGuesses.equalsIgnoreCase(word)) {
						guessed = true;
					}
				}
				else {
					tries--;
				}
			}



			// snow man building

			System.out.println(updatedGuesses);
			//System.out.println(guessed);

			if (updatedGuesses.equalsIgnoreCase(word)) {
				guessed = true;
			}

			if(tries == 0 || guessed == true) {
				if (guessed == false) {
					System.out.println("The snowman is completely built. You have lost the game. Better luck next time!");
					System.out.println("The word was " + word);
					System.out.println("\t __\n" +
							"   _|==|_  \n" +
							"    ('')___/\n" +
							">--(`^^')\n" +
							"  (`^'^'`)\n" +
							"  `======'");
					System.out.print("Would you like to play again? y/n ");
					again = scanStr.nextLine();
					if (again.equalsIgnoreCase("y")) {
						System.out.println("\nChoose one of the following categories: \nvegetables (1) \nfruits (2) \ntaylor swift related names (3) \ninstruments (4) \nthings with wheels (5) \n");
						category = scanStr.nextLine();

						length = 0;
						word = "";

						if (category.equalsIgnoreCase("1")){
							vegetables test1 = new vegetables();
							length = test1.getVeg().length();
							word = test1.getVeg();
						}

						else if (category.equalsIgnoreCase("2")) {
							fruits test2 = new fruits();
							length = test2.getFruit().length();
							word = test2.getFruit();
						}

						else if (category.equalsIgnoreCase("3")) {
							ts test3 = new ts();
							length = test3.getTay().length();
							word = test3.getTay();
						}

						else if (category.equalsIgnoreCase("4")) {
							instruments test4 = new instruments();
							length = test4.getInst().length();
							word = test4.getInst();
						}

						else if (category.equalsIgnoreCase("5")) {
							wheels test5 = new wheels();
							length = test5.getWheel().length();
							word = test5.getWheel();
						}

						else {
							System.out.println("Category Does Not Exist!");
							System.exit(0);

						}

						//System.out.println(word);
						System.out.println("\n\n");

						updatedGuess = new ArrayList<String>();;

						for (int i = 0; i<length; i++) {
							if (word.substring(i,i+1).equals(" ")) {
								updatedGuess.add(" ");
							}
							else {
								updatedGuess.add("_");
							}
						}

						updatedGuesses = "";

						for (int i = 0; i < updatedGuess.size();i++)
						{
							updatedGuesses += (updatedGuess.get(i));
						}

						System.out.println(updatedGuesses);

						System.out.println();
						tries = 6;
						guessed = false;
						playing = true;
					}
					else {
						System.exit(0);
					}
				}
				else {
					System.out.println("Congrats! You have guessed the word :)");
					System.out.print("Would you like to play again? y/n ");
					again = scanStr.nextLine();
					if (again.equalsIgnoreCase("y")) {
						System.out.println("\nChoose one of the following categories: \nvegetables (1) \nfruits (2) \ntaylor swift related names (3) \ninstruments (4) \nthings with wheels (5) \n");
						category = scanStr.nextLine();

						length = 0;
						word = "";

						if (category.equalsIgnoreCase("1")){
							vegetables test1 = new vegetables();
							length = test1.getVeg().length();
							word = test1.getVeg();
						}

						else if (category.equalsIgnoreCase("2")) {
							fruits test2 = new fruits();
							length = test2.getFruit().length();
							word = test2.getFruit();
						}

						else if (category.equalsIgnoreCase("3")) {
							ts test3 = new ts();
							length = test3.getTay().length();
							word = test3.getTay();
						}

						else if (category.equalsIgnoreCase("4")) {
							instruments test4 = new instruments();
							length = test4.getInst().length();
							word = test4.getInst();
						}

						else if (category.equalsIgnoreCase("5")) {
							wheels test5 = new wheels();
							length = test5.getWheel().length();
							word = test5.getWheel();
						}

						else {
							System.out.println("Category Does Not Exist!");
							System.exit(0);

						}

						//System.out.println(word);
						System.out.println("\n\n");

						updatedGuess = new ArrayList<String>();;

						for (int i = 0; i<length; i++) {
							if (word.substring(i,i+1).equals(" ")) {
								updatedGuess.add(" ");
							}
							else {
								updatedGuess.add("_");
							}
						}

						updatedGuesses = "";

						for (int i = 0; i < updatedGuess.size();i++)
						{
							updatedGuesses += (updatedGuess.get(i));
						}

						System.out.println(updatedGuesses);

						System.out.println();
						tries = 6;
						guessed = false;
						playing = true;
					}
					else {
						System.exit(0);
					}

				}
			}

			else if (tries == 5) {
				System.out.println(
						"  (`^'^'`)\n" +
						"  `======'");
				System.out.println("Five more tries!");
			}
			else if (tries == 4) {
				System.out.println(
						"   (`^^')\n" +
						"  (`^'^'`)\n" +
						"  `======'");
				System.out.println("Four more tries!");
			}
			else if (tries == 3) {
				System.out.println(
						"    ('')\n" +
						"   (`^^')\n" +
						"  (`^'^'`)\n" +
						"  `======'");
				System.out.println("Three more tries!");

			}
			else if (tries == 2) {
				System.out.println("\t __\n" +
						"   _|==|_  \n" +
						"    ('')\n" +
						"   (`^^')\n" +
						"  (`^'^'`)\n" +
						"  `======'");

				System.out.println("Two more tries!");

			}
			else if (tries == 1) {
				System.out.println("\t __\n" +
						"   _|==|_  \n" +
						"    ('')\n" +
						">--(`^^')\n" +
						"  (`^'^'`)\n" +
						"  `======'");
				System.out.println("Last try!");

			}



		}














    }
}

