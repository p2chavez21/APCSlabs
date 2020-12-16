package Dinosaur1;

/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver
{
    public static void main(String[] args)
    {
        Dinosaur d1 = new Dinosaur();
        Dinosaur d2 = new Dinosaur("TRex");
        
        Dinosaur[] pop = new Dinosaur[10];
        
        for(int i=0; i<pop.length; i++) //loop
        {
            pop[i] = new Dinosaur("TRex");
            System.out.println(pop[i].toString());
        }
        
    }
}
