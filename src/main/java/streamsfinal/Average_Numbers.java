package streamsfinal;

import java.util.Arrays;
import java.util.List;

public class Average_Numbers {
	public static void main(String args[]) {
		List<Integer> dou=Arrays.asList(1,2,3,4,5);
		double avg=dou.stream().
		mapToInt(i->i).
		average().orElse(-1);
		System.out.println("Average of numbers is: "+avg);
		
	}

}
