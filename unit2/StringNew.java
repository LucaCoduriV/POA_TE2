package unit2;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;

class Collections 
{
   public static <T> T[] toArray(Collection<T> coll, 
      Function<Integer, T[]> constructor)
   {
      T[] result = constructor.apply(coll.size());
      Iterator<T> iter = coll.iterator();
      for (int i = 0; i < result.length; i++)
         result[i] = iter.next();
      return result;
   }
}

public class StringNew
{
   public static void main(String[] args) throws IOException
   {
      List<String> words = Files.readAllLines(Paths.get("pays.txt"));

      // TODO: Turn words into an array of type String[].

      String[] wordArray = Collections.toArray(words, String[]::new);
      Arrays.sort(wordArray);
      for (int i = 0; i < 10; i++)
         System.out.println(wordArray[i].toUpperCase());

      // Note: If wordArray was an Object[], you couldn't call 
      // wordArray[i].toUpperCase().
   }
}