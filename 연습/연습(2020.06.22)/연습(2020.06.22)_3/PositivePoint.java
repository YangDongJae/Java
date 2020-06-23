class PositivePoint extends Point {
    public PositivePoint() {
        super(0, 0);
    }

    public PositivePoint(int x, int y) {
        super(x, y);
        if(x<0 || y<0){
            move(0,0);
        }
        else{
            return;
        }
    }

    public String toString() {
        return ("("+getX()+","+getY()+")의 점");
    }

    protected void move(int x, int y) { 
        if(x<0 || y<0){
            return;
        }
        else{
            super.move(x, y);
        }	
    }

}