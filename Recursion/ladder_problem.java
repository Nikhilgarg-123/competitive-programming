package Recursion;

public class ladder_problem {

	public static int ladder(int n, int k) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		int ans = 0;
		for (int i = 1; i <= k; i++) {
			ans += ladder(n - i, k);
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ladder(4, 4));
	}

}
