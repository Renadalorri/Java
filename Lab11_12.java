
package lab11_12;

import java.util.Scanner;

public class Lab11_12 {

 
    public static  String lessThan100(  int number ) throws  Exception
	{
	if ( number  >=  100 ){
throw new Exception("number is too large");

	// Return the number if the number is less than 100
        }
return  Integer.toString(number);
	} 
    
    public static  String lessThan50(  int number ) throws  Exception
	{
	if ( number  >=  50 &&  number < 100 )
 //write a statement to throws the exception that the number is between 50 and 100."
            throw new Exception("number is between 50 and 100");
        
	else if ( number  >=  100 )
              lessThan100( number );
// Return the number if the number is less than 50
return Integer.toString(number);
	}
	public static  void  main( String  args[] ) throws Exception
	{ Scanner input=new Scanner(System.in);
        // input the number from user in the  try block 
        try{
            System.out.println("enter a number ");
            int num=input.nextInt();
            System.out.println(lessThan50(num));
        }
        // write the catch  (InputMismatchException, Exception)
catch(Exception m){
    System.out.println(m.toString());
}
 
// write the catch  (InputMismatchException, Exception)
	} //  end main method


   
        
}             
        
        
        
 