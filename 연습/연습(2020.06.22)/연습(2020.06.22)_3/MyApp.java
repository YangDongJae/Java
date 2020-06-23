
/**
 * Write a description of class MyAPp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        // ColorPoint cp = new ColorPoint(5, 5, "Yellow");

        // cp.setXY(10,20);
        // cp.setColor("RED");
        // String str = cp.toString();
        // System.out.println(str + "입니다.");

        // ColorPoint zeroPoint = new ColorPoint();
        // System.out.println(zeroPoint.toString() + "입니다.");

        // ColorPoint cp = new ColorPoint(10,10);
        // cp.setXY(5,5);
        // cp.setColor("RED");
        // System.out.println(cp.toString() + "입니다.");

        // Point3D p = new Point3D(1,2,3);
        // System.out.println(p.toString() + "입니다.");

        // p.moveUp();
        // System.out.println(p.toString() + "입니다.");
        // p.moveDown();
        // p.move(10,10);
        // System.out.println(p.toString() + "입니다.");

        // p.move(100,200,300);
        // System.out.println(p.toString() + "입니다.");
        
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");
        
        p.move(-5,-5);
        System.out.println(p.toString() + "입니다.");
        
        
        PositivePoint p2 = new PositivePoint(-10 , -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
