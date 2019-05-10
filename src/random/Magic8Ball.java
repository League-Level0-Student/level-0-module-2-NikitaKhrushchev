//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rand = new Random();
		int num = rand.nextInt(30);
	// 3. Print out this variable
		
		if(num == 0) {
JOptionPane.showMessageDialog(null, "Yes");
		}
		if(num == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		if(num == 2) {
			JOptionPane.showMessageDialog(null, "Maybe ask google¿");
		}
		else {
			JOptionPane.showMessageDialog(null, "CVMS bad");
		}
}
}	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer



