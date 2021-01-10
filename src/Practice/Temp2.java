package Practice;

public class Temp2 {

	public static int[] arr = new int[10000];
	public static int[][] arr2 = new int[10000][10000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int time1 = (int) System.currentTimeMillis(); for (int i = 0; i <= 40; i++) {
		 * System.out.print(fib_rec(i) + " "); } int time2 = (int)
		 * System.currentTimeMillis(); System.out.println(); System.out.println(time2 -
		 * time1);
		 * 
		 * int time10 = (int) System.currentTimeMillis(); for (int i = 0; i <= 40; i++)
		 * { System.out.print(fib_rec_dp(i) + " "); } int time20 = (int)
		 * System.currentTimeMillis(); System.out.println(); System.out.println(time20 -
		 * time10);
		 */

		// System.out.println(print_bp(0, 10));
		// System.out.println(print_bp_iterative(0, 10));

		System.out.println(lcs_dp("abbc", "babbc"));

		System.out.println(lcs_dp("abbc", "babbc"));

	}

	public static int fib_rec(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		return fib_rec(n - 1) + fib_rec(n - 2);

	}

	public static int fib_rec_dp(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if (arr[n] != 0) {
			return arr[n];
		}

		int ans = fib_rec_dp(n - 1) + fib_rec_dp(n - 2);

		arr[n] = ans;

		return ans;

	}

	public static int fib_iterative(int n) {

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n];

	}

	public static int print_bp(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += print_bp(curr + dice, end);
		}

		return count;

	}

	public static int print_bp_dp(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (arr[curr] != 0) {
			return arr[curr];
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += print_bp_dp(curr + dice, end);
		}

		arr[curr] = count;

		return count;

	}

	public static int print_bp_iterative(int curr, int end) {

		int[] strg = new int[end + 1];

		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				count += strg[dice + i];
			}
			strg[i] = count;
		}

		return strg[curr];
	}

	public static int lcs(String str1, String str2) {

		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}

		int count = 0;

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);
			count = Math.max(f1, f2);
		}

		return count;
	}

	public static int lcs_dp(String str1, String str2) {

		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}

		if (arr2[str1.length()][str2.length()] != 0) {
			return arr2[str1.length()][str2.length()];
		}

		int count = 0;

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs_dp(ros1, ros2);
		} else {
			int f1 = lcs_dp(ros1, str2);
			int f2 = lcs_dp(str1, ros2);
			count = Math.max(f1, f2);
		}

		arr2[str1.length()][str2.length()] = count;

		return count;
	}

	public static int lcs_iterative(String str1, String str2) {

		int[][] strg = new int[str1.length()][str2.length()];
		strg[str1.length()][str2.length()] = 0 ;

		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if (i == str1.length() || j == str2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (str1.charAt(0) == str2.charAt(0)) {
					strg[i][j] = strg[i + 1][j + 1] + 1;
				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
				}
			}
		}

		return strg[0][0];

	}

	public static int edit_dis(String str1 , String str2) {
		
		if(str1.length() == 0) {
			return str2.length() ;
		}
		
		if(str2.length() == 0) {
			return str1.length() ;
		}
		
		String ros1 = str1.substring(1) ;
		String ros2 = str2.substring(1) ;
		
		int count = 0 ;
		
		if(str1.charAt(0) == str2.charAt(0)) {
			count = 1 + edit_dis(ros1, ros2) ;
		}else {
			int f1 = 1 + edit_dis(ros1, ros2) ;
			int f2 = 1 + edit_dis(ros1, str2) ;
			int f3 = 1 + edit_dis(str1, ros2) ;
			count = Math.min(f1, Math.min(f2, f3)) ;
		}
		
		return count ;
	}
	
	public static int edit_dis_iterative(String str1, String str2) {

		int[][] strg = new int[str1.length()][str2.length()];
		strg[str1.length()][str2.length()] = 0 ;

		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if(str1.length() == i) {
					strg[i][j] = str2.length() - j ;
					continue ;
				}
				
				if(str2.length() == 0) {
					strg[i][j] = str1.length() - i ;
					continue ;
				}
				
				if (str1.charAt(0) == str2.charAt(0)) {
					strg[i][j] = strg[i + 1][j + 1] + 1;
				} else {
					strg[i][j] = Math.min(strg[i + 1][j], Math.min(strg[i][j + 1], strg[i+1][j + 1]));
				}
			}
		}

		return strg[0][0];

	}

}
