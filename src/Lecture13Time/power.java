package Lecture13Time;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = pow(3,5);
		System.out.println(a);
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int rec = pow(x, n / 2);
		int ans;
		if (n % 2 == 0) {
			ans = rec * rec;
		} else {
			ans = rec * rec * x;
		}
		return ans;
	}

}
