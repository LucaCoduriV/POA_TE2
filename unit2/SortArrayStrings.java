/**
 * sort an array of strings by decreasing length.
 */
package unit2;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SortArrayStrings
{
   public static void main(String[] args) throws IOException
   {
      String[] words = Files.readAllLines(Paths.get("pays.txt")).toArray(new String[0]);

      Arrays.sort(words, (a, b) -> b.length() - a.length());

      for (int i = 0; i < 10; i++)         
         System.out.println(words[i]);
   }
}