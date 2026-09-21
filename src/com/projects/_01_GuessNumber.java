package com.projects;

//  ---- Number Guessing Game ----

import java.util.Random;
import java.util.Scanner;

public class _01_GuessNumber {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int sNo = r.nextInt(100) +1;  // 1 to 100
		int guess;
		int attempts=0;
		
		System.out.println("==== Number Guess Game ====");
		System.out.println("Guess a Number between 1 and 100");
		
		do {
			System.out.print("Enter your guess: ");
			guess=sc.nextInt();
			attempts++;
			
			if(guess>sNo) {
				System.out.println("Too High!");
			} else if(guess<sNo) {
				System.out.println("Too Low!");
			} else {
				System.out.println("Correct! You Guessed the Number");
			}
		} while (guess != sNo);
		
		System.out.println("Total Attepts: "+attempts);
		sc.close();
	}
}
