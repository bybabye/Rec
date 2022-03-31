package REFACTOR;

public class Hexa {
	public void FourNumber() {
		char[] d = new char[] { 48, 49, 50, 51, 52, 53,

				54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };

		int Decimal = 0;
		for (int i = 0; i < 16; i++)
			for (int j = 0; j < 16; j++)
				Decimal = compact(d, Decimal, i, j);

	}

	private int compact(char[] d, int Decimal, int i, int j) {
		for (int k = 0; k < 16; k++)
			for (int l = 0; l < 16; l++) {
				System.out.println("" + d[i]

						+ d[j] + d[k] + d[l] + "\t" + Decimal);
				Decimal++;

			}
		return Decimal;
	}

	public static void main(String a[]) {
		Hexa oc = new Hexa();
		System.out.println("Hexa\tDecimal");
		oc.FourNumber();
	}
}
