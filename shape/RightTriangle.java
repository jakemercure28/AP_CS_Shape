public class RightTriangle extends Triangle implements Shape {

   public void RightTriangle (double area, double perimeter, double a, double b, double c) {
      super (area, perimeter, a,b,c);
   }
   
   public String ToString () {
      
      return "Right Triangle Perimeter: " + perimeter + " Area: " + area;
   }
}

//copy for the other triangles