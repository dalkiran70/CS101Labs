/*
 *Firtly, the triangular prism is created.
 *Secondly, users enter sides values of a triangular prism.
 *And then, the program calculate total surface area of a triangular prism.
 *Also, the program calculate the required amount of total color to paint.
 * 
 * 
 * @author Muhammed Naci Dalkrian
 * @date  20.02.2018 
 */
import java.util.Scanner;
public class Lab02c
{
   public static void main( String[] args )
   { 
    
     //Constant
     final double COLOR_AMOUNT = 0.01 ; //To per centimeter square     
     
     //Variables
     double sideA; //sides
     double sideB; //sides
     double sideC; //sides
     double height;
     double length;
     double totalArea;
     int liters;
   
     //Inpur from users
     Scanner scan = new Scanner( System.in );
     
     System.out.print( "Please enter one part of the three sides of the triangle:" );
     sideA = scan.nextDouble();
     
     System.out.print( "Please enter another of the three sides of the triangle:" );
     sideB = scan.nextDouble();
      
     System.out.print( "Please enter other of the three sides of the triangle:" );
     sideC = scan.nextDouble();
      
     System.out.print( "Please enter the height of triangle:" );
     height = scan.nextDouble();
      
     System.out.print( "Please enter the length of the triangular prism:" );
     length = scan.nextDouble();
     
     //Calculating area and required liters
     totalArea = ( sideB * height ) + (( sideA + sideB + sideC ) * length );
     liters = (int) ( totalArea * COLOR_AMOUNT ) ;
      
     //program Code
     System.out.println( "We will paint a triangular prism" );
     System.out.println( "The height of the triangle is " + height ); 
     System.out.println( "The sides of the triangle are  " + sideA + ", " + sideB + " and " + sideC );
     System.out.println( "The length of the triangular prism is " + length );
     System.out.print( "The area of the prism with respect to given parameters " );
     System.out.println( "is " + totalArea );
     System.out.println( "The required amount of color to paint one centimeter square area" );
     System.out.println( "is " + COLOR_AMOUNT + " liters" );
     System.out.print( "The total color amount required for panting" );
     System.out.println( "is " + liters + " liters" );                   
     System.out.println( "" );
     System.out.println( "---End of Lab02c---" );
                           
    }
}
                      
      