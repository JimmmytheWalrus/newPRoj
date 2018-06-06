
/**
 * Write a description of class Bat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hedgehog extends Enemy
{
   public Hedgehog(int level)
   {
       super("Hedgehog",level);
       this.setHealth(250);
       this.addDamage((int)(level*.1));
       this.addHealth(10*level);
       this.addArmor((int)(level*2));
       this.addCrit((int)(level*3));
       
       //this.addSpeed(5*level);
  }


    public void picture()
    {
    System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼█┼█┼█┼█┼█┼█┼█┼█┼█");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼█┼█████████████████┼█");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼█┼█████████████████████┼█");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼█┼█████████████████████████┼█");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼█████████████████████████████┼█");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼█████████████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼███████████████████████████████┼");
System.out.println("┼┼┼┼┼┼┼┼┼┼███████████████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼█████████████████████████████████┼");
System.out.println("┼┼┼┼┼┼┼┼┼█████████████████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼┼███████████████████████████████████┼");
System.out.println("┼┼┼┼┼┼┼┼███████████████████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼█████████████████████████████████████┼");
System.out.println("┼┼┼┼┼┼┼┼┼┼▒▒███████████████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼▒▒▒▒█████████████████████████████████┼");
System.out.println("┼┼┼┼┼┼┼┼▒▒░░▒██████████████████████████████████");
System.out.println("██┼┼┼┼▒▒▒▓▓░▒▒████████████████████████████████┼");
System.out.println("██▒▒▒▒▒▒▒█▓▒▒▒█████████████████████████████████");
System.out.println("┼▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████████████████████████████┼");
System.out.println("┼┼▒▒▒▒▒▒▒▒▒▒░░▒▒█████████████████████████████┼");
System.out.println("┼┼┼▒▒▒▒▒▒▒▒░░░░▒▒█████████████████████████████");
System.out.println("┼┼┼┼▒▒▒▒▒▒▒░░░░▒▒███████████████████████████┼");
System.out.println("┼┼┼┼┼▒▒▒▒▒▒▒░░▒▒▒████████████████████████████");
System.out.println("┼┼┼┼┼┼┼▒▒█▒▒▒▒▒▒█████████████████████████");
System.out.println("┼┼┼┼┼┼┼┼┼┼▒▒▒▒┼┼┼┼▒▒█▒█████████████▒▒█▒┼██┼");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼▒▒▒▒▒▒▒█┼█┼███┼█┼▒▒▒▒▒▒▒┼┼");
System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼▒▒▒▒▒▒┼┼┼┼┼┼┼┼┼┼┼▒▒▒▒▒▒┼┼");
System.out.println("");
        
  }

}