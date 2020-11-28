public class ScaTriangle extends Triangle implements Shape {

   public void ScaTriangle (double area, double perimeter, double a, double b, double c) {
      super (area, perimeter, a,b,c);
   }
   
   public String ToString () {
      
      return "Scalene Triangle Perimeter: " + perimeter + " Area: " + area;
   }
}

//copy for the other triangles