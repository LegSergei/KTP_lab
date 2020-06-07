import java.awt.geom.Rectangle2D;

// ƒанный класс определ€ет начальные координаты и пределы последовательности ћандельброта, а также определ€ет, принадлежит ли точка
// множеству ћандельброта, или на сколько близко она к нему располагаетс€.

public class Mandelbrot extends FractalGenerator
{
	
//  оличество итераций, наобходимое дл€ определени€ принадлежности точки множеству.
	public static final int MAX_ITERATIONS = 700;
	
	public Mandelbrot() 
	{
		
	}
	
	public void getInitialRange(Rectangle2D.Double range)
	{
		range.x = -2;
		range.y = -1.5;
		range.width = 3;
		range.height = 3;
	}
	

// ≈сли значени€ Z в рекуррентной формуле Z(n+1) = Z(n)^2 + c стремитс€ к бесконечности то  точка находитс€ за пределами фрактала.
// ≈сли значение Z колеблетс€ в пределах фрактала: |Z| < 2, значит точка принадлежит множеству ћандельброта.
// ѕри преобразовании формулы множества ћандельброта в итеративную последовательность значений координат на плоскости, тогда
// формула пример следующий вид: 
//	X(n+1) X(n)^2 - Y(n)^2 + X(0); 
//	Y(n+1) = 2 *  X(n) * Y(n) + Y(0);
// ј ограничение примет вид: 
//	X(n)^2 + Y(n)^2 < 4.

	public int numIterations(double x, double y) 
	{
		int iteration = 0;
		double Re = 0;
		double Im = 0;
		
		while ((iteration < MAX_ITERATIONS) && ((Re * Re + Im * Im) < 4)) 
		{
			double r = Re * Re - Im * Im + x;
			double i = 2 * Re * Im + y;
			Re = r;
			Im = i;
			iteration += 1;
		}
		
		// -1 - точка принадлежит последовательности, iteration - не принадлежит. “акже определ€етс€, на сколько она близко.
		if (iteration == MAX_ITERATIONS) { return -1; }
		else { return iteration;}
	}
	
	public String toString() 
	{
		return "Mandelbrot";
	}
}
