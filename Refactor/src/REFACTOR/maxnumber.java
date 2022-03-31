package REFACTOR;

public class maxnumber {
	public maxnumber() {
		
	}

	public int max2(int a, int b) {
		return a >= b ?  a : b;
	}

	public int max3(int a, int b, int c) {
		return a >= max2(b, c) ?  a : max2(b, c) ;
	}
}
