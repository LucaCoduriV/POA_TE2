package unit2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

class Words
{
   public static int vowels(String w)
   {
      return w.length() - w.toLowerCase().replaceAll("[aâàäæeéêèëiîïoôœöuûùüyÿ]", "").length();
   }
}

public class ComparatorStatic
{
   public static void main(String[] args) throws IOException
   {
      List<String> words = Files.readAllLines(Paths.get("pays.txt"));
      Collections.sort(words, Comparator.comparing(Words::vowels).thenComparing(String::compareTo));
      System.out.println(words);
   }
}