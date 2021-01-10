import java.util.Scanner;

public class dhoni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		System.out.println(binomialCoeff(n, r));
	}

	public static long ncr(int n, int r) {

		long nf = factorial(n);
		long rf = factorial(r);
		long nmrf = factorial(n - r);

		long den = rf * nmrf;

		long c = nf / den;
		long ans = c % 1000000007;

		return ans;

	}

	public static long factorial(int n) {

		long fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}

	public static int nCr(int n, int r) {
		int a = fact(n) / (fact(r) * fact(n - r));
		int ans = a % 1000000007;
		return ans;
	}

	// Returns factorial of n
	public static int fact(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}
	
	static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
      
        // Since C(n, k) = C(n, n-k) 
        if ( k > n - k ) 
            k = n - k; 
      
        // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1] 
        for (int i = 0; i < k; ++i) 
        { 
        res *= (n - i); 
        res /= (i + 1); 
        } 
      
        res = res % 1000000007 ;
        return res; 
    }

}
