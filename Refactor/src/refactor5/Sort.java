package refactor5;

public class Sort {
	int a;
	int b;
	int c;

	public void ascSort() {
		swapTwoValue(a,b);
		swapTwoValue(a,c);
		swapTwoValue(b,c);
	}

	private void swapTwoValue(int value1 , int value2) {
		if (value1 > value2) {
			int temp = value1;
			value1 = value2;
			value2 = temp;
		}
	}
}
