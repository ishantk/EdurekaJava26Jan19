package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Util {

	public static void main(String[] args) {
		
		// Date is the System Date here
		Date date = new Date();
		String today = date.toString();
		System.out.println("Today is: "+date);
		System.out.println("Today is: "+today);
		
		//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		//SimpleDateFormat format = new SimpleDateFormat("hh-mm-ss");
		//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss");
		SimpleDateFormat format = new SimpleDateFormat("yyyy/dd/MM | hh:mm:ss");
		String newDate = format.format(date);
		System.out.println("New Date is: "+newDate);
		
		Calendar calendar = Calendar.getInstance();
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // 0(Jan) to 11(Dec) 
		int yy = calendar.get(Calendar.YEAR);
		
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		System.out.println(dd+"/"+(mm+1)+"/"+yy+" | "+hh+":"+mi+":"+ss);
		
							
		Scanner scanner = new Scanner(System.in); // To Read from Console
		System.out.println("Enter Number1:");
		int num1 = scanner.nextInt();
		System.out.println("Enter Number2:");
		int num2 = scanner.nextInt();
		System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1+num2));

	}

}
