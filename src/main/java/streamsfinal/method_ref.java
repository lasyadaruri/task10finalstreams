package streamsfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class method_ref {
	public static void main(String args[]) {
		List<String> list=Arrays.asList("aba","level","dom","epam","abba","ppxpp","xcvfd","rampy");
		Predicate<String> valid=((String str) -> isPalindrome(str));
		List<String> m=filterPalindromes(list,valid);
		System.out.println(m);
	}
	public static List<String> filterPalindromes(List<String> list,Predicate<String> predicate){
		List<String> x=new ArrayList<>();
		for(String str : list) {
			if(predicate.test(str)) {
				x.add(str);
			}
		}
		return x;
	}
	public static boolean isPalindrome(String str) {
		String or=str;
		int len=str.length();
		String emp="";
		for(int i=len-1;i>=0;i--) {
			emp=emp+str.charAt(i);
			
		}
		if(emp.equals(or)) {
			return true;
		}
		else {
			return false;
		}

}

}
