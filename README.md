# Chore Generator
## Synopsis 
This is a generator to tell who will do what chores at absolute random. It has a list of big and small chores, and assigns a person to it at random from the input names and number (for the number of people). 
## Motivation
I made this because I feel like the chores should be randomly generated especially for houses like mine with roommates that barely help with the chores. 
## How to Use
Simply enter the number of people (between 2-4 for best results) and then enter the names of those people. The generator will give an output of "[chore] - [name]" for all chores and random names. 
## Code Example
This snippet is the one that randomizes people to the chores.
```
		for(int i = 0; i < bigChores.length; i++){
			int person = (int)(Math.random() * names.length);
			System.out.println(bigChores[i] + " : " + names[person]);
		}
		for(int i = 0; i < smallChores.length; i++){
			int person = (int)(Math.random() * names.length);
			System.out.println(smallChores[i] + " : " + names[person]);
		}
```
