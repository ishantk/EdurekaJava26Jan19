
public class StringMethods {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE !! -> Modifying a string cannot be done !!
		String str1 = "This is Awesome";
		System.out.println("str1 is: "+str1);
		
		// PS: Performing a modification shall create a new String in the memory
		String str2 = str1.toUpperCase(); // We are performing string modification 
		
		System.out.println("str1 now is: "+str1);
		System.out.println("str2 is: "+str2);
		
		// Lets explore Built In String methods !!
		String str3 = "John, Jennie, Jim, Jack, Joe";
		//String str4 = str3.substring(5); // removes 0 to 4 i.e. less than 5
		String str4 = str3.substring(0, 5); // from 0 to less than 5 i.e. 4
		System.out.println("str4 is: "+str4);
		System.out.println(str3);
		int length = str3.length();
		System.out.println("str3 is "+length+" charcaters wide");
		
		//char ch = str3.charAt(0); // -> J
		char ch = str3.charAt(length-1);
		System.out.println("ch is: "+ch);
		
		//int idx = str3.indexOf('J');
		//int idx = str3.lastIndexOf('J');
		int idx = str3.lastIndexOf("Jim");
		System.out.println("idx is of Jim is: "+idx); // 14 -> Jim's J is on 14th Index |  If index is not available -> -1
		
		char[] chArr = str3.toCharArray();
		int count = 0;
		for(char chr : chArr){
			System.out.print(chr+"-");
			if(chr=='J'){
				count++;
			}
		}
		System.out.println();
		System.out.println("str3 has "+count+" J's");
		
		String[] strArr = str3.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		String songName = "SomeSong.mp3";
		if(songName.endsWith(".mp3")){ // startsWith
			System.out.println("Its an audio file. We can play it !!");
		}else{
			System.out.println("Sorry!! Invalid File Format to be played !!");
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println("Its a Valid Email");
		}else{
			System.out.println("Its an InValid Email");
		}
		
		String data = "Call My Dad";
		if(data.contains("Call") && data.contains("Dad")){
			System.out.println("Establish a Call");
		}else{
			System.out.println("Sorry !!");
		}
		
		String str5 = str3.replace('J', 'K');
		System.out.println("str5 is: "+str5);
	}

}
