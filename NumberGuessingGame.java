package com.codsoft.practice;


	import java.util.Scanner;
	import java.util.Random;

	public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        boolean playAgain = true;
	        int totalRounds = 0;
	        int totalScore = 0;
	        
	        while (playAgain) {
	            totalRounds++;
	            int randomNumber = random.nextInt(100) + 1;
	            int maxAttempts = 5;
	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            
	            System.out.println("\nRound " + totalRounds + ":");
	            System.out.println("Guess the number (between 1 and 100). You have " + maxAttempts + " attempts.");
	            
	            while (attempts < maxAttempts) {
	                attempts++;
	                System.out.print("Attempt " + attempts + ": Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                
	                if (userGuess == randomNumber) {
	                    System.out.println("Congratulations! You guessed the correct number.");
	                    guessedCorrectly = true;
	                    totalScore += (maxAttempts - attempts + 1);
	                    break;
	                } else if (userGuess < randomNumber) {
	                    System.out.println("Your guess is too low.");
	                } else {
	                    System.out.println("Your guess is too high.");
	                }
	            }
	            
	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
	            }
	            
	            System.out.print("Do you want to play another round? (yes/no): ");
	            String response = scanner.next();
	            playAgain = response.equalsIgnoreCase("yes");
	        }
	        
	        System.out.println("\nGame over!");
	        System.out.println("You played " + totalRounds + " rounds.");
	        System.out.println("Your total score is: " + totalScore);
	        
	        scanner.close();
	    }
	}



