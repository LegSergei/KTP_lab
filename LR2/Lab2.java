import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Создание трех точек.");
		System.out.println("Введите через пробел координаты первой точки x y z");
		String s = in.nextLine();
		String[] k = s.split(" ");
		L2Point3d FirstPoint = new L2Point3d(Double.parseDouble(k[0]),Double.parseDouble(k[1]),Double.parseDouble(k[2]));
		System.out.println("Введите через пробел координаты второй точки x y z");
		s = in.nextLine();
		k = s.split(" ");
		L2Point3d SecondPoint = new L2Point3d(Double.parseDouble(k[0]),Double.parseDouble(k[1]),Double.parseDouble(k[2]));
		System.out.println("Введите через пробел координаты третьей точки x y z");
		s = in.nextLine();
		k = s.split(" ");
		L2Point3d ThirdPoint = new L2Point3d(Double.parseDouble(k[0]),Double.parseDouble(k[1]),Double.parseDouble(k[2]));
		Lab2.compureArea(FirstPoint,SecondPoint,ThirdPoint);

	}
	// Вычисление площади треугольника, образованными тремя точками
	public static void compureArea(Object obj1, Object obj2, Object obj3)
	{
		if (((L2Point3d) obj1).Equ(obj2) | ((L2Point3d) obj1).Equ(obj3) == true)
		{
			System.out.println("Ошибка. Найдены точки с одинаковыми координатами");
			return;
		}
		double a = ((L2Point3d) obj1).distanceTo(obj2);
		double b = ((L2Point3d) obj1).distanceTo(obj3);
		double c = ((L2Point3d) obj2).distanceTo(obj3);
		double geron = 0.25 * Math.sqrt(4*Math.pow(a,2)*Math.pow(b,2) - Math.pow(Math.pow(a,2)+ Math.pow(b,2) - Math.pow(c,2),2));
		System.out.println("Площадь треугольника, образованная тремя точками равна " + geron);

	}

}


