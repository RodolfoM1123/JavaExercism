import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketChecker {
	 private String expression;
	 BracketChecker(String expression) {
	        this.expression = expression;
	    }

	    boolean areBracketsMatchedAndNestedCorrectly() {
	    	boolean flag = false;
	        String regex1 = "([^\\[\\(\\{\\}\\)\\]]+)"; //matches everything except ()[]{}
	        String regex2 = "(\\(\\)|\\[\\]|\\{\\})"; //matches () or [] or {}
	       
	    	expression = expression.replaceAll(regex1, "");//leaves a cleaner expression with only () [] {}
	    	System.out.println("Before \n" + expression);
	    	if(expression.length() % 2 != 0) return flag;// if expression is not even then not all ()[]{} are complete
	    	
	        Pattern pattern = Pattern.compile(regex2);
	        Matcher matcher = pattern.matcher(expression);
	        
	        	 while(matcher.find()) {//to check if we find () {} [] inside expression 
	 	        	expression = expression.replace(matcher.group(1), "");
	 	        	System.out.println(matcher.group(1));
	 	        	matcher = pattern.matcher(expression);//we start with a new expression every cycle
	 	        }

	       
	        
	        System.out.println("After \n" + expression);
	        if(expression.isEmpty()) flag = true; //this should be true if expression only have pairs of any ()[]{}
	        
	    	return flag;
	    }
}
