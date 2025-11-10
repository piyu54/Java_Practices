package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// Bitwise Operators

		/*
		 * ...512 256 128 64 32 16 8 4 2 1 bitwise operator works bit by bit
		 * 
		 * denote by & true(1)& false(0)
		 */

		System.out.println("---------Bitwise Operator----------");
		System.out.println("Decimal to Binary");
		int a = 125;

		System.out.println(Integer.toBinaryString(a));

		System.out.println("-------------Operation with &---------------");

		System.out.println(4 & 23);
		System.out.println(14 & 43);

		System.out.println("-------------Operation with |-------------");

		System.out.println(4 | 23);
		System.out.println(14 | 43);
		
/*	12&15
    11|13&12
    17&7&49
    XOR
    */
		
		System.out.println("Operations");
		System.out.println("-------------First-------------");
		System.out.println(12&15);
		/*00001100 (12) 00001111(15) rule 1 & 1 = 1, else 0  
		 *  00001100   = 12*/
		
		System.out.println("-------------Second-------------");
		System.out.println(11|13&12);
		
		/*In Java, & has higher precedence than |
		 * 13	00001101
          12	00001100
      (13 & 12) 00001100  = 12
 		OR (|): 1 | 0 = 1, 1 | 1 = 1
 		
 				00001011
 				00001100

  				00001111  = 15
 */
		System.out.println("-------------Third-------------");
		/*(17 & 7) & 49
		 *
	17       00010001 
	7        00000111 
	         00000001 = 1
	         
	        rule 1 & 1 = 1, else 0  
		1	00000001
		49	00110001
		    00000001 = 1
		   

		 */
		 System.out.println(17&7&49);
		
		 /*Bitwise XOR
		 Bits
		 5 ^ 3 = 6*/
		 System.out.println("-------------XOR-------------");
		 /*rule
		  * 	0 0 0
		  * 	1 0 1
		  * 	0 1 1
		  * 	1 1 0
		 	*/	
		 System.out.println(2^4);
		 System.out.println(5^8);
		 System.out.println(5^5);
		 System.out.println(6^4);
		 
		 System.out.println("-------------( ~ NOT single operand(unary)-------------");
		 
		 int p=2;
		 int v=-8;
		 System.out.println(~p);//1 se up but in minus
		 System.out.println(~v);//1 se down but in plus
		 
		 System.out.println("-------------(<< left shift)-------------");
		 System.out.println(4<<2);
		 System.out.println(14<<5);
		 

		 System.out.println("-------------(>> right shift)-------------");
		 System.out.println(4>>2);
		 System.out.println(14>>5);
		 System.out.println(2>>3);

	}

}
