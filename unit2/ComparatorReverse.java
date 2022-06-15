package unit2;

import java.util.*;

public class ComparatorReverse
{
   public static <T> Comparator<T> reverse(Comparator<T> comp)
   {
      return (a, b) -> comp.compare(b, a);
   }
}