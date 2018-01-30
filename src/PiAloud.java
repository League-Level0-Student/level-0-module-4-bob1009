//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {
public static void main(String[] args) {
	
	String bob=("3.1415926535897932384626433832795028"
		+ "84197169399375105820974944592307816"
		+ "40628620899862803482534211706798214"
		+ "80865132823066470938446095505822317"
		+ "25359408128481117450284102701938521"
		+ "10555964462294895493038196442881097"
		+ "56659334461284756482337867831652712"
		+ "01909145648566923460348610454326648"
		+ "21339360726024914127372458700660631"
        + "55881748815209209628292540917153643"
        + "67892590360011330530548820466521384...");
	System.out.println(bob.charAt(3));
	// 1. Make a main method and make sure your program can run

	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"

	// 4. Print ALL the digits of of Pi (hint: use a loop)

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


