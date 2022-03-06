package q10_RegularExpressions;

import java.util.regex.*;

public class ProRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
		String str = "Sai Krishna Rajagopal";
		
		Pattern p = Pattern.compile(pattern);
		Matcher s = p.matcher(str);
		
		while(s.find()) {
			System.out.println(str.substring(s.start(),s.end()));
		}

	}

}