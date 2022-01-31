import  java.lang.*;
import java.util.Scanner;
class Area
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     //Accept number of sides
     System.out.print("Enter the no.of sides in polygon:");
     int n=sc.nextInt();
     //Accept length of sides 
     System.out.print("Enter the length of side in polygon:");
     double ln=sc.nextDouble();
    
    double angle= Math.toRadians(180/n);
    angle=Math.tan(angle);
    double area=((ln*ln*n)/(4*angle));
    System.out.print("Area of polygon is:"+area);
  }
}