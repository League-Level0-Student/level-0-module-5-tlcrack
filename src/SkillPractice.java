
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String b = JOptionPane.showInputDialog("How many dimes do you have?");

		// Tell them how many cents they have (hint multiply by 10)
		int a = Integer.parseInt(b);
		a *= 10;
		JOptionPane.showMessageDialog(null, "you have " + a + " cents.");

		// Ask the user how tall they are (inches)
		String c = JOptionPane.showInputDialog("how tall are you in inches?");

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		int d = Integer.parseInt(c);
		if (d < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int e = 0; e < 31; e += 3) {
			System.out.println(e);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		int f = 0;

		Random g = new Random();

		f = g.nextInt(20);

		System.out.println(f);
		// Get another random number that is less than 10 and print it to the console
		int h = 0;

		Random i = new Random();

		h = i.nextInt(10);
		System.out.println(h);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		if (f > h) {
			JOptionPane.showMessageDialog(null, f - h);
		} else {
			JOptionPane.showMessageDialog(null, h - f);
		}

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in america's finest city!");
		}
		// Otherwise, tell them to move to San Diego
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego, bub!");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String cars = JOptionPane.showInputDialog("How many cars do you have?");
		if (cars.equals("0") || cars.equalsIgnoreCase("zero")) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		else if (cars.equals("1") || cars.equalsIgnoreCase("one")) {
			JOptionPane.showMessageDialog(null, "I bet it's a minivan.");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		int wheels = Integer.parseInt(cars);
		if (wheels > 1) {
			wheels *= 4;
			JOptionPane.showMessageDialog(null, wheels);
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("what's the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	}
}
