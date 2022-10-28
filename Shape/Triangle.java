public class Triangle extends Shape {
  // Members
  double a;
  double b;
  double c;

  // Constructors
  // Default Constructor
  public Triangle()
  {
    super("");
    this.a = 0.0;
    this.b = 0.0;
    this.c = 0.0;
  }

  // Default Constructor 2
  public Triangle(String _name){super(_name);}

  // Initializer Constructor
  public Triangle(double _a, double _b, double _c, String _name)
  {
    super(_name);
    if (_a >= 0 && _b >= 0 && _c >= 0)
    {
      this.a = _a;
      this.b = _b;
      this.c = _c;
    }
  }

  // Methods
  @Override
  public double calculateArea()
  {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  // Getters
  public double getA() {return a;}
  public double getB() {return b;}
  public double getC() {return c;}
  //public String getName() {return name;}

  // Setters
  public void setA(double _a) {this.a =  _a;}
  public void setB(double _b) {this.b = _b;}
  public void setC(double _c) {this.c = _c;}
  //public void setName(String _name) {this.name =  _name;}

  // Helpers
  public void printTriangle()
  {
    System.out.println(
    "Name of Triangle: "  + this.getName() +
    ", Vertexes = (" + this.getA() + ", " + this.getB() + ", " + this.getC()
    + ")" + "Area of my Triangle = " + this.calculateArea()

    );
  }
}
