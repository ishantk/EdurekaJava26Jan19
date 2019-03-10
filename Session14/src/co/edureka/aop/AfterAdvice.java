package co.edureka.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object o1, Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println();
		System.out.println(">> After Method Executed");
		
		if(method.getName().equals("bookRide")){
			
			Ride ride = (Ride)beanRef;
			if(ride.typeOfCab!=0){
				System.out.println(">> Driver Details FYR !!");
				System.out.println(">> Driver Name:\tJohn Watson");
				System.out.println(">> Driver Phone:\t+91 99999 88888");
				System.out.println(">> Driver Vehicle:\tDL10AB1234");
			}else{
				System.out.println(">> Sorry !! No Drivers Available !!");
			}
			
		}
		
		System.out.println("*******************");
		System.out.println();
	}

}
