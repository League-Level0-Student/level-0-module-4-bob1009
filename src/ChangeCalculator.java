//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
String dime=JOptionPane.showInputDialog("how many dimes do you have?");
int dime2= Integer.parseInt(dime);
		// Ask the user how many nickels they have
String nick=JOptionPane.showInputDialog("how many nickles do you have?");
int nick2= Integer.parseInt(nick);
		// Convert their answer to an int using Integer.parseInt()
String quart=JOptionPane.showInputDialog("how many quaters do you have?");
int quart2= Integer.parseInt(quart);
		// Ask the user how many dimes they have, and convert their answer
double totalDimes=dime2*0.10;
double totalNickles=nick2*0.05;
double totalQuarts=quart2*0.25;
double total=totalDimes+totalNickles+totalQuarts;
		// Ask the user how many quarters they have, and convert their answer
JOptionPane.showMessageDialog(null,"your total is $"+total);
		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

