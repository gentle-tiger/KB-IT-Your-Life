package afternoon.lang.object.ex1;

import java.util.Objects;

public class Rectangle {
    private int width ;
    private int height ;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        toString();
    }

    @Override
//    여기서 o는 rectangle2 객체(Rectangle 클래스로 만들어진 인스턴스)가 들어오게 된다.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


}
