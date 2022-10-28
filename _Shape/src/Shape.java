package src;

abstract public class Shape
{
  String name;

  public Shape(String _name)  {this.name = _name;}

  public String getName() {return this.name;}
  public void setName(String _name) {this.name = _name;}

  abstract public double calculateArea();
}


/*
Concepts:
abstraction
inheritance
encapsulation

keywords:
super
override
*/
