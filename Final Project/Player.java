

public class Player extends Creature
{
    // instance variables - replace the example below with your own
    public int level;
    public int xp;
    public int xpForLevel;
    public int maxHealth;
    public int block;
     //maybe add in quick power and liught attack with diff RNG
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        super(100, 15, 0, 0 , 0);
        maxHealth = 100;
        xp = 0;
        level = 1;
        xpForLevel = 100;
        block = 35;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void levelUp()
    {
        if (xp>=xpForLevel)
        {
            xp -=xpForLevel;
            level++;
            xpForLevel = (int)(xpForLevel*1.5);
            maxHealth+=10;
            setHealth(maxHealth);
            addDamage(3);
            addArmor(5);
            addCrit(1);
            addSpeed(1);
            addBlock(3);
            System.out.println();
            System.out.println("Level up! level: "+level);
            System.out.println();
            
            System.out.println("Your new stats:");
            System.out.println("Health:"+this.getHealth());
            System.out.println("Damage:"+this.getDamage());
            System.out.println("Armor:"+this.getArmor());
            System.out.println("Crit Chance:"+this.getCrit()+"%");
            System.out.println("Block Chance:"+this.getBlock()+"%");
            System.out.println("Speed:"+this.getSpeed());
        }
    }
    
    public void addXp(int x)
    {
        xp+=x;
        levelUp();
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public int getBlock()
    {
        return block;
    }
    
    public void addBlock(int x)
    {
        block+=x;
    }
    
    public void heal()
    {
        int heal = (int)(maxHealth*.15);
        if (health+heal>maxHealth)
        health = maxHealth;
        health+=heal;
        System.out.println("You healed yourself by "+heal+" health (Your current health: "+health);
    }
    
    public int getXpForLevel()
    {
        return xpForLevel;
    }
}
