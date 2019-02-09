final class X{		  // which cannot be extended
	final void fun(){ // which cannot be overrided by child anymore
		
	}
}

class Y{// extends X{
	/*void fun(){ // Overriding becomes error
		
	}*/
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		int x = 10;
		x = 101; // update the data in x !! Allowed and hence, variable !!
		
		final int y = 10; // Read Only Variable !!
		//y  = 101; // updating data in final is not allowed. It kind of is a constant !!

	}

}

// final as a variable	|	cannot be modified
// final as a method	|	cannot be re-defined in child
// final as a class		|	cannot be exetnded