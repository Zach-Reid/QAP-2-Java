public class TestMyRectangle {
    public static void main(String[] args) {
        // Create the MyPoints for the corners
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(5, 1);
        
        // Making a MyRectangle instance
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);
        System.out.println("Initial Rectangle: " + rectangle);
        
        // Showing the getTopLeft and getBottonRight commands
        System.out.println("Top Left Point: " + rectangle.getTopLeft());
        System.out.println("Bottom Right Point: " + rectangle.getBottomRight());
        
        // Testing getWidth and getHeight
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        
 
        // Testing another setting of the top left and bottom right
        rectangle.setTopLeft(new MyPoint(0, 6));
        rectangle.setBottomRight(new MyPoint(3, 0));
        System.out.println("Rectangle after updating: " + rectangle);

        System.out.println("New Width: " + rectangle.getWidth());
        System.out.println("New Height: " + rectangle.getHeight());
        
    }
}



