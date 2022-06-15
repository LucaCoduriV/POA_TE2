package unit2;

import java.util.*;
import java.util.function.*;

// TODO: Make this method receive and return an array.
// Accept a constructor expression for constructing the 
// returned array.

public class FilterReimpl
{
   public static <T> T[] filter(T[] values, Predicate<T> p, IntFunction<T[]> g)
   {
      List<T> result = new ArrayList<>();
      for (T value : values)
      {
         if (p.test(value)) { result.add(value); }
      }
      T[] a = g.apply(result.size());
      int i = 0;
      for(T value : result){
         a[i++] = value;
      }
      return a; 
      // return result.stream().toArray(g);
   }
}