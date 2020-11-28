public class Rectangle implements Shape {
   private double perimeter;
   private double area;
   private double length;
   private double width;
   
   public Rectangle(double width, double length) {
   
      this.width = width;
      this.length = length;
   }
   
   public double getPerimeter() {
      
      perimeter = ((2 * length) + (2 * width));
      return perimeter;
   }
   
   public double getArea() {
   
      area = length * width;
      return area;
   }
}