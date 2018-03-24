/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018 
*/

public class P13_NumbersRight {

 public static void main(String[] args) {
  int num=4;
  for( int line = 0; line < 5; line++ ) {                                                        //loop to control number of lines
   int numberToWrite = line % 5 + 1 ;
   for( int space = 0; space < num; space++ )                                                    //loop to control spaces in each line 
     System.out.print( " " );
     for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numberToWrite; numOfTimesPrinted++ )   //looop to print same number multiple times
     System.out.print( numberToWrite );
     System.out.println();
     num=num-1;
   
  }
 }

}
