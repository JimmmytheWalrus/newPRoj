

public abstract class Enemy extends Creature
{
    int health;
    int damage;
    int armor;
    int critChance;
    int speed;
    
    public int xp;
    public String name;
    public int level;
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy(String xName, int xLevel)
    {
        super(30, 10, 0, 0, 0);
        xp = 25;
        name = xName;
        level = xLevel;
    }
    
    
    
    public boolean isAlive()
    {
        if (getHealth()<=0)
            {
                return false;
                //Player.addXp(getXp());
            }
        return true;
    }

    /**
     *
     */
    public void setXp(int y)
    {
        xp = y;
    }
    
    public int getXp()
    {
        return xp;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public abstract void picture();
    
}
