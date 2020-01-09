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
		
		String[] bigChores = {"Kitchen", "Living Room", "Bathroom", "Front Yard / Porch", "Hallway / Closet (Organize)", "Back Yard/ Porch"};
		String[] smallChores = {"Sweep / Mop", "Vacuum / Dust", "Mirrors / Windows", "Water Plants", "Put Dishes Away", "Rearrange Bathroom Counter"};
		
		System.out.print("Please enter between 2-4 for number of people: ");
		int numOfPeople = input.nextInt();
		
		String[] names = new String[numOfPeople];
		
		System.out.print("Please Enter " + numOfPeople + " names: ");
		for(int i = 0; i < names.length; i++){
			names[i] = input.next();
		}
		
		System.out.println("--------------------------");
		
		for(int i = 0; i < bigChores.length; i++){
			int person = (int)(Math.random() * names.length);
			System.out.println(bigChores[i] + " : " + names[person]);
		}
		for(int i = 0; i < smallChores.length; i++){
			int person = (int)(Math.random() * names.length);
			System.out.println(smallChores[i] + " : " + names[person]);
		}	
	}
}