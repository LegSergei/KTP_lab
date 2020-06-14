import java.util.*;
import javax.script.*;

public class Task6_9 {
	
	public static void main(String[] args) throws ScriptException 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите формулу: ");
		String s = in.nextLine();
		System.out.println(formula(s));
		in.close();
	}


	public static boolean formula(String s) throws ScriptException 
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
    	ScriptEngine engine = mgr.getEngineByName("JavaScript");
    	ArrayList<String> formula = new ArrayList<>(Arrays.asList(s.split("=")));
    	double result1;
    	double result2;
    	for (int i = 0; i < formula.size() - 1; i++) 
    	{
    		result1 = Double.parseDouble(engine.eval(formula.get(i)).toString());
    		result2 = Double.parseDouble(engine.eval(formula.get(i + 1)).toString());
    		if (result1 != result2) return false;
    	}
    	return true;
	}
}
