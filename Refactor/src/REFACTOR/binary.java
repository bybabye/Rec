package REFACTOR;

public class binary {
	public binary() {
		// TODO Auto-generated constructor stub
	}

	public void FourNumber() {
		int Decimal = 0;
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				Decimal = compact(Decimal, i, j);

	}

	private int compact(int Decimal, int i, int j) {
		for (int k = 0; k < 2; k++)
			for (int l = 0; l < 2; l++) {
				System.out.println("" + i + j
						+ k + l + "\t" + Decimal);

				Decimal++;
			}
		return Decimal;
	}

	public static void main(String a[]) {
		binary oc = new binary();
		System.out.println("Binary\tDecimal");
		oc.FourNumber();
	}
}
