public class Square extends Rectangle implements Shape {

   public Square(double length) {
      
      super (length, length);
   }
   
   public double getPerimeter() {
      return super.getPerimeter();
   }
     
   public double getArea() {
      return super.getArea();
   }
}