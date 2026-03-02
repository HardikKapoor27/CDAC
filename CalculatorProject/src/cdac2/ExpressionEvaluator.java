package cdac2;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ExpressionEvaluator {
	
	 private static final ScriptEngine engine =
	        new ScriptEngineManager().getEngineByName("JavaScript");
	 
	 public static double evaluate(String expression) throws Exception {
		 
	        Object result = engine.eval(expression);
	        return Double.parseDouble(result.toString());
	    }

}