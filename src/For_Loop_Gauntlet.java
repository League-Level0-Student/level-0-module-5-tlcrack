package extra;

public class For_Loop_Gauntlet {
public static void main(String[] args) {
		for(int a = 0; a < 100; a++) {
		System.out.println(a);}
	
		for(int b = 100; b > 0; b--) {
		System.out.println(b);}
	
		for(int c = 2; c < 100;c++) {
		if(c%2==0) {
		System.out.println(c);}}
	
		for(int d = 0; d < 100; d++) {
		if(d%2==1) {
		System.out.println(d);}}
	
		for(int d = 1; d < 500; d++) {
		if(d%2==1) {
		System.out.println(d + " is odd");}
		if(d%2==0) {
		System.out.println(d + " is even");}}
	
		for (int e = 0; e < 777; e++) {
		if(e%7==0) {
		System.out.println(e);}}
		
	
		for (int f = 2007; f < 2018; f++) {
		int g = f-2007;
		System.out.println("In " + f + " I was " + g);}
		
	
		
		for(int h = 0; h < 3; h++ ) {
		
		for (int i = 0; i < 3; i++) {
		System.out.println(h + " " + i);}}
		
		for (int j = 1; j < 9; j+=3) {
		
		for (int k = j; k < j+3; k++) {
		System.out.print(k);}
		
		System.out.println();}
	
		for (int l = 1; l < 100; l+=10) {
		
		for (int m = l; m < l+10; m++) {
		System.out.print(m);}
		
		System.out.println();}
		
		for (int n = 0; n < 7; n++) {
			System.out.println();
		for (int m = 0; m < n; m++) {
			System.out.print("* ");
		}
		}

}
}
