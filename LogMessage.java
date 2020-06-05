
/**
 * Write a description of class LogMessage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LogMessage
{
    private String machineId;
    private String description;
    
    public LogMessage(String message)
    {
        int colIndex = message.indexOf(":");
        this.machineId = message.substring(0, colIndex);
        this.description = message.substring(colIndex+1);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getMachineId()
    {
        return this.machineId;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public boolean containsWord(String key)
    {
        int keyIndex = this.description.indexOf(key);
        if(keyIndex==-1)
            return false;
        else
        {   //Test left side of key
            if(keyIndex == 0 || this.description.substring(keyIndex-1, keyIndex).equals(" "))
            {
                int endIndex = keyIndex+key.length();
                if( endIndex == this.description.length() ||
                    this.description.substring(endIndex, endIndex+1).equals(" "))
                {
                    return true;
                }
            }
            return false;      
        }
    }
    
    public static void main(String[] args)
    {
        LogMessage mess = new LogMessage("Server1:file not found");
        System.out.println(mess.containsWord("find"));
        
    }
}

