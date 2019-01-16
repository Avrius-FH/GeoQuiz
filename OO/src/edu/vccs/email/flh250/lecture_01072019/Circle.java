package edu.vccs.email.flh250.lecture_01072019;

public class Circle extends Shape implements Center {

  private double radius ;

   @Override
   public void setCenter(double x, double y) {

   }

   @Override
   public double getCenterX() {
      return 0;
   }

   @Override
   public double getCenterY() {
      return 0;
   }

   public Circle (){

  }

  public Circle (double radius){
     this.radius = radius ;
  }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
     if ( radius < 0) {
        this.radius = radius;
     }
     else {
        this.radius = 0.0;
     }
   }

   public double getCircum (){
     return 2 * Math.PI * getRadius() ;
   }

   @Override
   public String toString() {
      return "Circle{" +
          "radius=" + radius +
          '}';
   }

   public double getArea () {
     return Math.PI * (getRadius() * getRadius()) ;
   }
}
