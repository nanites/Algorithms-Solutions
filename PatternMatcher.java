import java.util.*;
import java.util.regex.*;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
		String text = "Now is the time";    
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {            
			System.out.print(text.substring(m.start(),m.end()) + "*");
		}
	}

}
