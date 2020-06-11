
/**
 * Write a description of interface Predator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Predator extends Animal
{
    public abstract String getFood();
    
    public boolean isPeadator() {
        return true;
    }
}
