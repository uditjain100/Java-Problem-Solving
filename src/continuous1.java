
public class continuous1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(noo(1110101111));

	}

	public static long noo(long num) {

		//long num = dtb(n);
		//System.out.println(num);
		int count = 0;
		int maxc = 0;

		while (num != 0) {
			long rem = num % 10;
			if (rem == 1) {
				count++;
			} else {
				if (count > maxc) {
					maxc = count;
					count = 0;
				} else if (count == maxc) {
					count = 0;
				}
			}
			if (num == 1) {
				if (count > maxc) {
					maxc = count;
					count = 0;
				}
			}

			num /= 10;
		}
		return maxc;

	}

	public static long dtb(long n) {

		long power = 1;
		long decimal = 0;
		while (n != 0) {
			long rem = n % 2;

			decimal = decimal + rem * power;
			power = power * 10;
			n = n / 2;
		}
		return decimal;

	}

}
