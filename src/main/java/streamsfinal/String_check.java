package streamsfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class String_check {
		public static void main(String args[]) {
			List<String> list=Arrays.asList("amp","ant","bat","cat","dark","aunt","lazy","cozy","epam");
			List<String> valid=filterValidStrings(list,(String str)->(str.charAt(0)=='a' && str.length()==3));
			System.out.println(valid);
		}
		public  static List<String> filterValidStrings(List<String> list, Predicate<String> predicate) {
			List<String> m=new ArrayList<>();
			for(String str:list) {
				if(predicate.test(str)) {
					m.add(str);
				}
			}
			return m;
		}


}
