public class PythTrip {

	public static void main(String[] args) {

		int a, b, c = 0, j, i, temp, s, k;
		int limit = 20;
		while (c < limit) {
			for (i = 1; i < limit; ++i) {
				for (j = 1; j < limit; ++j) {
					a = i;
					b = j;
					temp = a * a + b * b;
					for (s = 1; s <= limit; s++) {
						k = s * s;
						c = s;
						if (k == temp) {
							if (i < j) {
								System.out.printf(" %d %d %d\n", a, b, c);
							}
						}
						if (c > limit) {
							break;
						}
					}
				}
			}

		}
	}
}
