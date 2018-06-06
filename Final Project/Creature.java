
/**
 * DogNameSet stores set of String objects in no particular order
 * and contains no duplicates; each name is a sequence of capital
 * letters only.
 * 
 * @author (Corricelli) 
 * @version (5/1/18)
 */
import java.util.ArrayList;

public abstract class Creature
{
    // String of DogNames
    int health;
    int damage;
    int armor;
    int critChance;
    int speed;
    String name;
    String description;
    /**
     * constructs a creature
     */
    public Creature(int xhealth, int xdamage, int xarmor, int xCritChance, int xSpeed)
    {
       health = xhealth;
       damage = xdamage;
       armor = xarmor;
       critChance = xCritChance;
       speed = xSpeed;
    }

    /**
     *calculates the damage that will be done, and if it is a
     *critical hit it deals double the damage value;
     */
    public int damageCalc()
    {
        int crit = (int) (Math.random()*100);
        if(crit<critChance)
            {
                System.out.println("Critical Hit!");
                return damage*2;
            }
        return damage;
    }
    
    public int heavyDamageCalc()
    {
        int attack = (int)(damage*1.5);
        int miss = (int) (Math.random()*100);
        int crit = (int) (Math.random()*100);
        if (miss<=25)
        {
            return 0;
        }
        if(crit<critChance)
            {
                System.out.println("Critical Hit!");
                return attack*2;
            }
        return attack;
    }
    
    /** calculates the damage that is being taken and subracts 
     * this from creature's health, but nothing happens if it dodges
     */
    public int recieveCalc(int damage)
    {
        int armorReduc = (armor+100);
        System.out.println("ARMOR+100"+armorReduc);
        double percentTaken= 100.0/armorReduc;
        System.out.println("BLOCKED"+percentTaken);
        damage = (int)(damage*percentTaken+.5);
        System.out.println("DAMAGE"+damage);
        int dodge= (int)(Math.random()*100);
        //System.out.println("dodge "+dodge);
        //System.out.println("speed "+speed);
        if(dodge>speed)
        {
            health-=damage;
            isAlive();
        }
        else 
            damage=0;
        return damage;
        
        //dead();
    }
    
    /** Checks if creature's health is above 0
     */
    public boolean isAlive()
    {
        if (health<=0)
            return false;
        return true;
    }
    
    public void addHealth(int num)
    {
        health+=num;
    }
    
    
    public void addDamage(int num)
    {
        damage+=num;
    }
    
    
    public void addArmor(int num)
    {
        armor+=num;
    }
    
  
    public void addCrit(int num)
    {
        critChance+=num;
    }
    
    public void addSpeed(int num)
    {
        speed+=num;
    }
    
    ////////////////////////////////////////////////////////////
    
    public void setHealth(int num)
    {
        health=num;
    }
    
    
    public void setDamage(int num)
    {
        damage=num;
    }
    
    
    public void setArmor(int num)
    {
        armor=num;
    }
    
  
    public void setCrit(int num)
    {
        critChance=num;
    }
    
    public void setSpeed(int num)
    {
        speed=num;
    }
    
    /////////////////////////////////////////////////////////////////////
    
    public int getHealth()
    {
        return health;
    }
    
    
    public int getDamage()
    {
        return damage;
    }
    
    
    public int getArmor()
    {
        return armor;
    }
    
  
    public int getCrit()
    {
        return critChance;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public String toString()
    {
        
        String a = "Stats:";
        String b = "Health:"+this.getHealth();
        String c = "Damage:"+this.getDamage();
        String d = "Armor:"+this.getArmor();
        String e = "CritChance:"+this.getCrit()+"%";
        String f = "Speed:"+this.getSpeed();
        return a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n";
    }
}
