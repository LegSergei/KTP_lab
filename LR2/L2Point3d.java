
public class L2Point3d {
	//  Координаты точки
	private double xCoord;
	private double yCoord;
	private double zCoord;
	// Создание точки по заданным координатам
	public L2Point3d( double x, double y, double z)
	{
		xCoord = x;
		yCoord = y;
		zCoord = z;
		System.out.println("Точка создана");
	}
	// Создание точки по умолчанию
	public L2Point3d()
	{
		this(0.0, 0.0, 0.0);
	}
	// Получение соответствующей координаты точки
	public double getX()
	{
		return xCoord;
	}
	public double getY()
	{
		return yCoord;
	}
	public double getZ()
	{
		return zCoord;
	}
	// Изменение соответствующей координаты точки
	public void setX(double val)
	{
		xCoord = val;
	}
	public void setY(double val)
	{
		yCoord = val;
	}
	public void setZ(double val)
	{
		zCoord = val;
	}
	// Проверка равенства координат точек;
	public boolean Equ(Object obj)
	{
		return this.xCoord == ((L2Point3d) obj).getX() & this.yCoord == ((L2Point3d) obj).getY() & this.zCoord == ((L2Point3d) obj).getZ();
	}
	// Расчет дистанции между данной точкой и выбранной
	public double distanceTo(Object obj)
	{
		double dis = Math.sqrt(Math.pow((((L2Point3d) obj).getX() - this.xCoord), 2) + Math.pow((((L2Point3d) obj).getY() - this.yCoord), 2) + Math.pow((((L2Point3d) obj).getZ() - this.zCoord), 2));		
		return Math.round(dis * 100)/100.0;
	}
}
