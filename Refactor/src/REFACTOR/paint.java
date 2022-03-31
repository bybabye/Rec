package REFACTOR;

public class paint {
	// print the result in location(x,y) with the color(red blue,green)
	public void paintResult(Canvas canvas) {

		// do not need to rewrite this code
		System.out.println(canvas.x + ", " + canvas.y);
		System.out.println(canvas.red + ", " + canvas.blue + ", " + canvas.green);
	}
}

class Canvas {
	public int x;
	public int y;
	public byte red;
	public byte blue;
	public byte green;
	
	public Canvas() {
		// TODO Auto-generated constructor stub
	}
}
