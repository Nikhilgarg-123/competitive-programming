package Recursion;

public class number_to_word {

	public static void numword(int n) {
		if(n==0) {
			return;
		}
		numword(n/10);
		int temp=n%10;
		
		if(temp==0) {
			System.out.print("zero ");
		}
		else if(temp==1) {
			System.out.print("one ");
		}
		else if(temp==2) {
			System.out.print("two ");
		}
		else if(temp==3) {
			System.out.print("three ");
		}
		else if(temp==4) {
			System.out.print("four ");
		}
		else if(temp==5) {
			System.out.print("five ");
		}
		else if(temp==6) {
			System.out.print("six ");
		}
		else if(temp==7) {
			System.out.print("seven ");
		}
		else if(temp==8) {
			System.out.print("eight");
		}
		else if(temp==9) {
			System.out.print("nine ");
		}
	}
	public static void main(String[] args) {
		numword(2048);
	

	}

}
