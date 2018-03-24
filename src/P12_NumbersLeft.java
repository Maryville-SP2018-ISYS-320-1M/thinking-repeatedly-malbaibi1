/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018
*/

public class P12_NumbersLeft {

 public static void main(String[] args) {
  for( int line = 0; line < 5; line++ ) {                                                      //loop to control number of lines
   int numberToWrite = line % 5 + 1 ;
   for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numberToWrite; numOfTimesPrinted++ )   //looop to print same number multiple times
   System.out.print( numberToWrite );
   System.out.println();

 }
 }
}
