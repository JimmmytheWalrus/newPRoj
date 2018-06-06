
import java.util.Scanner;
public class World 
{
    static int bossCount=0;
    int input;
    Scanner scan = new Scanner(System.in);
    public  void main(String [] args)
    {
        System.out.println("");
        Player p = new Player();
        System.out.println("Your starting stats:");
        System.out.println("Health:"+p.getHealth());
        System.out.println("Damage:"+p.getDamage());
        System.out.println("Armor:"+p.getArmor());
        System.out.println("Speed:"+p.getSpeed());
        System.out.println("Crit Chance:"+p.getCrit()+"%");
        System.out.println("Block Chance:"+p.getBlock()+"%");
       
       
         for (int j=0;j<10;j++)
         {
         for(int i =0; i<5;i++)
            {
                int levelM = p.getLevel();
                int higherOrLower =(int) (Math.random()*2);
                int level = (int) (Math.random()*3+1);//moster can be player's level + or - 3
                if (higherOrLower>=1)
                    level*=-1;
                if ((p.getLevel()+level)>=0)
                levelM = p.getLevel()+level;
                System.out.println();
                String x = null;
                while (x==null)
                {
                System.out.println("Press ENTER to continue");
                Scanner newScanner = new Scanner(System.in);
                x = newScanner.nextLine();
               }
               encounter(p, levelM);
                if (!p.isAlive())
                {
                    break;
                }
            }
         if (!p.isAlive())
                {
                    System.out.println("YOU DIED!");
                    System.out.println("Game Over");
                    break;
                }
         bossCount++;
         bossEncounter(p, bossCount);
        
       }
       // Enemy x = new Enemy();
        //System.out.println(x.damageCalc());
    }
    
    public  void encounter(Player p, int level)
    {
        int blockChance;
        int rand = (int) (Math.random()*3);
        Enemy x;
        if (rand == 0)
        {
            x = new Wolf(level);
        }  
        else if (rand == 1) 
        {
            x = new Bat(level);
        }  
        else if (rand == 2) 
        {
            x = new Turtle(level);
        }
        else
        {
            x = new Wolf(level);
        }  
        System.out.println("You encountered a "+x.getName()+"! (level:"+" "+level+")");
        x.picture();
        System.out.println("Would you like to see the "+x.getName()+"'s stats? (1= yes, 2= no)");
        int check = scan.nextInt();
        if (check == 1)
            System.out.println(x);
        while(p.isAlive()&x.isAlive())
        {
            blockChance=0;
            System.out.println("What would you like to do? (1=quick attack, 2=heavy attack, 3=heal, 4=block)");
            System.out.println();
            while (!scan.hasNextInt())
            {
                System.out.println("Invalid input, (1=quick attack, 2=heavy attack)");
                scan.nextLine();
            }
            input = scan.nextInt();// add while loop to check for correct inputs
            int dDealt;
            int dTaken;
            if (input==1)
            {
                dDealt = p.damageCalc();
                
            }
            else if (input==2)
            {
                dDealt = p.heavyDamageCalc();
                if (dDealt == 0)
                System.out.println("You missed your attack");
            }
            else if (input==3)
            {
                p.heal(); 
                dDealt = 0;
            }
            else if (input==4)
            {
                blockChance = p.getBlock(); 
                dDealt = 0;
            }
            else
            {
                return;
            }   
            dTaken = x.recieveCalc(dDealt);
            if (dTaken == 0 && !(dDealt==0))
            System.out.println("Your attack was dodged");
            System.out.println("You dealt "+dTaken+" damage ("+x.getName()+"'s current health "+x.getHealth()+")");
            if (!x.isAlive())
            {
             System.out.println("You killed the "+x.getName());
             System.out.println();
             int xp = x.getXp();
             p.addXp(xp);
             System.out.println("You gained "+xp+" xp");
            }
            System.out.println();
            System.out.println();
            dDealt = x.damageCalc();
            if (x.isAlive())
            {
                 rand = (int) (Math.random()*100);
                 System.out.println("The enemy attacked!");
                 if (rand>blockChance || (dDealt==0))
                 {
                 
                 dTaken = p.recieveCalc(dDealt);
                 System.out.println();
                 if (dTaken == 0)
                 System.out.println("You dodged the attack");
                 System.out.println("You took "+dTaken+" damage (Your current health "+p.getHealth()+")");
                 System.out.println();
                }
                else 
                System.out.println("You blocked the attack!");
            }
        }
        
        
        //System.out.println("encounter");
    }
    
    public void bossEncounter(Player p,int count)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("You encountered a boss!");
        Boss x;
        int blockChance;
        int rand;
        if (count == 1)
           x = new SkeletonKing();
        else if (count == 2)
           x = new Dragon();
        else 
            x = new Ricky();
        x.picture();
        System.out.println(x.getDescription());
        System.out.println("You encountered a "+x.getName());
        
        System.out.println("Would you like to see the "+x.getName()+"'s stats? (1= yes, 2= no)");
        int check = scan.nextInt();
        if (check == 1)
            System.out.println(x);
        while(p.isAlive()&x.isAlive())
        {
            blockChance=0;
            System.out.println("What would you like to do? (1=quick attack, 2=heavy attack, 3=heal, 4=block)");
            System.out.println();
            while (!scan.hasNextInt())
            {
                System.out.println("Invalid input, (1=quick attack, 2=heavy attack)");
                scan.nextLine();
            }
            input = scan.nextInt();// add while loop to check for correct inputs
            int dDealt;
            int dTaken;
            if (input==1)
            {
                dDealt = p.damageCalc();
                
            }
            else if (input==2)
            {
                dDealt = p.heavyDamageCalc();
                if (dDealt == 0)
                System.out.println("You missed your attack");
            }
            else if (input==3)
            {
                p.heal(); 
                dDealt = 0;
            }
            else if (input==4)
            {
                blockChance = p.getBlock(); 
                dDealt = 0;
            }
            else
            {
                return;
            }   
            dTaken = x.recieveCalc(dDealt);
            if (dTaken == 0 && !(dDealt==0))
            System.out.println("Your attack was dodged");
            System.out.println("You dealt "+dTaken+" damage ("+x.getName()+"'s current health "+x.getHealth()+")");
            if (!x.isAlive())
            {
             System.out.println("You killed the "+x.getName());
             System.out.println();
             int xp = p.getXpForLevel();
             p.addXp(xp);
             System.out.println("You gained "+xp+" xp");
            }
            System.out.println();
            System.out.println();
            dDealt = x.damageCalc();
            if (x.isAlive())
            {
                 rand = (int) (Math.random()*100);
                 System.out.println("The enemy attacked!");
                 if (rand>blockChance || (dDealt==0))
                 {
                 
                 dTaken = p.recieveCalc(dDealt);
                 System.out.println();
                 if (dTaken == 0)
                 System.out.println("You dodged the attack");
                 System.out.println("You took "+dTaken+" damage (Your current health "+p.getHealth()+")");
                 System.out.println();
                }
                else 
                System.out.println("You blocked the attack!");
            }
        }
    }
    
}