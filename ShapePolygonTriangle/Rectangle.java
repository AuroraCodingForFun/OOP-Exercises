/*
  Shape (astratta): name; astratto double area(); astratto double perimeter().
  Polygon extends Shape: campo int sides; final int sides().
  Triangle extends Polygon: lati a, b, c; area() con Erone; perimeter().
  Quadrilateral extends Polygon: lati a, b, c, d; perimeter(); area() astratto (non tutti i quadrilateri hanno formula unica).
  Rectangle extends Quadrilateral: width, height; area().
*/

package ShapePolygonTriangle;

public class Rectangle extends Quadrilateral {
    private double width;
    private double height;

    public Rectangle( double width, double height)
    {
        super("Rectangle", 4, height, width, height, width);
        this.width=width;
        this.height=height;
    }
    public double perimeter()
    {
        return 2*(width+height);
    }
    public double area()
    {
        return width*height;
    }
}
