//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String petbuy=JOptionPane.showInputDialog("whut kind of pet do ya want kkid");
		// 7. REPEAputT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "pet stuff", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "stab your pet", "give it a bath(with peranas)", "feed it" }, null);
			
			
			if(task == 0) { JOptionPane.showMessageDialog(null,"your pet is happy.............in hell because he was secretly a muderer and violent"+petbuy);}
			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 1) { JOptionPane.showMessageDialog(null,"your pet is dead , eaten to death by the peranas,it was very bloody, and you had a hell of a time cleaning the bath tub ");}
			if(task == 2) { JOptionPane.showMessageDialog(null,"poison"+petbuy+"legs, from your other pet you stabbed, your "+petbuy+"you have now is dead.........yay");
			
			
			//    user that he loves his pet and use break; to exit for loop.
// 
	}

	// 4. Create methods to handle each of your user selections.
	
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
	