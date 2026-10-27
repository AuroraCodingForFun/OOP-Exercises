/*
  Shape (astratta): name; astratto double area(); astratto double perimeter().
  Polygon extends Shape: campo int sides; final int sides().
  Triangle extends Polygon: lati a, b, c; area() con Erone; perimeter().
  Quadrilateral extends Polygon: lati a, b, c, d; perimeter(); area() astratto (non tutti i quadrilateri hanno formula unica).
  Rectangle extends Quadrilateral: width, height; area().
*/

package ShapePolygonTriangle;

public abstract class Quadrilateral extends Polygon {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral(String nome, int sides, double a, double b, double c, double d)
    {
        super(nome, sides);
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public double perimeter()
    {return a+b+c+d;}
    abstract double area();
}
