/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018   
*/

/* 1. Your predicted output 

      T-minus  
      5, 4, 3, 2, 1, Blastoff! 
*/

public class P8_Launch {
 public static void main(String[] args) {
            System.out.println("T-minus ");        //line1
            for( int i=5; i>=1 ; i-- ) {           //loop is in decreasing order
            System.out.print( i + ", " );          //line2
        }
        System.out.println( "Blastoff!" );         //line3
 }
}



/* 3. Were you correct? Explain any differences and what you learned.
      prediction is correct. Line1 will print T-minus and jump to next line. 
      Line2 will print the numbers in same line. Line3 will print Blastoff! and jump to next line.
*/