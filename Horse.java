
/**
 * Write a description of class Horse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Horse
{
    // instance variables - replace the example below with your own
    private int weight;
    private String name;
    private static int population;

    /**
     * Constructor for objects of class Horse
     */
    public Horse(String n, int w)
    {
        this.name = n;
        this.weight = w;
        Horse.population= population+1;
    }
    
    public static int getPop()
    {
        return population;
    }

    private void doStuff()
    {
        
    }
    
    public String getName()
    {
        
        return this.name;
    }
    
    public String toString()
    {
        return this.name +" " + this.weight;
    }
}
