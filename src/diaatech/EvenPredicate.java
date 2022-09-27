package diaatech;

public class EvenPredicate implements UnaryPredicate<Integer> {
  public boolean test(Integer i) {
      return i/2==0; 
  }
}


