package Recursion;

public class place_theTtiles {
// Place the tiles

	// given a wall of size 4*n and tiles of
	// (1,4) and (4,1) . how many ways you can built wall

	public static int wall(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return 1;
		}
		if (n == 4) {
			return 2;
		}

		int x = wall(n - 1);
		int y = wall(n - 4);
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(wall(20));

	}

}
