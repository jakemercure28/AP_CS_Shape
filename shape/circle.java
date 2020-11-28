public class Circle implements Shape {
   private double perimeter;
   private double area;
   private double width;
   private double length;
   
   public Circle() {
   
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
}

//similar to rectangle and triangle