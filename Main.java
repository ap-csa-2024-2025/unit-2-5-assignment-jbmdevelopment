import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(10.1);
    Circle circle2 = new Circle(14);
    Circle circle3 = new Circle(20.5);
    System.out.println(circle1.toString());  
    System.out.println(circle2.toString());  
    System.out.println(circle3.toString());
    Scanner input = new Scanner(System.in);
    System.out.println("Type a number for length and width:");
    double square = input.nextDouble();
    System.out.println("Type a length");
    double length = input.nextDouble();
    System.out.println("Type a width:");
    double width = input.nextDouble();
    Rectangle r1 = new Rectangle(square);
    Rectangle r2 = new Rectangle(length, width);
    System.out.println(r1.toString());
    System.out.println(r2.toString());
    System.out.println("Type a side length");
    double sideLen = input.nextDouble();
    RegularPolygon triangle = new RegularPolygon(sideLen);
    RegularPolygon sq = new RegularPolygon(4, sideLen);
    System.out.println(triangle.toString());
    System.out.println(sq.toString());
  }
}
