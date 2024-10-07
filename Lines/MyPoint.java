public class MyPoint {
    private int x;
    private int y;



    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Getting the X
    public int getX() {
        return x;
    }

    //Now setting the X
    public void setX(int x) {
        this.x = x;
    }

    //Getting the Y as well
    public int getY() {
        return y;
    }
    //Now setting the Y, too
    public void setY(int y) {
        this.y = y;
    }
    //Both this and the code below are for the distance
    public double distance(MyPoint other) {
        int xDiff = this.x - other.x;
        int yDiff = this.y - other.x;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }




}

