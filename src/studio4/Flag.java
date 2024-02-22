package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(227, 5, 5);
		StdDraw.filledRectangle(.5, .5, .5, .25);
		StdDraw.setPenColor(5, 97, 29);
		StdDraw.filledEllipse(.5, .5, .15, .15);
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(.5, .5, .5, .25);
		
		
	}
}