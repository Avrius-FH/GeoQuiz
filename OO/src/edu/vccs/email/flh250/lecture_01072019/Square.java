package edu.vccs.email.flh250.lecture_01072019;

public class Square {

   private double side ;

   public Square() {

   }

   public Square(double side) {
      setSide(side);
   }

   public double getSide() {
      return side;
   }

   public void setSide(double side) {
      if ( side < 0) {
         this.side = side;
      }
   }

   @Override
   public String toString() {
      return "Square{" +
          "side=" + side +
          '}';
   }
}
