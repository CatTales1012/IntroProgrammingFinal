/*
Author: Cat Smith
Assignment: Final Project- a generic chore assignment generator.
Started: Dec 19
Finished: **After Winter Break** January 
*/

import java.util.Scanner;
class Chores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] bigChores = {"Kitchen", "Living Room", "Bathroom", "Front Yard / Porch"};
		String[] smallChores = {"Sweep / Mop", "Vacuum / Dust", "Mirrors / Windows", "Water Plants"};
		
		System.out.print("Please enter between 2-6 for number of people: ");
		int numOfPeople = input.nextInt();
		
		String[] names = new String[numOfPeople + 1];
		
		System.out.print("Please Enter " + numOfPeople + " names: ");
		for(int i = 0; i < (numOfPeople + 1); i++){
			names[i] = input.nextLine();
		}
		
		
		//use a string to contain an already used random number to avoid repeats. 
		String bChoose = "";
		String sChoose = "";
		
		for(int i = 1; i < names.length; i++){
			int big = (int)(Math.random() * bigChores.length);
			while (bChoose.contains(Integer.toString(big))) {
				big = (int)(Math.random() * bigChores.length);
			}
			bChoose += big + " ";
			
			int small = (int)(Math.random() * smallChores.length);
			while (sChoose.contains(Integer.toString(small))) {
				small = (int)(Math.random() * smallChores.length);
			}
			sChoose += small + " ";

			System.out.println(names[i] + " - " + bigChores[big] + ", " + smallChores[small] );
		}
		
	}
}