import java.awt.geom.Rectangle2D;

// ������ ����� ���������� ��������� ���������� � ������� ������������������ ������������, � ����� ����������, ����������� �� �����
// ��������� ������������, ��� �� ������� ������ ��� � ���� �������������.

public class Mandelbrot extends FractalGenerator
{
	
// ���������� ��������, ����������� ��� ����������� �������������� ����� ���������.
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
	

// ���� �������� Z � ������������ ������� Z(n+1) = Z(n)^2 + c ��������� � ������������� ��  ����� ��������� �� ��������� ��������.
// ���� �������� Z ���������� � �������� ��������: |Z| < 2, ������ ����� ����������� ��������� ������������.
// ��� �������������� ������� ��������� ������������ � ����������� ������������������ �������� ��������� �� ���������, �����
// ������� ������ ��������� ���: 
//	X(n+1) X(n)^2 - Y(n)^2 + X(0); 
//	Y(n+1) = 2 *  X(n) * Y(n) + Y(0);
// � ����������� ������ ���: 
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
		
		// -1 - ����� ����������� ������������������, iteration - �� �����������. ����� ������������, �� ������� ��� ������.
		if (iteration == MAX_ITERATIONS) { return -1; }
		else { return iteration;}
	}
	
	public String toString() 
	{
		return "Mandelbrot";
	}
}
