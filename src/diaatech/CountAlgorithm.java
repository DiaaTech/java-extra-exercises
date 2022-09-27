package diaatech;

import java.util.Collection;

public class CountAlgorithm {
	 public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
	        int count = 0;        
	        for (T elem : c)
	            if (p.test(elem))
	                ++count;
	        return count;
	    }
	}

