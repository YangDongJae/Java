
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main (String[] args){
        GeometricalFigure[] array = new GeometricalFigure[5];

        array[0] = new Circle();
        array[1] = new Triangle();
        array[2] = new Rectangle();
        array[3] = new Rectangle();        
        array[4] = new Circle();        

        for(int i = 0 ; i < array.length; i ++){
            array[i].draw();

        }

        //PhoneInterface[] figure;
        //figure = (PhoneInterface)array;
        //(GeometricalFigure)figure = array;

        PhoneInterface[] figure = new PhoneInterface [5];

        figure[0] = new Circle();
        figure[1] = new Triangle();
        figure[2] = new Rectangle();
        figure[3] = new Rectangle();        
        figure[4] = new Circle();    

        for(int i = 0 ; i < array.length; i ++){
            ((GeometricalFigure)figure[i]).draw();

        }
    }
}
