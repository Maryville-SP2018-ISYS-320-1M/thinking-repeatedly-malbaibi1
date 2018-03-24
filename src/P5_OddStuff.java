/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/

/* 1. Your predicted output 

      4              //number=4
      2              //number=number/2=4/2=2
*/


public class P5_OddStuff {
 public static void main(String[] args) {
     int number = 4;
     for( int count=1; count<=number; count++ ) {
            System.out.println( number );
            number = number / 2;
     }

 }

}



/* 3. Were you correct? Explain any differences and what you learned.

      Prediction was exactly wright. As the for loop will be run on both lines as both are in brackets.
*/