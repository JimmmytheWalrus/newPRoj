
/**
 * Write a description of class Bat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turtle extends Enemy
{
   public Turtle(int level)
   {
       super("Turtle",level);
       this.setHealth(150);
       this.setDamage(4);
       this.addDamage((int)(level*.1));
       this.addHealth(10*level);
       this.addArmor((int)(level*2));
       this.addCrit((int)(level*3));
       
       //this.addSpeed(5*level);
  }


    public void picture()
    {
    System.out.println("___________________$$$$$$$$");
    System.out.println("_________________$$$_$$$$$_$$");
    System.out.println("_______________$$$$$$$$$_$$$$$$");
    System.out.println("_____________$$$$$_$$$_$$$_$$$$$");
    System.out.println("__$$$$$$____$$$$_$$$_$$$_$$$_$$$$");
    System.out.println("_$¶_$¶_$$$_$$$_$$$_$$$_$$$_$$$_$$$");
    System.out.println("_$______$_$$_$$$_$$$_$$$_$$$_$$$_$$$__$$");
    System.out.println("__$_$__$__$$$$_$$$_$$$_$$$_$$$_$$$$$$_$$");
    System.out.println("___$$$_$$$$$$$$$$$$$$$$$_$$$$$$$$$$$$$");
    System.out.println("____________$$$$$$$_$$$$$$$_$_$$$$");
    System.out.println("__________$$_$___$$_$____$$_$___$_$");
    System.out.println("_________$$$$$__$$$$$___$$$$$__$$$$$");
    
        
  }

}