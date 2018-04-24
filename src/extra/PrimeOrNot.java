package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Give me a number.");
	int numba = Integer.parseInt(num);
	boolean prime = true;
	for (int i = numba; i >Math.sqrt(numba); i--) {
		
	
	if(numba%i==0) {
		prime = false;
	}
	 
	
	}
	if(prime=true) {
		JOptionPane.showMessageDialog(null, "Your number is prime.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your number is compsite.");
	}
}
}