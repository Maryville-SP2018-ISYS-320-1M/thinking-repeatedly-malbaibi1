/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018 
*/

public class P11_TableMakerFlip {

 public static void main(String[] args) {
  for( int rowNumber = 5; rowNumber >= 1; rowNumber-- ) {                //set the loop in decreasing order
   for( int columnNumber = 1; columnNumber <= 10; columnNumber++ ) {
    System.out.print( (rowNumber * columnNumber ) + "\t");
   }
   System.out.println();
  }
 }

}
