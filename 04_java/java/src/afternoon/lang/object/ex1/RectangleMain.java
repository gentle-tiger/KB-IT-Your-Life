package afternoon.lang.object.ex1;

import java.awt.*;

public class RectangleMain {
    public static void main(String[] args) {

    Rectangle rectangle1 = new Rectangle(20, 30 );
    Rectangle rectangle2 = new Rectangle(20, 30 );

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));



    }
}
