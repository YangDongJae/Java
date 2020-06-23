public class Point3D extends Point{
    private int z;

    Point3D(int x,int y , int z){
        super(x , y);
        this.z = z;
    }

    public void moveUp(){
        this.z = z + 1;
    }

    public void moveDown(){
        this.z = z - 1;
    }

    public void move(int x, int y, int z){
        move(x,y);
        this.z = z;
    }

    public String toString() {
        return ("("+getX()+","+getY()+ ","+ z + ")의 점");
    }
}