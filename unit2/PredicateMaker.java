package unit2;

import java.util.function.Predicate;

public class PredicateMaker
{
   public static Predicate<String> longerThan(int n)
   {
      return (s) -> s.length() > n;
   }
}