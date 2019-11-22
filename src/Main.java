public class Main {


    public static void main(String[] args) {
        var rectangle1 = new Rectangle(20, 30);
        double[] heights = {15, 25, 32, 67, 98};
        double[] width =   {23, 14, 64, 95, 72};

        // rectangle1 object demonstrates functions
        System.out.println("Initial object creation and introduction: ");
        rectangle1.introduce();
        System.out.println("My area:" + rectangle1.calculateRectArea());
        System.out.println("My perimeter: :" + rectangle1.calculateRectPerimeter());
        System.out.println("");

        // Demo 1
        System.out.println("First method call:");
        System.out.println("My area:" + rectangle1.calculateRectArea(40, 50));
        System.out.println("My perimeter: :" + rectangle1.calculateRectPerimeter(40, 50));
        System.out.println("");

        // Demo 2
        System.out.println("Second method call: ");
        System.out.println("My area:" + rectangle1.calculateRectArea(15, 35));
        System.out.println("My perimeter: :" + rectangle1.calculateRectPerimeter(15, 35));
        System.out.println("");

        //Demo 3
        System.out.println("Third method call:");
        System.out.println("My area:" + rectangle1.calculateRectArea(7.5, 6.8));
        System.out.println("My perimeter: :" + rectangle1.calculateRectPerimeter(7.5, 6.8));
        System.out.println("");

        //Demo 4
        System.out.println("Fourth method call: ");
        System.out.println("My area:" + rectangle1.calculateRectArea(12, 75));
        System.out.println("My perimeter: :" + rectangle1.calculateRectPerimeter(12, 75));
        System.out.println("");

        // for loop task
        System.out.println("For loop with array task: ");
        for (int i=0;i < heights.length;i++ ) {
            System.out.println("Loop count: " + (i+1));
            System.out.println("Width: " + width[i] + " Height: " + heights[i]);
            System.out.println("My area:" + rectangle1.calculateRectArea(width[i], heights[i]));
            System.out.println("");
        }

        //Calculate based on inputs
        rectangle1.calculateWithInputs();
    }
}
