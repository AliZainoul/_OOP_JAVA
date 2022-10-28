public class main
{
  public static void main(String[] args)
  {
    Shape c = new Circle(3, "my_circle");
    Shape t = new Triangle(3,4,5,"my_Triangle");
    Shape r = new Rectangle(2.5, 6.8, "my_rectangle");
    Shape s = new Rectangle(2, 2, "my_square");

    Circle cc = new Circle(3, "my_circle1");
    Triangle tt = new Triangle(3,4,5,"my_Triangle1");
    Rectangle rr = new Rectangle(2.5, 6.8, "my_rectangle1");
    Rectangle ss = new Rectangle(2, 2, "my_square1");

    ((Circle) c).printCircle();
    ((Triangle) t).printTriangle();
    ((Rectangle) r).printRectangle();
    ((Rectangle) s).printRectangle();

    rr.printRectangle();
    tt.printTriangle();
    cc.printCircle();
    ss.printRectangle();

  }
}
