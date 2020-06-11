
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    public void sleep(){
        System.out.println(this.name + "zzzz");
    }
    
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
