/*
  Shape (astratta): name; astratto double area(); astratto double perimeter().
  Polygon extends Shape: campo int sides; final int sides().
  Triangle extends Polygon: lati a, b, c; area() con Erone; perimeter().
  Quadrilateral extends Polygon: lati a, b, c, d; perimeter(); area() astratto (non tutti i quadrilateri hanno formula unica).
  Rectangle extends Quadrilateral: width, height; area().
*/

package ShapePolygonTriangle;
public abstract class Polygon extends Shape{
    private int sides;
    public Polygon(String nome, int sides)
    {
        super(nome);
        this.sides=sides;
    }
    public final int sides()
    {return sides;}

}
