public class Crocodile extends Predator implements Barkable
{
    public String getFood(){
        return "beef";
    }

    public void bark(){
        System.out.println("???");
    }
}