
public class Loops {

	public static void main(String[] args) {
		
		int num = 7;
		int i = 1;
		
		System.out.println("===Table of 7===");
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; 
		System.out.println(num+" "+i+"'s are "+(num*i));
		System.out.println("==============");
		
		// Problem Identification : We are writing the same code again and again !!
		// Solution : To Use a LOOP !! -> while, doWhile, for
		
		// Loops : Starting Point, Ending Point(as a condition), Expression (To Reach from Starting Point to Ending Point)
		
		// while loop
		num = 5;
		i = 111;
		System.out.println("===Table of 5===");
		while(i<=10){ // Condition Checking is in the Beginning
			System.out.println(num+" "+i+"'s are "+(num*i));
			++i; 
		}
		System.out.println("==============");
		
		// do while loop
		num = 3;
		i = 111; // even if condition will fail, statements will be executed at least once !!
		System.out.println("===Table of 3===");
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			++i; 
		}while(i<=10); // Condition Checking is in the End
		System.out.println("==============");
		
		// for loop
		System.out.println("===Table of 9===");
		
		for(int n=9, j=1; j<=10; j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		System.out.println("==============");
		
		// Enhanced for loop -> upcoming part !!
	}

}
