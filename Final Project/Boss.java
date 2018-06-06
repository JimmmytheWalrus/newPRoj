
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Boss extends Creature
{
   String description;
   String name;
    public Boss(String xname, String xdescription)
    {
        super(100, 25,0,0,0);
        name = xname;
        description = xdescription;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract void picture();
}
