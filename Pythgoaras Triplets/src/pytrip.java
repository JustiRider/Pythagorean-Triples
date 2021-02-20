
public class pytrip {
	static void pythTri(int lim) {
		int a, b, c = 0;
		int m = 2;
		while (c < lim) {
			for (int n = 1; n < m; n++) {
				a = m * m - n * n;
				b = 2 * m * n;
				c = m * m + n * n;

				if (c > lim)
					break;

				System.out.println(a + " " + b + " " + c);

			}
			m++;
		}
	}

	public static void main(String args[]) {
		int lim = 20;
		pythTri(lim);

	}
}
