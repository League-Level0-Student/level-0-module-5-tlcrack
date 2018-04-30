import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
int num1 = 0;
int num2 = 1;


	for(int i = 0; i<13; i++) {
		System.out.print(num1 + ", ");
		int sum = num1+num2;
		
		num1=num2;
		num2 = sum;
		
	}
	
	
	
	
	
	
}
}
