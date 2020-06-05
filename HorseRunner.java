public class HorseRunner
{
    public void main(String[] args)
    {
        Horse h1 = new Horse("Zinny", 1115);
        System.out.println(h1);
        
        
    }
    
    public static void tester(int x)
    {
        if( x>-1)
            HorseRunner.tester(x-1);
    }
}