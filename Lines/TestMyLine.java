public class TestMyLine {
    public static void main(String[] args) {
        // Creating a MyLine object using the start and end in the instructions
        MyLine line1 = new MyLine(1, 1, 2, 2);
        System.out.println("Initial Line: " + line1);

        // Testing the getBegin and getEnd methods
        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());

        // This should say the begin point of the X and Y, which means 1 and 1
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());

        // This will be 2 and 2 since it shows the ending part
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        // Testing out the setBegin/setEnd by putting different places on here
        line1.setBegin(new MyPoint(3, 3));
        line1.setEnd(new MyPoint(5, 5));
        System.out.println("After updating points: " + line1);

        // BeginXY and EndXY is next to test
        line1.setBeginXY(2, 2);
        line1.setEndXY(4, 4);
        System.out.println("After setting Beginning and end XY: " + line1);

        // Test getBeginXY and getEndXY
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("Begin XY: [" + beginXY[0] + ", " + beginXY[1] + "]");
        System.out.println("End XY: [" + endXY[0] + ", " + endXY[1] + "]");

        // Now we test getLength for the length of the line
        System.out.println("Length of the line: " + line1.getLength());

        // Testing the gradient to end it off
        System.out.println("Gradient of the line: " + line1.getGradient());

    }
}



