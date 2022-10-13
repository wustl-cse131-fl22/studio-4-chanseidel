package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		myfalg();
	}
	
	private static void mother() {
		   StdDraw.clear();
		   StdDraw.setPenColor(255, 0, 0);
		   Color bigC = new Color(166,142,100);
		   StdDraw.setPenColor(bigC);
		   StdDraw.filledCircle(11, 8, 5);
		   Color smallC = new Color(72,47,36);
		   StdDraw.setPenColor(smallC);
		   StdDraw.filledCircle(8, 6, 0.5);
		   StdDraw.filledCircle(12, 9, 0.5);
		   StdDraw.filledCircle(14, 7, 0.5);
		   StdDraw.filledCircle(11, 5, 0.5);
		   StdDraw.filledCircle(9, 8, 0.5);
		   StdDraw.setPenColor(0, 0, 0);
		   StdDraw.setPenRadius(0.05);

		   StdDraw.rectangle(11,8, 11, 8);
		}

	public static void myfalg() {
		   StdDraw.setXscale(0, 22);
		   StdDraw.setYscale(0, 16);
		   mother();
		}
}