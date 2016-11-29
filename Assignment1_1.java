package ASSIGNMENTS;
//Write a program to print the sum of two numbers without using + operator. Other operators have to be used.
public class Assignment1_1 {

	public static void main(String[] args) 
	{
		int a = 25;
		int b = 16;
	
		int carry;
        while(b!=0)
        {
            carry = a & b;	// Perform Binary AND operation on a and b and assign to carry
            a = a ^ b;		// Perform EXOR on a and b and assign to new a
            b = carry << 1; // Perform left binary shift on carry and assign to b 
        }
    
	System.out.println("Sum of a and b is :"+a);
	}

}
