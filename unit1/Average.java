package unit1;

import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String[] words = in.nextLine().split(" ");

      
      double result = Data.average(words, w -> w.length());
      System.out.println("Average word length: " + result);
   }

   
}

public class Data
{
   public static <T> double average(T[] objects, Measurer<T> meas)
   {
      double sum = 0;
      for (T obj : objects) 
      {
         sum = sum + meas.getMeasure(obj);
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}
Measurer.java

interface Measurer<T>
{
   public double getMeasure(T obj);
}