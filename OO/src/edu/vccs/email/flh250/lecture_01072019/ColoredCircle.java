package edu.vccs.email.flh250.lecture_01072019;

public class ColoredCircle extends Circle {

   String color;

   @Override
   public String toString() {
      return "ColoredCircle{" +
          "color='" + color + '\'' +
          "} " + super.toString();
   }

   public ColoredCircle (){

   }

   public ColoredCircle(double radius, String color){
      super(radius);
      this.color = color ;
   }
}
