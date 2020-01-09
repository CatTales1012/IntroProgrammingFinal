/*
Author: Cat Smith
Assignment: Final Project- a generic chore assignment generator.
Started: December 19
Finished: **After Winter Break** January 9
*/
package docs;
import java.util.Scanner;
/**
 * <h1 style="color:green;">Chore Chart Generator</h1>
 * <p>This is a chore chart generator that assigns 2-4 people to 12 generic chores.</p>
 * @author Cat Smith
 * <h2>Started Dec 19, finished January 9 (post winter-break).</h2>
 *
 */
public class Chores {
	/**
	 * <h1>This method is the main method <h1>
	 * <h2>Created Dec 19</h2>
	 * @param args is the preset parameter
	 * @param bigChores is the big chore array 
	 * @param smallChores is the small chore array
	 * @param names is the input names
	 * @param numOfPeople is the input number of people
	 * 
	 */
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