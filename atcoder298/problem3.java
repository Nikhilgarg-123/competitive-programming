package atcoder298;

import java.util.*;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> box = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> card = new HashMap<>();
		while (q-- > 0) {
			int temp = sc.nextInt();
			if (temp == 1) {
				int temp2 = sc.nextInt();
				int temp3 = sc.nextInt();
				if (box.containsKey(temp3) == false) {
					box.put(temp3, new ArrayList<>());

				}
				if (card.containsKey(temp2) == false) {
					card.put(temp2, new ArrayList<>());

				}
				ArrayList<Integer> arr = box.get(temp3);
				arr.add(temp2);
				box.put(temp3, arr);
				ArrayList<Integer> arr2 = card.get(temp2);
				if (arr2.contains(temp3) == false) {
					arr2.add(temp3);

				}
				card.put(temp2, arr2);

			} else if (temp == 2) {
				int temp2 = sc.nextInt();
				ArrayList<Integer> arr = box.get(temp2);
				Collections.sort(arr);

				for (int i : arr) {
					System.out.print(i + " ");
				}

				System.out.println();

			} else {
				int temp2 = sc.nextInt();
				ArrayList<Integer> arr = card.get(temp2);
				Collections.sort(arr);
				for (int i : arr) {
					System.out.print(i + " ");
				}

				System.out.println();

			}
		}

	}

}
