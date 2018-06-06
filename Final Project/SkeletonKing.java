
/**
 * Write a description of class Boss1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SkeletonKing extends Boss
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Boss1
     */
    public SkeletonKing()
    {
       super("The Skeleton King","Description of boss 1(addlater)");
    }
    
    public void picture()
    {
        System.out.println("░░░░░░░░░░░░░░░░▓██████▓▓▓░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░█████▓▓█████████▓░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░█████▓░░▓█████████████░░░░░░░░░");
        System.out.println("░░░░░░░░▓███▓░░░▓█████████████████░░░░░░░");
        System.out.println("░░░░░░░███▓░░░░░███████████████████▓░░░░░");
        System.out.println("░░░░░░███░░░░░░██████████████████████░░░░");
        System.out.println("░░░░░███░░░░░░░███████████████████████░░░");
        System.out.println("░░░░███░░░░░░░░███████░░░░██████████▓█▓░░");
        System.out.println("░░░███▓░░░░░░░░███████░░░░▓██████████▓█░░");
        System.out.println("░░▓███░░░░░░░░░░██████▓░░▓███████████▓██░");
        System.out.println("░░████░░░░░░░░░░▓████████████████████▓▓█░");
        System.out.println("░▓█░█▓░░░░░░░░░░░░████████████████████░██");
        System.out.println("░██░█░░░░░░░░░░░░░░▓██████████████████░██");
        System.out.println("░█▓░█░░░░░░░░░░░░░░░░░▓███████████████░▓█");
        System.out.println("▓█▓░█▓░░░░░░░░░░░░░░░░░░██████████████░░█");
        System.out.println("██░░██░░░░░░░░░░░▓▓░░░░░░▓████████████░░█");
        System.out.println("██░▓░█░░░░░░░░░░████▓░░░░░███████████▓░░█");
        System.out.println("██░█░██░░░░░░░░▓█████░░░░░░██████████░░▓█");
        System.out.println("██░▓█░██░░░░░░░░████▓░░░░░░█████████░░▓▓█");
        System.out.println("▓█░░█░░█▓░░░░░░░░▓▓░░░░░░░░████████▓░░▓██");
        System.out.println("░█░░█▓░▓██░░░░░░░░░░░░░░░░░███████▓░░█▓█▓");
        System.out.println("░██░███████▓░░░░░░░░░░░░░░██████████▓█▓█░");
        System.out.println("░▓█░██▓░░░▓███░░░░░░░░░░▓██████▓░░░▓██▓█░");
        System.out.println("░░███▓░░░░░░░███████████████▓░░░░░░░░██▓░");
        System.out.println("░░░██░░▓▓█▓▓▓░░░▓████████▓░░░░▓▓█▓▓░░██░░");
        System.out.println("░░░▓█░████████▓░░░░░░░░░░░░▓████████░▓█░░");
        System.out.println("░░░█▓▓███████████░░░░░░░░████████████░█▓░");
        System.out.println("░░░█░█████████████░░░░░░█████████████░██░");
        System.out.println("░░▓█░▓████████████░░░░░░█████████████░░█░");
        System.out.println("░░▓█░▓▓███████████░░░░░░███████████▓▓░░█░");
        System.out.println("░░▓█░░░▓█████████░░░░░░░░█████████▓░░░░█░");
        System.out.println("░░░█▓░░░████████░░░░░░░░░░████████░░░░██░");
        System.out.println("░░░██░░░░░█████░░░░████░░░░█████▓░░░░░█▓░");
        System.out.println("░░░░██░░░░░░░░░░░░██████░░░░░░░░░░▓░░██░░");
        System.out.println("░░░░▓████▓░░░░░░░░███▓██▓░░░░░░░░█████░░░");
        System.out.println("░░░░░▓█▓████▓░░░░░██░▓▓██░░░░▓████░██░░░░");
        System.out.println("░░░░░░░░▓█▓██░▓░░░██▓▓▓██░░█▓█████░░░░░░░");
        System.out.println("░░░░░░░░▓█░███▓░░░▓▓▓░▓░░░░░█▓██▓█░░░░░░░");
        System.out.println("░░░░░░░░▓█░██▓░░▓░░░░░░░░░▓░███▓▓█░░░░░░░");
        System.out.println("░░░░░░░░▓█░███▓███▓░░░░░▓███▓██░▓█░░░░░░░");
        System.out.println("░░░░░░░░██░░██░▓░█████████░▓▓█▓░▓█░░░░░░░");
        System.out.println("░░░░░░░░▓█░░▓██▓▓░░▓░█░█░▓░▓██░░░█░░░░░░░");
        System.out.println("░░░░░░░░░█▓░░████░▓░░▓░░▓▓███░░░██░░░░░░░");
        System.out.println("░░░░░░░░░▓█▓░░████████▓█████░░░██▓░░░░░░░");
        System.out.println("░░░░░░░░░░░██░░▓▓▓▓▓▓▓▓▓▓▓█░░░██░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░██░░▓█████▓██▓░░▓██░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░██░░░░░▓▓░░░░░███░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░██░░░░░░░░░░██▓░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░▓██░░░░░░░░██░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░██████████░░░░░░░░░░░░░░░");

    
    }
    
}
