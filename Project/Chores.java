/*
Author: Cat Smith
Assignment: Final Project- a generic chore assignment generator.
Started: Dec 19
Finished: **After Winter Break**
*/

import java.util.Scanner;
class Chores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] bigChores = {"Kitchen", "Living Room", "Bathroom"};
		String[] smallChores = {"Sweep / Mop", "Vacuum / Dust", "Mirrors / Windows"};
		
		System.out.print("Please enter between 2-6 for number of people: ");
		int numOfPeople = input.nextInt();
		
		String[] names = new String[numOfPeople + 1];
		
		System.out.print("Please Enter " + numOfPeople + " names: ");
		for(int i = 0; i < (numOfPeople + 1); i++){
			names[i] = input.nextLine();
		}
		
		
	}
}