
/**
 * Write a description of class junk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HorseBarn
{
    private Horse[] spaces;
    public HorseBarn()
    {
        spaces = new Horse[7];
        spaces[0] = new Horse("Trigger", 1340);
        spaces[2] = new Horse("Silver", 1210);
        spaces[5] = new Horse("Patches", 1350);
        spaces[6] = new Horse("Duke", 1410);
       
    }
    public void consolidate()
    {
        Horse[] b = new Horse[spaces.length];
        int newIndex = 0;
        for(int i = 0; i<spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                b[newIndex] = spaces[i];
                newIndex++;
            }
        }

        spaces=b;        
    }
    
    public void outputTest()
    {
        System.out.println(this.spaces[1]);
    }

    
    public static void main()
    {
        HorseBarn j = new HorseBarn();
        j.outputTest();
        j.consolidate();
        j.outputTest();
    }
    
    
    
}   