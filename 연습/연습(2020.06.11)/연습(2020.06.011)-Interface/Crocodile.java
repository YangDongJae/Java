public class Crocodile extends Animal implements BarkablePredator
{
    public String getFood(){
        return "beef";
    }
    
    public void bark(){
        System.out.println("???");
    }
}