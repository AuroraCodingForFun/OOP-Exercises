/*
  Shape (astratta): name; astratto double area(); astratto double perimeter().
  Polygon extends Shape: campo int sides; final int sides().
  Triangle extends Polygon: lati a, b, c; area() con Erone; perimeter().
  Quadrilateral extends Polygon: lati a, b, c, d; perimeter(); area() astratto (non tutti i quadrilateri hanno formula unica).
  Rectangle extends Quadrilateral: width, height; area().
*/

package ShapePolygonTriangle;

public class Triangle extends Polygon{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c)
    {
        super("Triangle", 3);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double perimeter()
    {return this.a+this.b+this.c;}
    public double area()
    { double p= perimeter()/2;
        return Math.sqrt((p)*(p- this.a)*(p-this.b)*(p-this.c));}
}
