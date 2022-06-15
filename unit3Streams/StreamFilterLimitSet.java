package unit3Streams;

import java.util.*;
import java.util.stream.*;

public class StreamFilterLimitSet
{
   public Set<String> firstShortStrings(Collection<String> strings,
      int n, int maxLength)
   {
      return strings.stream()
         .filter((x) -> x.length() <= maxLength) 
         .limit(n)
         .collect(Collectors.toSet());
   }
}