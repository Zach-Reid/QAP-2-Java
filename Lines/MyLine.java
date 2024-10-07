public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Start by putting it together
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // The get functions
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    // The functions for setting start and end
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getting the beginning coordinates
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    // Setting the beginning X and Y
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Now getting the end X and Y
    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setting the end X and Y
    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Getting beginning coordinates as an array
    public int[] getBeginXY() {
        return new int[] { begin.getX(), begin.getY() };
    }

    public void setBeginXY(int x, int y) {
        setBeginX(x);
        setBeginY(y);
    }

    // Now getting end coordinates as an array
    public int[] getEndXY() {
        return new int[] { end.getX(), end.getY() };
    }

    public void setEndXY(int x, int y) {
        setEndX(x);
        setEndY(y);
    }

    // Get the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // The gradient of the line using Math.atan2
    public double getGradient() {
        double yDiff = end.getY() - begin.getY();
        double xDiff = end.getX() - begin.getX();
        return Math.atan2(yDiff, xDiff);
    }

    // String representation

    public String toString() {
        return "MyLine[begin=(" + begin.getX() + "," + begin.getY() + "),end=(" + end.getX() + "," + end.getY() + ")]";
    }
}



