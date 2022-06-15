package unit3Streams;

import java.util.stream.*;

public class StreamOf
{
   public static Stream<String> letters(String word)
   {
      
      return Stream.of(word.split(""));
   }

   public static Stream<String> stars() 
   {
      return Stream.iterate("*", (s) -> s + "*");
   }
}