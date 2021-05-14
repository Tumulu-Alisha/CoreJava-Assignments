package com.java.org;
abstract class base{
    public base() {
        System.out.println("Makes Shape");    }
    abstract public void draw();
}
class line extends base{
    public void draw() {
        System.out.println("Line drawn");
    }
}
class rectangle extends base{
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
 class cube extends base{
    public void draw() {
        System.out.println("Cube drawn");
    }
}
public class Shapes {

    public static void main(String[] args) {
      line l= new line();
      l.draw();
      rectangle r= new rectangle();
      r.draw();
      cube c= new cube();
      c.draw();
    }
}