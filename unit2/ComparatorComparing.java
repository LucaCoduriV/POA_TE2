package unit2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ComparatorComparing
{
   public static void main(String[] args) throws IOException
   {
      List<Country> countries = new ArrayList<>();
      for (String input : Files.readAllLines(Paths.get("countries.csv")))
         countries.add(Country.fromString(input));

      System.out.println("Smallest Populations");
      Collections.sort(countries, Comparator.comparing(c -> c.getPopulation()));

      for (int i = 0; i < 10; i++)         
         System.out.println(countries.get(i));

      System.out.println("\nSmallest Population Densities");
      Collections.sort(countries, Comparator.comparing(c -> c.getPopulation() / c.getArea()));

      for (int i = 0; i < 10; i++)         
         System.out.println(countries.get(i));
   }

}

class Country
{
   private String name;
   private int population;
   private double area;

   /**
      Constructs a country.
      @param aName the name of the country
      @param aPopulation the population of the country
      @param anArea the area of the country
   */
   public Country(String aName, int aPopulation, double anArea) 
   { 
      name = aName;
      population = aPopulation;
      area = anArea; 
   }

   /**
      Gets the country name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea() 
   {
      return area;
   }
   
   /**
      Gets the population of the country.
      @return the population
   */
   public int getPopulation() 
   {
      return population;
   }

   public static Country fromString(String input)
   {
      String[] inputs = input.split(";");
      return new Country(inputs[0], Integer.parseInt(inputs[1]),
         Double.parseDouble(inputs[2]));
   }
   
   public String toString()
   {
      return (name + ";" + population + ";" + area).replaceAll(".0$", "");
   }
}

