/*
 *The program creative schedule.
 * the schedule includes Monday and Tuesday morning class.
 * when creating schedule, The program get input from users.
 * Then, the program demostrates Monday nad Tuesday marning class schedule.
 * @author Muhammed Naci Dalkrian
 * @date  20.02.2018 
 */
import java.util.Scanner;
public class Lab02b
{
   public static void main( String [] args )
   {  
      //Variables
      int studentNumber; 
      String name;
      String firstCourse;
      String secondCourse;
      String thirdCourse;
      String fourthCourse;
      
      //Input from users 
      Scanner scan = new Scanner( System.in );
      
      System.out.print( "Please enter your ID(Student Number) : " );
      studentNumber = scan.nextInt();
      scan.nextLine();
      
      System.out.print( "Please enter  your fullname :" );
      name = scan.nextLine();
   
      System.out.print( "Please enter  your the first course on Monday :" );
      firstCourse = scan.nextLine();
      
      System.out.print( "Please enter  your the second course on Monday :" );
      secondCourse = scan.nextLine();
      
      System.out.print( "Please enter  your the first course on Tuesday :" );
      thirdCourse = scan.nextLine();
      
      System.out.print( "Please enter  your the second course on Tuesday :" );
      fourthCourse = scan.nextLine();
      
      //Programe Code
      System.out.println( "Student information : " );
      System.out.println( "Student ID : " + studentNumber );
      System.out.println( "Student fullname : " + name );
      System.out.println( "" );
      System.out.println( "Course information" );
      System.out.println( "Student's fist course : " + firstCourse );
      System.out.println( "Student's second course : " + secondCourse );
      System.out.println( "Student's third course : " + thirdCourse );
      System.out.println( "Student's fourth course : " + fourthCourse );
      System.out.println( "" ); 
      System.out.print( "the sutudent is " + "\"" + name + "\"" + "." );
      System.out.println( " His/her ID is " + studentNumber );
      System.out.println( "Schedule" );      
      System.out.printf( "| %-6s| %-6s| %-6s|\n","Hour","Mon","Tues" );
      System.out.printf( "| %-6s|%-7s|%-7s|\n","8:40",firstCourse, thirdCourse );
      System.out.printf( "| %-6s|%-7s| %-6s|\n","9:40",firstCourse, "-" );
      System.out.printf( "|%-7s| %-6s|%-7s|\n","10:40","-",fourthCourse );
      System.out.printf( "|%-7s|%-7s| %-6s|\n","11:40",secondCourse, "-" );
      System.out.println( "" );
      System.out.println( "---End of Lab02b---" );
      
      
   }
}      
      
      
      