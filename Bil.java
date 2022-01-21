import java.io.*;
import java.util.*;

public class Bil
{
    private String brand;
    private String color;

    /**
     * Creates a car with a random name and color.
     */
    public Bil()
    {
        Random r = new Random();
        List<String> possibleBrands = Arrays.asList("Lambo", "Ferrari", "McLaren", "Pagani");
        List<String> possibleColors = Arrays.asList("hvit", "svart", "rød", "oransje");
        brand = possibleBrands.get(r.nextInt(possibleBrands.size()));
        color = possibleColors.get(r.nextInt(possibleColors.size()));
    }

    /**
     * Gets a brief description of the car.
     */
    public String getDescription()
    {
        return "Farge: " + color + ", Bilmerke: " + brand;
    }

    /**
     * Sets a new color for the car.
     */
    public void setColor(String color)
    {
        this.color = color;
    }
}










