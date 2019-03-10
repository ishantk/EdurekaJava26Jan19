package co.edureka.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println();
		System.out.println(">> Before Method Executed");
		
		if(method.getName().equals("bookRide")){
			
			Ride ride = (Ride)beanRef;
			
			System.out.println(inputs[0]+" | "+inputs[1]);
			
			int distance = (int)inputs[0];
			if(distance<=5){
				System.out.println(">> Driver Allocated");
			}else{
				System.out.println(">> No Driver Found for the Ride");
				ride.typeOfCab = 0; // no cab can be booked
			}
		}
		
		System.out.println("*******************");
		System.out.println();
		
	}

}
