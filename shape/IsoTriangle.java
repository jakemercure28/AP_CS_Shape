public class IsoTriangle extends Triangle implements Shape {

   public void IsoTriangle (double area, double perimeter, double a, double b, double c) {
      super (area, perimeter, a,b,c);
   }
   
   public String ToString () {
      
      return "Isoscles Triangle Perimeter: " + perimeter + " Area: " + area;
   }
}

//copy for the other triangles