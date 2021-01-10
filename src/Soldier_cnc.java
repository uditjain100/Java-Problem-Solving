import java.util.Scanner;

public class Soldier_cnc {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		int n = scn.nextInt();

		int[] sol = new int[n];
		for (int i = 0; i < n; i++) {
			sol[i] = scn.nextInt();
		}

		int[] bomb = new int[n];
		for (int i = 0; i < n; i++) {
			bomb[i] = scn.nextInt();
		}

		System.out.println(cnc(sol, bomb));

	}

	
	public static int cnc(int[] sol, int[] bomb) {

		int cost = 0;

		for (int i = 0; i < sol.length - 1; i++) {
			for (int j = i+1; j < sol.length; j++) {
				int c1 = sol[j] - sol[i];
				int max = Math.max(bomb[j], bomb[i]);
				int ans = c1 * max;
				cost += ans;
			}
		}

		System.out.print("\n");
		
		return cost;

	}
	
	
	
	

}
