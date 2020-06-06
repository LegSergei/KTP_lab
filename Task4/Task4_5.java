
public class Task4_5 {

	public static void main(String[] args) 
	{
		String mass = args[0] + " " + args[1];
		String height = args[2] + " " + args[3];
		System.out.println(BMI(mass, height));
		
	}
	public static String BMI(String mass, String height)
	{
		double m = Double.parseDouble(mass.substring(0, mass.indexOf(" ")));
		String mass_id = mass.substring(mass.indexOf(" ") + 1);
		double h = Double.parseDouble(height.substring(0, height.indexOf(" ")));
		String height_id = height.substring(height.indexOf(" ") + 1);
		if (mass_id.equals("pounds")) { m = m * 0.45;}
		if (height_id.equals("inches")) { h = h * 0.025;}
		double rez = m/Math.pow(h, 2);
		if (rez < 18.5) {return String.format("%.1f", rez) + " " + "Underweight";}
		else if (rez >= 25) {return String.format("%.1f", rez) + " " + "Overweight";}
		else { return String.format("%.1f", rez) + " " + "Normalweight";}
	}
}
