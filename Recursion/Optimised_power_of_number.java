package Recursion;

public class Optimised_power_of_number {

	// O log(n)
	// a^n= (a^(n/2))^2   if n is even
	// a^n = a(a^(n/2))^2  if n is odd
	
	public static int fast_power(int a,int n) {
		if(n==0) {
			return 1;
		}
		int temp= fast_power(a, n/2);
		temp*=temp;
		if(n%2==0) {
			return temp;
		}
		else {
			return a*temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fast_power(11, 4));

	}

}
