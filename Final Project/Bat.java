
/**
 * Write a description of class Bat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat extends Enemy
{
   public Bat(int level)
   {
       super("Bat",level);
       this.setSpeed(30);
       this.addDamage((int)(level*.5));
       this.addHealth(3*level);
       this.addArmor((int)(level*.5));
       this.addCrit((int)(level*.5));
       if((this.getSpeed()+5*level)<75)
       this.addSpeed(5*level);
  }


    public void picture()
    {
            
        System.out.println("____________¶¶¶1¶¶_________¶¶¶¶¶¶¶___________");
        System.out.println("_________¶¶¶111¶¶___________¶¶111¶¶¶¶________");
        System.out.println("______¶¶¶¶1111¶¶¶____________¶¶¶1111¶¶¶1_____"); 
        System.out.println("_____¶¶¶1111¶¶¶¶_____________¶¶¶¶11111¶¶¶____"); 
        System.out.println("___¶¶¶11¶1¶1¶¶¶¶___¶¶____¶¶__¶¶¶¶¶1¶1¶1¶¶¶1__"); 
        System.out.println("__¶¶¶11¶1¶11¶¶¶¶¶__¶¶¶¶¶¶¶¶__¶¶¶¶¶1¶1¶¶11¶¶1_"); 
        System.out.println("_¶¶¶11¶¶1¶11¶¶¶¶¶¶__¶¶¶¶¶¶_¶¶¶¶¶¶¶1¶¶1¶¶1¶¶¶_"); 
        System.out.println("¶¶¶¶1¶¶11¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶1¶¶¶1¶¶¶"); 
        System.out.println("¶¶¶11¶¶11¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶1¶¶¶1¶¶¶"); 
        System.out.println("¶¶¶1¶¶¶¶1¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶1¶¶¶11¶¶"); 
        System.out.println("_¶¶11¶¶¶1¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶1¶¶¶¶1¶¶¶"); 
        System.out.println("_¶¶¶1¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶1¶¶1"); 
        System.out.println("__¶¶1¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶1¶¶¶_"); 
        System.out.println("___¶¶1¶¶¶_¶¶_______¶¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶__"); 
        System.out.println("____¶¶¶¶____________¶¶¶¶¶¶___________¶¶¶¶____"); 
        System.out.println("______¶¶¶__________¶¶¶__¶¶¶__________¶¶______"); 
        System.out.println("_______¶¶¶_________¶______¶_________¶¶¶______");

   }

}