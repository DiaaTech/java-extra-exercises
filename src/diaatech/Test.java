package diaatech;

import java.util.Arrays;
import java.util.Collection;

public class Test {
	    public static void main(String[] args) {
	        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
	        int count = CountAlgorithm.countIf(ci, new EvenPredicate());
	        System.out.println("Number of Even integers = " + count);
	    }
	}

