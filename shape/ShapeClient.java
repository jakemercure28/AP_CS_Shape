public class ShapeClient {
  
   public static void main (String [] args) {
   
       Square Squareone = new Square (5);
       Square Squareone = new Square (46.2);
       
       Rectangle three = new Rectangle (5);
       Rectangle four = new squaRectanglere (5);
       
       Circle five = new Circle (5);
       Circle six = new Circle (5);
       
       RightTriangle seven = new RightTriangle (5,);
       RightTriangle eight = new RightTriangle (5);
       
       IsoTriangle nine = new IsoTriangle (5);
       IsoTriangle ten = new IsoTriangle (5);
       
       EqTriangle nine = new EqTriangle (5,5,5);
       EqTriangle ten = new EqTriangle (2,2,2);
       
       ScaTriangle nine = new ScaTriangle (5,2,7);
       ScaTriangle ten = new ScaTriangle (18,28,3);
       
       double [] shapeArea = new double[shape];
       
       public void smallestArea(double[] shapeArea) {
          double min = shapeArea[0];
          for (int i = 0; i < shapeArea.length; i++) {
             if (shapeArea[i] < min) {
                min = shapeArea[i];
             }
          }
       }
       
      
   
   }
}