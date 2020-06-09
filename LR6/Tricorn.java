import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator 
{
	
	public static final int MAX_ITERATIONS = 200;
	
	public Tricorn() 
	{
		
	}
	 
	public void getInitialRange(Rectangle2D.Double range) 
	{
		range.x = -2;
		range.y = -2;
		range.width = 4;
		range.height = 4;
	}
	

	public int numIterations(double x, double y) 
	{
		double Re = 0;
		double Im = 0;
		int iterations = 0;
	
		while (iterations < MAX_ITERATIONS && Re * Re + Im * Im < 4) 
		{
			double r = Re * Re - Im * Im + x;
			double i = -2 * Re * Im + y;
			Re = r;
			Im = i;
			iterations += 1;
		}
		
		if (iterations == MAX_ITERATIONS) { return -1; }
		return iterations;
	}
	

	public String toString() 
	{
		return "Tricorn";
	}
}